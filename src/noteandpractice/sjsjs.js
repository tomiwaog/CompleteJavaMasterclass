if(Storage.user.get("phone")  && Storage.user.get("email")){
  var otp=updateOtp();
  context.variables.otp="Your OTP from MTN chatbot is "+otp;
  Storage.user.set("otp",otp);
  console.log("otp====",otp);
  //SMS.send(otp,[context.variables.phone_number]);
 /* Email.send({
    to:"bharath.v86@wipro.com",
    from_name:"Avaamo",
    subject:"OTP generator",
    body:context.variables.otp
  })*/
  Email.send({
    to:"lakshmi.mohan4@wipro.com",
    from_name:"Avaamo",
    subject:"OTP generator",
    body:context.variables.otp
  })
  if(Storage.user.get("demomode") == 'true')
  {
    return `An OTP has been sent to your mobile. I would need you to enter the OTP that you have received on your mobile number ${Storage.user.get("phone")}.`;
  }else
  {
    return await(call());
  }
}

function call()
{
  return HybridSDK.call('SMSGateway', {"PhoneNumber":Storage.user.get("phone"),"OTP":context.variables.otp})
  .then(res => {
    var response=[res];
    context.variables.sms_send=response[0]["soapenv:Envelope"]["soapenv:Body"][0]["sen:processResponse"][0]["sen:Status"][0];
    if(context.variables.sms_send=="Request Received")
    {
      Storage.user.set("smsset",true);
      return `An OTP has been sent to your mobile. I would need you to enter the OTP that you have received on your mobile number ${Storage.user.get("phone")}.`;
    }
    else
    {
      //return `Sorry!! There is some internal problem while generating OTP.Please try again after sometime`;
      context.variables.no_otp=1;
      return[
        {
          quick_reply: {
            content: "Sorry! I am having trouble sending OTP. Would you like to try sending OTP again to the same number?",
            links: [
              {
                title: "Yes",
                type: "message",
                value: "Yes"
              },
              {
                title: "No",
                type: "message",
                value: "No"
              }
            ]
          }
        }
      ];

    }

  }).catch(e=>
           {
             console.log("Error while fetching SMS Gateway API", e);
             return "Sorry !! Unable to send OTP to your number right now.Please try again later";
           });

}