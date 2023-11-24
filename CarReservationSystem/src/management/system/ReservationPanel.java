package management.system;

import java.io.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;

public class ReservationPanel {

    File file = new File("data/Reserved Information.txt");
    FileWriter fileWriter = null;
    FileReader fileReader = null;
    String line;
    boolean isContaintFound;
    int count;
    char choice;


    public void reserve() {


        Scanner in = new Scanner(System.in);
        System.out.println("Enter Vehicles ID: ");
        int Id = in .nextInt();

        if (Vehicle(Id) == true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter NID No: ");
            String nidNo = sc.nextLine();


            System.out.println("Enter Name: ");
            String name = sc.nextLine();

            System.out.println("Enter Phone Number: ");
            String phoneNo = sc.nextLine();


            if (reservationstatus(nidNo) == false) {
                System.out.println("Pay $100 to reserve this vehicle\nVehicle Id is " + Id);
                System.out.print("Amount = ");
                double amount = sc.nextDouble();
                if (amount == 100) {
                    try {
                        fileWriter = new FileWriter(file, true);

                        fileWriter.write("\n\nNID No: " + nidNo + "Reserved" + "\nReserved Vehicle Id: " + Id + "\nCustomer Name: " + name + "\nPhone: " + phoneNo + "\nPaid Amount: " + amount);


                        System.out.println("\nSuccessfully Reserved!!");


                    } catch (IOException io) {
                        System.out.println("IOException caught!!");
                    } finally {
                        try {
                            fileWriter.close();


                        } catch (IOException io) {
                            System.out.println("Can not close the resource!!");
                        }
                    }

                    try {
                        File BillFile = new File("data/Total bill.txt");
                        String oldBill = ReadLine(BillFile);
                        double bill = Double.parseDouble(oldBill);
                        bill = bill + amount;
                        UpdateFile(BillFile, oldBill, Double.toString(bill));

                    } finally {
                        try {
                            fileWriter.close();


                        } catch (IOException io) {
                            System.out.println("IOException caught!!");
                        }
                    }
                } else {
                    System.out.println("Please pay only $100 !");
                }
            } else {
                System.out.println("You already reserved vehicles. Please return first.");
            }
        } else {
            System.out.println("Selected Vehicle not found!");
        }
    }




    public boolean Vehicle(int Id) {
        try {
            File vehiclesFile = new File("data/Vehicles Information.txt");
            fileReader = new FileReader(vehiclesFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("Vehicle ID: " + Id)) {
                    return true;
                }
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
        return false;
    }

    public boolean reservationstatus(String nid) {
        try {
            File reservationFile = new File("data/Reserved Information.txt");
            fileReader = new FileReader(reservationFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("NID No: " + nid + "Reserved")) {


                    return true;
                }
            }
        } catch (IOException io) {
            System.out.println("IOException caught in reservation status!!");
        } finally {
            try {
                fileReader.close();

            } catch (IOException io) {
                System.out.println("Can not close the resource!!");
            }
        }
        return false;
    }


    public void returnVehicle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter NID to search reserved info:");
        String nid = in .nextLine();

        if (reservationstatus(nid) == true) {
            String oldLine = "NID No: " + nid + "Reserved";
            String newLine = "NID No: " + nid + "Returned";
            UpdateFile(file, oldLine, newLine);

            System.out.println("The vehicle has been returned!!");

        } else {
            System.out.println("Reservation info not exist!");
        }

    }


    public void UpdateFile(File file, String oldLine, String newLine) {
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            line = null;
            boolean isContainsFound = false;


            Scanner sc = new Scanner(file);
            StringBuffer buffer = new StringBuffer();
            while (sc.hasNextLine()) {
                buffer.append(sc.nextLine() + System.lineSeparator());
            }
            String fileContents = buffer.toString();
            sc.close();



            fileContents = fileContents.replaceAll(oldLine, newLine);
            FileWriter writer = new FileWriter(file);
            writer.append(fileContents);
            writer.flush();

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

    public String ReadLine(File newfile) {
        try {
            fileWriter = new FileWriter(newfile, true);


            fileReader = new FileReader(newfile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            if (newfile.length() != 0) {
                while ((line = bufferedReader.readLine()) != null) {
                    return line;
                }
            } else {
                line = "0.00";
                fileWriter.write(line);
                return line;
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
        return line;
    }
}