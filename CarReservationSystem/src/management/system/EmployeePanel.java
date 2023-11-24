package management.system;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeePanel {

    File file = new File("F://EmployeePanel.txt");
    FileWriter fileWriter = null;
    FileReader fileReader = null;
    String line;
    boolean isContaintFound;
    int count;
    Scanner sc = new Scanner(System.in);
    String id;
    char choice;
    
    
    public void AddVehicle(String name, int id, String color, String modelNo, String regiNo) {
        Vehicle v = new Vehicle();


        v.setName(name);
        v.setId(id);
        v.setColor(color);
        v.setModelNo(modelNo);
        v.setRegiNo(regiNo);



        try {
            File VehiclesFile = new File("data/Vehicles Information.txt");

            fileWriter = new FileWriter(VehiclesFile, true);
            fileWriter.write("\n\nVehicle ID: " + v.getId() + "\nVehicle Name:" + v.getName() + "\nVehicle color:" + v.getColor() + "\nVehicle ModelNo: " + v.getModelNo() + "\nVehicle RegiNo:" + v.getRegiNo());

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





    public void viewReservation(String nid) {

        System.out.println("--Show all reserved vehicle--");



        try {



            fileReader = new FileReader("data/Reserved Information.txt");
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
        		

     
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
   	   
       
   	   
   	   


















   	               
        
        
        
        
        
        
        
    
    
          
    
    
              
          
          
        
    
    
    
    
   	   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
