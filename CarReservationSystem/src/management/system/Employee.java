package management.system;

public class Employee extends Patron{
	
	 private String  employeeId,joiningDate;
	 private double salary;
	 
	 
	 public void setEmployeeId(String employeeId) {
	 this.employeeId = employeeId;
	 }
	 
	 public void setJoiningDate(String joiningDate) {
	 this.joiningDate = joiningDate;
	 }
	 
	 public void setSalary(double salary) {
	 this.salary = salary;
	 }
	 
	 
	 
	 public String getEmployeeId() {
	 return employeeId;
	 }
	
	 public String getJoiningDate() {
	 return joiningDate;
	 }
	 
	 public double getSalary() {
	 return salary;
	 }
	 
	 
	 public void showInfo()
	 {
	 System.out.println("\nId          : "+getId());
	 System.out.println("Name          : "+getName());
	 System.out.println("Address       : "+getAddress());
	 System.out.println("Contact No    : "+getContactNo());
	 System.out.println("Nationality   : "+getNationality());
	 System.out.println("Joining Date  : "+getJoiningDate());
	 System.out.println("Salary        : "+getSalary());
	 }
	}


