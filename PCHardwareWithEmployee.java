package OtherSample;

public class PCHardwareWithEmployee {

	  private String code;
	  private String name;
	  private String peripheral;
	  private String assignedTo;
	  private String securityCredential;

	  public PCHardwareWithEmployee() {

	  }

	  public PCHardwareWithEmployee(String code, String name, String peripheral, String assignedTo,String securityCredential) {
	    this.code = code;
	    this.name = name;
	    this.peripheral = peripheral;
	    this.assignedTo = assignedTo;
	    this.securityCredential = securityCredential;
	  }

	  public String getCode() {
	    return code;
	  }

	  public void setCode(String code) {
	    this.code = code;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getPeripheral() {
	    return peripheral;
	  }

	  public void setPeripheral(String peripheral) {
	    this.peripheral = peripheral;
	  }

	  public String getAssignedTo() {
	    return assignedTo;
	  }

	  public void setAssignedTo(String assignedTo) {
	    this.assignedTo = assignedTo;
	    
	  }
	  public String getSecurityCredential() {
		  return securityCredential;
	  
	  }
	  
	  public void setSecurityCredential(String securityCredential) {
		  this.securityCredential = securityCredential;
	  }

	}
