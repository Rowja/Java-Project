package management.system;

public class ReserveVehicle {

    private String name  , nidNo, phoneNo;
    
	
	public void setName( String name) {
		this.name=name;
	}
	public void setNidNo( String nidNo) {
		this.nidNo=nidNo;
	}
	public void setPhoneNo( String PhoneNo) {
		this.phoneNo=phoneNo;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public String getNidNo() {
		return nidNo;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	
	
	
	
	
	
	public void showReservationInfo()
	 {
	 System.out.println("\nName      : "+getName());
	 System.out.println("Nid No      : "+getNidNo());
	 System.out.println("Contact No  : "+getPhoneNo());
	
	 } 
	
}
