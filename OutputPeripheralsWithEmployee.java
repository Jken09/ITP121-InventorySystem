package OtherSample;
import java.util.ArrayList;



import OtherSample.Record;

public class OutputPeripheralsWithEmployee extends PCHardwareWithEmployee implements Record {
	
	private static ArrayList<OutputPeripheralsWithEmployee> output = new ArrayList<>();
	
	public OutputPeripheralsWithEmployee() {
			
		}
		
	public OutputPeripheralsWithEmployee(String code, String name, String peripheral ,String assignedTo, String securityCredential) {
		super(code, name, peripheral, assignedTo, securityCredential);
		// TODO Auto-generated constructor stub
	}	
	
	public void saveInfo() {
		this.output.add(this);
	}
	
	public ArrayList<OutputPeripheralsWithEmployee> getOutput() {
		return output;
	}

}
