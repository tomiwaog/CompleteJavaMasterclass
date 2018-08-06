package noteandpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReThrown {

	FileInputStream soccer;
	//any method re-throwing or throwing a checked exception must Declare it or Handle it /Follow DeclareOrHandleRule
	void myMethod() throws FileNotFoundException{
		try{
			soccer = new FileInputStream("");
		}catch(FileNotFoundException fnfe){
			throw fnfe;
		}
	}
}

class UncheckedReThrown {

	FileInputStream soccer;
	//Method Re-throws an unchecked Exception, hence no need to handle it or declare it.
	void myMethod(){
		try{
			soccer = new FileInputStream("");
		}catch(FileNotFoundException fnfe){
			throw new RuntimeException();
		}
	}
}
