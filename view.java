package OtherSample;
import java.util.Scanner;
public class view {
	public void menu() {
		Scanner input = new Scanner(System.in);
		char choiceChar;
		String key;
		
		System.out.println("+-----------------------------------------+");
		System.out.println("|                                         |");
		System.out.println("|    Peripherals Menu                     |");
		System.out.println("|                                         |");
		System.out.println("|------------------------------           |");
		System.out.println("| a. View all peripherals                 |");
		System.out.println("| b. View available peripherals           |");
		System.out.println("| c. View not available peripherals       |");
		System.out.println("| d. View all input devices               |");
		System.out.println("| e. View all output devices              |");
		System.out.println("| f. View all I/O devices                 |");
		System.out.println("| g. View all employees                   |");
		System.out.println("|------------------------------           |");
		System.out.println("| Enter option a-g                        |");
		System.out.println("+-----------------------------------------+");
		
		while(true) {
			System.out.print("Choice: ");
			key = input.nextLine();

			if(key.length() == 1 && key.matches("[a-gA-G]")) {
				choiceChar = key.charAt(0);
				break;
			} else {
				System.out.println("Invalid input! Enter option a-g");
			}
		}
		
		switch (choiceChar) {
		case 'a':
		case 'A':
			listOfPeripheralsWithoutEmployee();
			listOfPeripheralsWithEmployee();
			break;
		case 'b':
		case 'B':
			listOfPeripheralsWithoutEmployee();
			break;
		case 'c':
		case 'C':
			listOfPeripheralsWithEmployee();		
			break;
		case 'd':
		case 'D':
			listOfInputPeripheralsWithoutEmployee();
			listOfInputPeripheralsWithEmployee();
			
			break;
		case 'e':
		case 'E':
			listOfOutputPeripheralsWithoutEmployee();
			listOfOutputPeripheralsWithEmployee();
			
			break;
		case 'f':
		case 'F':
			listOfInputOutputPeripheralsWithoutEmployee();
			listOfInputOutputPeripheralsWithEmployee();
			
			break;
		case 'g':
		case 'G':
			listOfEmployees();
			break;
		}
	}
		
		static void listOfPeripheralsWithEmployee() {
			
		AddPeripheralWithEmployee peripheral = new AddPeripheralWithEmployee();
		
			for (int i = 0; i < peripheral.getWith().size(); i++) {
				AddPeripheralWithEmployee data = peripheral.getWith().get(i);
				
				System.out.print("\n");
				System.out.println("List Of Peripherals With Employee");
				
				System.out.print("| " + i + ". " + data.getCode());
				
				for (int j = 0; j < 36 - data.getCode().length(); j++) {
					System.out.print(" ");
				}
				
				System.out.print("| " + i + ". " + data.getName());
				
				for (int j = 0; j < 30 - data.getName().length(); j++) {
					System.out.print(" ");
				}
				
				System.out.print("| " + i + ". " + data.getPeripheral());
				
				for (int j = 0; j < 21 - data.getPeripheral().length(); j++) {
					System.out.print(" ");
				}
				
				System.out.print("| " + i + ". " + data.getAssignedTo());
				
				for (int j = 0; j < 21 - data.getAssignedTo().length(); j++) {
					System.out.print(" ");
				}
				
				System.out.print("| " + i + ". " + data.getSecurityCredential());
				
				for (int j = 0; j < 25 - data.getSecurityCredential().length(); j++) {
					System.out.print(" ");
				}
				
				System.out.print("|");
					
			}
		
		System.out.println("\n+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
		System.out.println("Total: " + peripheral.getWith().size());
		}
		
		static void listOfPeripheralsWithoutEmployee() {
			
			AddPeripheralWithoutEmployee peripheral = new AddPeripheralWithoutEmployee();
				System.out.println("List Of Peripherals Without Employee");
			for (int i = 0; i < peripheral.getWithout().size(); i++) {
				AddPeripheralWithoutEmployee data = peripheral.getWithout().get(i);
				
				System.out.print("\n");
				
				
				System.out.print("| " + i + ". " + data.getCode());
				
				for (int j = 0; j < 36 - data.getCode().length(); j++) {
					System.out.print(" ");
				}
				
				System.out.print("| " + i + ". " + data.getName());
				
				for (int j = 0; j < 30 - data.getName().length(); j++) {
					System.out.print(" ");
				}
				
				System.out.print("| " + i + ". " + data.getPeripheral());
				
				for (int j = 0; j < 21 - data.getPeripheral().length(); j++) {
					System.out.print(" ");
				}
				
				System.out.print("| " + i + ". " + data.getSecurityCredential());
				
				for (int j = 0; j < 21 - data.getSecurityCredential().length(); j++) {
					System.out.print(" ");
				}
				
				System.out.print("|");
					
			}
			
			System.out.println("\n+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
			System.out.println("Total: " + peripheral.getWithout().size());
		}
		
		
		
		static void listOfInputPeripheralsWithEmployee() {
			
			InputPeripheralsWithEmployee peripheral = new InputPeripheralsWithEmployee();
			System.out.println("List Of Input Peripherals With Employee");
			for (int i = 0; i < peripheral.getInput().size(); i++) {
				InputPeripheralsWithEmployee data = peripheral.getInput().get(i);
				System.out.print("\n");
				
				if (data.getPeripheral().equals("Input")) {
					
					
					System.out.print("| " + i + ". " + data.getCode());
					
					for (int j = 0; j < 36 - data.getCode().length(); j++) {
						System.out.print(" ");
					}
					
					System.out.print("| " + i + ". " + data.getName());
					
					for (int j = 0; j < 30 - data.getName().length(); j++) {
						System.out.print(" ");
					}
					
					System.out.print("| " + i + ". " + data.getPeripheral());
					
					for (int j = 0; j < 21 - data.getPeripheral().length(); j++) {
						System.out.print(" ");
					}
					
					System.out.print("| " + i + ". " + data.getAssignedTo());
					
					for (int j = 0; j < 21 - data.getAssignedTo().length(); j++) {
						System.out.print(" ");
					}
					
					System.out.print("| " + i + ". " + data.getSecurityCredential());
					
					for (int j = 0; j < 25 - data.getSecurityCredential().length(); j++) {
						System.out.print(" ");
					}
					
					System.out.print("|");
				}
			
			System.out.println("\n+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
			System.out.println("Total: " + peripheral.getInput().size());
		}
		}
			
			static void listOfOutputPeripheralsWithEmployee() {
				
				OutputPeripheralsWithEmployee peripheral = new OutputPeripheralsWithEmployee();
				System.out.println("List Of Output Peripherals With Employee");
				for (int i = 0; i < peripheral.getOutput().size(); i++) {
					OutputPeripheralsWithEmployee data = peripheral.getOutput().get(i);
					System.out.print("\n");
					
					if (data.getPeripheral().equals("Output")) {
						
						
						System.out.print("| " + i + ". " + data.getCode());
						
						for (int j = 0; j < 36 - data.getCode().length(); j++) {
							System.out.print(" ");
						}
						
						System.out.print("| " + i + ". " + data.getName());
						
						for (int j = 0; j < 30 - data.getName().length(); j++) {
							System.out.print(" ");
						}
						
						System.out.print("| " + i + ". " + data.getPeripheral());
						
						for (int j = 0; j < 21 - data.getPeripheral().length(); j++) {
							System.out.print(" ");
						}
						
						System.out.print("| " + i + ". " + data.getAssignedTo());
						
						for (int j = 0; j < 21 - data.getAssignedTo().length(); j++) {
							System.out.print(" ");
						}
						
						System.out.print("| " + i + ". " + data.getSecurityCredential());
						
						for (int j = 0; j < 25 - data.getSecurityCredential().length(); j++) {
							System.out.print(" ");
						}
						
						System.out.print("|");
					}
				
				System.out.println("\n+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
				System.out.println("Total: " + peripheral.getOutput().size());
			}
		
		
		
		
	

}
			
static void listOfInputOutputPeripheralsWithEmployee() {
				
				InputOutputPeripheralsWithEmployee peripheral = new InputOutputPeripheralsWithEmployee();
				System.out.println("List Of Input/Output Peripherals With Employee");
				for (int i = 0; i < peripheral.getInputoutput().size(); i++) {
					InputOutputPeripheralsWithEmployee data = peripheral.getInputoutput().get(i);
					System.out.print("\n");
					
					if (data.getPeripheral().equals("Input/Output")) {
						
						
						System.out.print("| " + i + ". " + data.getCode());
						
						for (int j = 0; j < 36 - data.getCode().length(); j++) {
							System.out.print(" ");
						}
						
						System.out.print("| " + i + ". " + data.getName());
						
						for (int j = 0; j < 30 - data.getName().length(); j++) {
							System.out.print(" ");
						}
						
						System.out.print("| " + i + ". " + data.getPeripheral());
						
						for (int j = 0; j < 21 - data.getPeripheral().length(); j++) {
							System.out.print(" ");
						}
						
						System.out.print("| " + i + ". " + data.getAssignedTo());
						
						for (int j = 0; j < 21 - data.getAssignedTo().length(); j++) {
							System.out.print(" ");
						}
						
						System.out.print("| " + i + ". " + data.getSecurityCredential());
						
						for (int j = 0; j < 25 - data.getSecurityCredential().length(); j++) {
							System.out.print(" ");
						}
						
						System.out.print("|");
					}
				
				System.out.println("\n+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
				System.out.println("Total: " + peripheral.getInputoutput().size());
			}
		
		
		
		
	

}

static void listOfInputPeripheralsWithoutEmployee() {
	
	InputPeripheralsWithoutEmployee peripheral = new InputPeripheralsWithoutEmployee();
	System.out.println("List Of Input/Output Peripherals Without Employee");
	for (int i = 0; i < peripheral.getInputwithout().size(); i++) {
		InputPeripheralsWithoutEmployee data = peripheral.getInputwithout().get(i);
		System.out.print("\n");
		
		if (data.getPeripheral().equals("Input")) {
			
			
			System.out.print("| " + i + ". " + data.getCode());
			
			for (int j = 0; j < 36 - data.getCode().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("| " + i + ". " + data.getName());
			
			for (int j = 0; j < 30 - data.getName().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("| " + i + ". " + data.getPeripheral());
			
			for (int j = 0; j < 21 - data.getPeripheral().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("| " + i + ". " + data.getSecurityCredential());
			
			for (int j = 0; j < 25 - data.getSecurityCredential().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("|");
		}
	
	System.out.println("\n+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
	System.out.println("Total: " + peripheral.getInputwithout().size());
}






}

static void listOfOutputPeripheralsWithoutEmployee() {
	
	OutputPeripheralsWithoutEmployee peripheral = new OutputPeripheralsWithoutEmployee();
	System.out.println("List Of Output Peripherals Without Employee");
	for (int i = 0; i < peripheral.getOutputwithout().size(); i++) {
		OutputPeripheralsWithoutEmployee data = peripheral.getOutputwithout().get(i);
		System.out.print("\n");
		
		if (data.getPeripheral().equals("Output")) {
			
			
			System.out.print("| " + i + ". " + data.getCode());
			
			for (int j = 0; j < 36 - data.getCode().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("| " + i + ". " + data.getName());
			
			for (int j = 0; j < 30 - data.getName().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("| " + i + ". " + data.getPeripheral());
			
			for (int j = 0; j < 21 - data.getPeripheral().length(); j++) {
				System.out.print(" ");
			}
			
			
			System.out.print("| " + i + ". " + data.getSecurityCredential());
			
			for (int j = 0; j < 25 - data.getSecurityCredential().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("|");
		}
	
	System.out.println("\n+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
	System.out.println("Total: " + peripheral.getOutputwithout().size());
}






}

static void listOfInputOutputPeripheralsWithoutEmployee() {
	
	InputOutputPeripheralsWithoutEmployee peripheral = new InputOutputPeripheralsWithoutEmployee();
	System.out.println("List Of Input/Output Peripherals With Employee");
	for (int i = 0; i < peripheral.getIowithout().size(); i++) {
		InputOutputPeripheralsWithoutEmployee data = peripheral.getIowithout().get(i);
		System.out.print("\n");
		
		if (data.getPeripheral().equals("Input/Output")) {
			
			
			System.out.print("| " + i + ". " + data.getCode());
			
			for (int j = 0; j < 36 - data.getCode().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("| " + i + ". " + data.getName());
			
			for (int j = 0; j < 30 - data.getName().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("| " + i + ". " + data.getPeripheral());
			
			for (int j = 0; j < 21 - data.getPeripheral().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("| " + i + ". " + data.getSecurityCredential());
			
			for (int j = 0; j < 25 - data.getSecurityCredential().length(); j++) {
				System.out.print(" ");
			}
			
			System.out.print("|");
		}
	
	System.out.println("\n+--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+");
	System.out.println("Total: " + peripheral.getIowithout().size());
}






}

static void listOfEmployees() {
	  AddPeripheralWithEmployee peripheral = new AddPeripheralWithEmployee();
	  
	  System.out.println("List Of Employees");
	  
	  for (int i = 0; i < peripheral.getWith().size(); i++) {
	    AddPeripheralWithEmployee data = peripheral.getWith().get(i);
	    
	    System.out.println("| " + (i + 1) + ". " + data.getAssignedTo());
	  }
	  
	  System.out.println("\nTotal: " + peripheral.getWith().size());
	}

static int getTotalEmployees() {
	  AddPeripheralWithEmployee peripheral = new AddPeripheralWithEmployee();
	  return peripheral.getWith().size();
	}




}
