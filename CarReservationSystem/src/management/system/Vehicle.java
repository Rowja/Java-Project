package management.system;

public class Vehicle {
	private String  name, color, regiNo,modelNo;
	int id;
	
	public void setId(int id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void setRegiNo(String regiNo) {
		this.regiNo=regiNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo=modelNo;
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	public String getRegiNo(){
		return regiNo;
	}
	public String getModelNo() {
		return modelNo;
	}
	
	 public void showInfo()
	 {
	 System.out.println("\nId        : "+getId());
	 System.out.println("Name        : "+getName());
	 System.out.println("Color       : "+getColor());
	 System.out.println("Registration: "+getRegiNo());
	 System.out.println("Model No    : "+getModelNo());
	 }
	
}
