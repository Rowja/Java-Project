package management.system;

public class Customer extends Patron{

	private String customerId, nidNo;

	
	public void setCustomerId( String customerId) {
		this.customerId=customerId;
	}
	
	public void setNidNo( String nidNo) {
		this.nidNo=nidNo;
	}
	
	
	public String getCustomerId() {
		return customerId;
		
		
	}	
		
	public String getNidNo() {
		return nidNo;
		
		
	}	
		
		
			
	public void showInfo()
	 {
	 System.out.println("\nName      : "+getName());
	 System.out.println("Id          : "+getId());
	 System.out.println("Address     : "+getAddress());
	 System.out.println("NidNo       : "+getNidNo());
	 System.out.println("Nationality : "+getNationality());
	 System.out.println("ContactNo   : "+getContactNo());
	 } 
  }   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

