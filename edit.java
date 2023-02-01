package OtherSample;
import java.util.Scanner;
import java.util.ArrayList;

public class edit {
	
	static void modifyPeripheralRecord(ArrayList<AddPeripheralWithoutEmployee> withoutEmployee) {
		System.out.println("Enter peripheral ID to modify: ");
		Scanner sc = new Scanner(System.in);
		int peripheralId = sc.nextInt();
		AddPeripheralWithoutEmployee peripheral = withoutEmployee.get(peripheralId - 1);

		System.out.println("Enter security credential: ");
		String securityCredential = sc.next();
		if (!securityCredential.equals("secret")) {
		System.out.println("Invalid security credential.");
		return;
		}

		System.out.println("Enter new peripheral name: ");
		String newPeripheralName = sc.next();
		peripheral.setName(newPeripheralName);

		System.out.println("Enter new peripheral type: ");
		String newPeripheralType = sc.next();
		peripheral.setName(newPeripheralType);

		System.out.println("Record updated successfully.");
		}
}
