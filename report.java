package OtherSample;
import java.util.Scanner;
import java.util.List;

public class report {
  public void reportmenu() {
    Scanner input = new Scanner(System.in);
    char choiceChar;
    String key;

    System.out.println("+-------------------------------------------------------+");
    System.out.println("|                                                       |");
    System.out.println("|    What total number do you want to display?          |");
    System.out.println("|                                                       |");
    System.out.println("|------------------------------                         |");
    System.out.println("| a. Number of available peripherals                    |");
    System.out.println("| b. Number of assigned peripherals                     |");
    System.out.println("| c. Number of input devices                            |");
    System.out.println("| d. Number of output devices                           |");
    System.out.println("| e. Number of employees with peripherals assigned      |");
    System.out.println("|-------------------------------------------------------|");
    System.out.println("| Enter option a-e                                      |");
    System.out.println("+-------------------------------------------------------+");

    while (true) {
      System.out.print("Choice: ");
      key = input.nextLine();

      if (key.length() == 1 && key.matches("[a-eA-E]")) {
        choiceChar = key.charAt(0);
        break;
      } else {
        System.out.println("Invalid input! Enter option a-e");
      }
    }

    switch (choiceChar) {
      case 'a':
      case 'A':
    	  AddPeripheralWithoutEmployee Without = new AddPeripheralWithoutEmployee();
    	    List<AddPeripheralWithoutEmployee> withoutEmployee = Without.getWithout();
    	    System.out.println("Total number of available peripherals: " + withoutEmployee.size());
        
        break;
      case 'b':
      case 'B':
    	  AddPeripheralWithEmployee With = new AddPeripheralWithEmployee();
  	    List<AddPeripheralWithEmployee> withEmployee = With.getWith();
  	    System.out.println("Total number of assigned peripherals: " + withEmployee.size());
        
        break;
      case 'c':
      case 'C':
    	  InputPeripheralsWithEmployee inputwith = new InputPeripheralsWithEmployee();
  	    List<InputPeripheralsWithEmployee> inputWithEmployee = inputwith.getInput();
  	    System.out.println("Total number of input device with employees: " + inputWithEmployee.size());
  	    
  	  InputPeripheralsWithoutEmployee inputwithout = new InputPeripheralsWithoutEmployee();
	    List<InputPeripheralsWithoutEmployee> inputWithoutEmployee = inputwithout.getInputwithout();
	    System.out.println("Total number of input device without employees: " + inputWithoutEmployee.size());
        
        break;
      case 'd':
      case 'D':
    	  OutputPeripheralsWithEmployee outputwith = new OutputPeripheralsWithEmployee();
    	    List<OutputPeripheralsWithEmployee> outputWithEmployee = outputwith.getOutput();
    	    System.out.println("Total number of input device with employees: " + outputWithEmployee.size());
    	    
    	    OutputPeripheralsWithoutEmployee outputwithout = new OutputPeripheralsWithoutEmployee();
    	    List<OutputPeripheralsWithoutEmployee> outputWithoutEmployee = outputwithout.getOutputwithout();
    	    System.out.println("Total number of input device without employees: " + outputWithoutEmployee.size());
       

        break;
      case 'e':
      case 'E':
    	  AddPeripheralWithEmployee totalEmployee = new AddPeripheralWithEmployee();
    	  List<AddPeripheralWithEmployee> Employee = totalEmployee.getWith();
    	  int totalEmployees = 0;
    	  for (AddPeripheralWithEmployee data : Employee) {
    	    if (data.getAssignedTo() != null) {
    	      totalEmployees++;
    	    }
    	  }
    	  System.out.println("Total number of employees: " + totalEmployees);
    	  
       

        break;
     
    }
  }
  
 
}