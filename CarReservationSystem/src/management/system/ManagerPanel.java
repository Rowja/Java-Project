package management.system;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ManagerPanel {


    File file = new File("data/Manager Information.txt");
    FileWriter fileWriter = null;
    FileReader fileReader = null;
    String line;
    boolean isContaintFound;
    int count;
    Scanner sc = new Scanner(System.in);
    String id;
    char choice;

    public void AddManager() {
        Manager m1 = new Manager();
        System.out.println("----Add Manager----");

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        m1.setName(name);
        sc.nextLine();

        System.out.println("Enter your Id:");
        String managerId = sc.nextLine();
        m1.setManagerId(managerId);

        System.out.println("Enter your registration number:");
        String regiNo = sc.nextLine();
        m1.setRegiNo(regiNo);

        System.out.println("Enter your address:");
        String address = sc.nextLine();
        m1.setAddress(address);

        System.out.println("Enter your email Id:");
        String email = sc.nextLine();
        m1.setEmail(email);

        System.out.println("Enter your nationality:");
        String nationality = sc.nextLine();
        m1.setNationality(nationality);

        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        m1.setSalary(salary);



        try {

            fileWriter = new FileWriter(file, true);
            fileWriter.write("\n\nManager Name: " + m1.getName() + "\nManager ID: " + m1.getManagerId() + "\nManager Registration No: " + m1.getRegiNo() + "\nManager Email Id: " + m1.getEmail() + "\nManager Nationality:" + m1.getNationality() + "\nManager Salary:" + m1.getSalary());

            System.out.println("\nInformation Sucessfully added!!");
        } catch (IOException io) {
            System.out.println("IOException caught!!");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException io) {
                System.out.println("Can not close the resource!!");
            }
        }
    }



    public void AddEmployee() {
        Employee e1 = new Employee();
        System.out.println("----Add Employee----");

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        e1.setName(name);
        sc.nextLine();

        System.out.println("Enter your Id:");
        String employeeId = sc.nextLine();
        e1.setEmployeeId(employeeId);

        System.out.println("Enter your address:");
        String address = sc.nextLine();
        e1.setAddress(address);

        System.out.println("Enter your contact No:");
        String contactNo = sc.nextLine();
        e1.setContactNo(contactNo);

        System.out.println("Enter your nationality:");
        String nationality = sc.nextLine();
        e1.setNationality(nationality);

        System.out.println("Enter your joining date:");
        String joiningDate = sc.nextLine();
        e1.setJoiningDate(joiningDate);

        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();
        e1.setSalary(salary);


        try {

            File VehiclesFile = new File("data/Employee Information.txt");

            fileWriter = new FileWriter(VehiclesFile, true);
            fileWriter.write("\n\nEmployee Name: " + e1.getName() + "\nEmployee ID: " + e1.getEmployeeId() + "\nEmployee Address: " + e1.getAddress() + "\nEmployee ContactNo: " + e1.getContactNo() + "\nEmployee Nationality:" + e1.getNationality() + "\nEmployee Joining Date:" + e1.getJoiningDate() + "\nEmployee Salary:" + e1.getSalary());

            System.out.println("\nInformation Sucessfully added!!");
        } catch (IOException io) {
            System.out.println("IOException caught!!");
        } finally {
            try {
                fileWriter.close();
            } catch (IOException io) {
                System.out.println("Can not close the resource!!");
            }
        }
    }


    public void showAllEmployee() {
    	
    	 System.out.println("----Show all employee----");

        try {

            fileReader = new FileReader("data/Employee Information.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException io) {
            System.out.println("IOException caught!!");
        } finally {
            try {
                fileReader.close();
            } catch (IOException io) {
                System.out.println("Can not close the resource!!");
            }
        }
    }


    public void stockVehicle(int vehicleId) {



        System.out.println("---Show All Stock Vehicle---");

        try {

            fileWriter = new FileWriter("data/Manager Information.txt", true);

            fileReader = new FileReader("data/Vehicles Information.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = null;
            isContaintFound = false;
            count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException io) {
            System.out.println("IOException caught!!");
        } finally {

            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException io) {
                System.out.println("Can not close the resource!!");
            }
        }

    }

}
       
       
       
       
       
       
       
       
       
       

    	   
    	   
    	   
    	   
 
    	   
    	   
    	   
    	   
    	   
    	   
    























