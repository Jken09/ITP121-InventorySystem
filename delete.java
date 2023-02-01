package OtherSample;
import java.util.ArrayList;
import java.util.Scanner;
public class delete {
	AddPeripheralWithoutEmployee instance = new AddPeripheralWithoutEmployee();
	ArrayList<AddPeripheralWithoutEmployee> without = instance.getWithout();

	public void deletePeripheral(String code) {
		boolean found = false;
		for (int i = 0; i < without.size(); i++) {
			if (without.get(i).getCode().equals(code) && without.get(i).getWithout() == null) {
				without.remove(i);
				System.out.println("Peripheral successfully deleted.");
				found = true;
				return;
			}
			else {
				System.out.println("Peripheral cannot be deleted as it has already been assigned to an employee.");
				found = true;
			}
		}
		if (!found) {
			System.out.println("Peripheral code not found in records. Please enter a valid code.");
		}
	}
}
