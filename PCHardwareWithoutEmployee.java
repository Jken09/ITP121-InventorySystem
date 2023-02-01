package OtherSample;



public class PCHardwareWithoutEmployee {

	  private String code;
	  private String name;
	  private String peripheral;
	  
	  private String securityCredential;

	  public PCHardwareWithoutEmployee() {

	  }

	  public PCHardwareWithoutEmployee(String code, String name, String peripheral,String securityCredential) {
	    this.code = code;
	    this.name = name;
	    this.peripheral = peripheral;
	    
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

	  
	  public String getSecurityCredential() {
		  return securityCredential;
	  
	  }
	  
	  public void setSecurityCredential(String securityCredential) {
		  this.securityCredential = securityCredential;
	  }

	}
