package OtherSample;
import java.util.ArrayList;



import OtherSample.Record;

public class InputOutputPeripheralsWithoutEmployee extends PCHardwareWithoutEmployee implements Record {
	
	private static ArrayList<InputOutputPeripheralsWithoutEmployee> iowithout = new ArrayList<>();
	
	public InputOutputPeripheralsWithoutEmployee() {
			
		}
		
	public InputOutputPeripheralsWithoutEmployee(String code, String name, String peripheral , String securityCredential) {
		super(code, name, peripheral, securityCredential);
		// TODO Auto-generated constructor stub
	}	
	
	public void saveInfo() {
		this.iowithout.add(this);
	}
	
	public ArrayList<InputOutputPeripheralsWithoutEmployee> getIowithout() {
		return iowithout;
	}

}
