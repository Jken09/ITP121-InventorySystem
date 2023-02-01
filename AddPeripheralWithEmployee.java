package OtherSample;
import java.util.ArrayList;



import OtherSample.Record;

public class AddPeripheralWithEmployee extends PCHardwareWithEmployee implements Record {
	
	private static ArrayList<AddPeripheralWithEmployee> with = new ArrayList<>();
	
	public AddPeripheralWithEmployee() {
			
		}
		
	public AddPeripheralWithEmployee(String code, String name, String peripheral ,String assignedTo, String securityCredential) {
		super(code, name, peripheral, assignedTo, securityCredential);
		// TODO Auto-generated constructor stub
	}	
	
	public void saveInfo() {
		this.with.add(this);
	}
	
	public ArrayList<AddPeripheralWithEmployee> getWith() {
		return with;
	}

}
