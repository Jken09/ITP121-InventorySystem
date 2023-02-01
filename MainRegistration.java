package OtherSample;
import java.util.ArrayList;
import java.util.Scanner;
import OtherSample.AddPeripheralWithEmployee;
import OtherSample.AddPeripheralWithoutEmployee;
import OtherSample.InputPeripheralsWithEmployee;


public class MainRegistration {
	
	public void register() {
		Scanner input = new Scanner(System.in);
		int choiceInt;
		String key;

		System.out.println("+-------------------------------------------+");
		System.out.println("|                                           |");
		System.out.println("|             Registration Menu             |");
		System.out.println("|                                           |");
		System.out.println("|-------------------------------------------|");
		System.out.println("| a. Add Peripheral without Employee        |");
		System.out.println("| b. Add Peripheral with Employee           |");
		System.out.println("|-------------------------------------------|");
		System.out.println("| Enter Option a or b                       |");
		System.out.println("+-------------------------------------------+");
		
		//Input with validation
		while(true) {
			System.out.print("Choice: ");
			key = input.nextLine();
			
			if (key.equals("a") || key.equals("b")) {
				break;
			} else {
				System.out.println("Invalid Input! Please enter either 'a' or 'b'.");
			}
		}
		
		switch (key) {
			case "a":
				inputInfoWithoutEmployee();
				break;
			case "b":
				inputInfoWithEmployee();
				break;
		}
	}
		
		static void inputInfoWithoutEmployee() {
			Scanner sc = new Scanner(System.in);
			String code, name, peripheral, securityCredential;

			System.out.println("\n\n+-------------------------------------------+");
			System.out.println("              PC Hardware Registration        \n");

			int year = java.time.Year.now().getValue();
	        int codeIncrement = 1;
	        code = String.format("%04d%04d", year, codeIncrement++);
	        
			System.out.print("Name                     : ");
			name = sc.nextLine();
			System.out.print("Peripheral (Input, Output, Input/Output) : ");
			peripheral = sc.nextLine();
			System.out.print("Security Credential      : ");
			securityCredential = sc.nextLine();
			
			System.out.println("\nSuccessfully saved!");
			
			AddPeripheralWithoutEmployee withoutEmployee = new AddPeripheralWithoutEmployee(code, name, peripheral, securityCredential);
			withoutEmployee.saveInfo();
	}
	
	static void inputInfoWithEmployee() {
		Scanner sc = new Scanner(System.in);
		String code, name, peripheral, assignedTo, securityCredential;

		System.out.println("\n\n+-------------------------------------------+");
		System.out.println("              PC Hardware Registration        \n");

		int year = java.time.Year.now().getValue();
        int codeIncrement = 100;
        code = String.format("%04d%04d", year, codeIncrement++);
        
		System.out.print("Name                     : ");
		name = sc.nextLine();
		System.out.print("Peripheral (Input, Output, Input/Output) : ");
		peripheral = sc.nextLine();
		System.out.print("Name of Employee : ");
		assignedTo = sc.nextLine();
		System.out.print("Security Credential      : ");
		securityCredential = sc.nextLine();
		
		System.out.println("\nSuccessfully saved!");
		
		AddPeripheralWithEmployee withEmployee = new AddPeripheralWithEmployee(code, name, peripheral, assignedTo, securityCredential);
		withEmployee.saveInfo();
		
		InputPeripheralsWithEmployee inputWithEmployee = new InputPeripheralsWithEmployee(code, name, peripheral, assignedTo, securityCredential);
		inputWithEmployee.saveInfo();
	}
		
}


