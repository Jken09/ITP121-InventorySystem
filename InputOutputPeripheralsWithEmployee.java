package OtherSample;
import java.util.ArrayList;



import OtherSample.Record;

public class InputOutputPeripheralsWithEmployee extends PCHardwareWithEmployee implements Record {
	
	private static ArrayList<InputOutputPeripheralsWithEmployee> inputoutput = new ArrayList<>();
	
	public InputOutputPeripheralsWithEmployee() {
			
		}
		
	public InputOutputPeripheralsWithEmployee(String code, String name, String peripheral ,String assignedTo, String securityCredential) {
		super(code, name, peripheral, assignedTo, securityCredential);
		// TODO Auto-generated constructor stub
	}	
	
	public void saveInfo() {
		this.inputoutput.add(this);
	}
	
	public ArrayList<InputOutputPeripheralsWithEmployee> getInputoutput() {
		return inputoutput;
	}

}
