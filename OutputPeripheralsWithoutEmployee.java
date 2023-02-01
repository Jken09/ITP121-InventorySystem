package OtherSample;
import java.util.ArrayList;



import OtherSample.Record;

public class OutputPeripheralsWithoutEmployee extends PCHardwareWithoutEmployee implements Record {
	
	private static ArrayList<OutputPeripheralsWithoutEmployee> outputwithout = new ArrayList<>();
	
	public OutputPeripheralsWithoutEmployee() {
			
		}
		
	public OutputPeripheralsWithoutEmployee(String code, String name, String peripheral , String securityCredential) {
		super(code, name, peripheral, securityCredential);
		// TODO Auto-generated constructor stub
	}	
	
	public void saveInfo() {
		this.outputwithout.add(this);
	}
	
	public ArrayList<OutputPeripheralsWithoutEmployee> getOutputwithout() {
		return outputwithout;
	}

}
