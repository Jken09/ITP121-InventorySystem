package OtherSample;
import java.util.ArrayList;



import OtherSample.Record;

public class InputPeripheralsWithoutEmployee extends PCHardwareWithoutEmployee implements Record {
	
	private static ArrayList<InputPeripheralsWithoutEmployee> inputwithout = new ArrayList<>();
	
	public InputPeripheralsWithoutEmployee() {
			
		}
		
	public InputPeripheralsWithoutEmployee(String code, String name, String peripheral , String securityCredential) {
		super(code, name, peripheral, securityCredential);
		// TODO Auto-generated constructor stub
	}	
	
	public void saveInfo() {
		this.inputwithout.add(this);
	}
	
	public ArrayList<InputPeripheralsWithoutEmployee> getInputwithout() {
		return inputwithout;
	}

}
