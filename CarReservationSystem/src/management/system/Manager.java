package management.system;

public class Manager extends Patron  {
	
	private String  managerId, regiNo;
	private double salary;
	
	
	public void setManagerId(String managerId) {
		this.managerId=managerId;
	}
	public void setRegiNo(String regiNo) {
		this.regiNo=regiNo;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	
	
	
	public String getManagerId() {
		return managerId;
	}
	public String getRegiNo() {
		return regiNo;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void showInfo()
	 {
	 System.out.println("\nName           : "+getName());
	 System.out.println("Id               : "+getId());
	 System.out.println("Registration No  : "+getRegiNo());
	 System.out.println("Address          : "+getAddress());
	 System.out.println("Email Id         : "+getEmail());
	 System.out.println("Nationality      : "+getNationality());
	 System.out.println("Salary           : "+getSalary());
	 }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


