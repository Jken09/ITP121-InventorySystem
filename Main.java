package OtherSample;

import java.util.Scanner;
import java.util.ArrayList;
import OtherSample.MainRegistration;

public class Main {
	public static void main(String[] args) {
    
	Scanner input = new Scanner(System.in);
    char choice;
    boolean run = true;

    while (run) {
        System.out.println("\n+-----------------------------------------+");
        System.out.println("|                                           |");
        System.out.println("|      Inventory System                     |");
        System.out.println("|                                           |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| a. Add Record                             |");
        System.out.println("| b. View Record                            |");
        System.out.println("| c. Edit Record                            |");
        System.out.println("| d. Delete Record                          |");
        System.out.println("| e. Report                                 |");
        System.out.println("| f. Exit                                   |");
        System.out.println("|-------------------------------------------|");
        System.out.println("| Enter Option a-f                          |");
        System.out.println("+-------------------------------------------+");

        // Input with validation
        while (true) {
            System.out.print("Choice: ");
            String choiceStr = input.nextLine();

            if (choiceStr.length() != 1) {
                System.out.println("Input must be one character");
                continue;
            }

            choice = choiceStr.charAt(0);
            if (choice < 'a' || choice > 'f') {
                System.out.println("Invalid Input");
                continue;
            }
            break;
        }

        switch (choice) {
            case 'a':
            	addRecord();
                break;
            case 'b':
            	view viewMenu = new view();
				viewMenu.menu();
                break;
            case 'c':
            	edit editMenu = new edit();
            	ArrayList<AddPeripheralWithoutEmployee> withoutEmployee = new ArrayList<>(); 
            	editMenu.modifyPeripheralRecord(withoutEmployee);
                break;
            case 'd':
            	delete obj = new delete();
            	Scanner sc = new Scanner(System.in);
            	System.out.println("Enter the code of the peripheral to be deleted: ");
            	String code = sc.nextLine();
            	obj.deletePeripheral(code);
            	sc.close();
                break;
            case 'e':
            	report reportMenu = new report();
				reportMenu.reportmenu();
                
                break;
            case 'f':
                System.out.println("Thank you for using the program!");
                run = false;
                break;
        }
    }
	}
    	
	static void addRecord() {
		MainRegistration registration = new MainRegistration();
		registration.register();
	}

}
