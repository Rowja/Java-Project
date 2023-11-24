package management.system;
import java.util.Scanner;
import java.io.*;

public class CustomerPanel {

    File file = new File("data/Customer Information.txt");
    FileWriter fileWriter = null;
    FileReader fileReader = null;
    String line;
    boolean isContaintFound;
    int count;
    Scanner sc = new Scanner(System.in);
    String id;
    char choice;


    public void AddCustomer() {
        Customer c1 = new Customer();

        System.out.println("----Show Customer Information----");

        System.out.println("Enter your name:");
        String name = sc.nextLine();
        c1.setName(name);
        sc.nextLine();

        System.out.println("Enter your id:");
        String customerid = sc.nextLine();
        c1.setCustomerId(customerid);


        System.out.println("Enter your address:");
        String address = sc.nextLine();
        c1.setAddress(address);

        System.out.println("Enter your nidNo:");
        String nidNo = sc.nextLine();
        c1.setNidNo(nidNo);

        System.out.println("Enter your nationality:");
        String nationality = sc.nextLine();
        c1.setNationality(nationality);

        System.out.println("Enter your contactNo:");
        String contactNo = sc.nextLine();
        c1.setContactNo(contactNo);

        try {

            fileWriter = new FileWriter(file, true);
            fileWriter.write("\n\nCustomer Name: " + c1.getName() + "\nCustomer ID: " + c1.getCustomerId() + "\nCustomer Address: " + c1.getAddress() + "\nCustomer NidNo: " + c1.getNidNo() + "\nCustomer Nationality:" + c1.getNationality() + "\nCustomer ContactNo:" + c1.getContactNo());

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
    public void ShowCustomerDetails() {
        try {

            fileReader = new FileReader(file);
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

   

    public void searchVehicle(int vehicleId) {

        id = Integer.toString(vehicleId);
        int numberOfLinePrint = 5;
        try {

            fileReader = new FileReader("data/Vehicles Information.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = null;
            isContaintFound = false;
            count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("Vehicle ID: " + id)) {
                    isContaintFound = true;
                    System.out.println(line);
                    count++;
                    continue;
                } else if (isContaintFound && count < numberOfLinePrint) {
                    count++;
                    System.out.println(line);

                }
            }
            if (isContaintFound == false) {
                System.out.println("Vehicle is not found !!");


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

    public void ViewVehicle(int vehicleId) {
        System.out.println("--Show all avilable vehicle--");

        try {



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

            } catch (IOException io) {
                System.out.println("Can not close the resource!!");
            }
        }

    }


}
		
		
		
		
		
		
		
		
		
	














