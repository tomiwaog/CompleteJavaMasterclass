package classesninterfaces.interfaces.playermonster;
//Interface acts as a contract. Poly-morphic usage is another benefit.
//i.e ISavaable x = new A(); // x= new B(); when A or B are not connected
import java.util.List;

public interface ISaveable {
	//Classes who implements ISaveable must provide implementation for below methods
	List<String> write();
	void readValues(List<String> savedValues);
}
