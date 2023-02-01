package OtherSample;
import java.util.ArrayList;

import OtherSample.Record;

public class AddPeripheralWithoutEmployee extends PCHardwareWithoutEmployee implements Record {
	
	private static ArrayList<AddPeripheralWithoutEmployee> without = new ArrayList<>();
	
	public AddPeripheralWithoutEmployee() {
			
		}
		
	public AddPeripheralWithoutEmployee(String code, String name, String peripheral ,String securityCredential) {
		super(code, name, peripheral, securityCredential);
		// TODO Auto-generated constructor stub
	}	
	
	
	public void saveInfo() {
		this.without.add(this);
	}
	
	public ArrayList<AddPeripheralWithoutEmployee> getWithout() {
		return without;
	}

}
