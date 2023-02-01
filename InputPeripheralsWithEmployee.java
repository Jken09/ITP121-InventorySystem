package OtherSample;
import java.util.ArrayList;



import OtherSample.Record;

public class InputPeripheralsWithEmployee extends PCHardwareWithEmployee implements Record {
	
	private static ArrayList<InputPeripheralsWithEmployee> input = new ArrayList<>();
	
	public InputPeripheralsWithEmployee() {
			
		}
		
	public InputPeripheralsWithEmployee(String code, String name, String peripheral ,String assignedTo, String securityCredential) {
		super(code, name, peripheral, assignedTo, securityCredential);
		// TODO Auto-generated constructor stub
	}	
	
	public void saveInfo() {
		this.input.add(this);
	}
	
	public ArrayList<InputPeripheralsWithEmployee> getInput() {
		return input;
	}

}
