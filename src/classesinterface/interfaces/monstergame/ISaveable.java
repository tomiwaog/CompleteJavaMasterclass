package classesinterface.interfaces.monstergame;
//Interface acts as a contract. Poly-morphic usage is another benefit.
//i.e ISavaable x = new A(); // x= new B(); when A or B are not connected
import java.util.List;

public interface ISaveable {

	List<String> writeToList();
	void read(List<String> savedValues);
}
