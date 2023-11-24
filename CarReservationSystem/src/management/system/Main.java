package management.system;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        CustomerPanel customerPanel = new CustomerPanel();
        ReservationPanel reservationPanel = new ReservationPanel();
        ManagerPanel managerPanel = new ManagerPanel();
        EmployeePanel employeePanel = new EmployeePanel();


        int i = 1;
        while (i != -1) {
            System.out.println("\nMAIN MENU\n[1] Customer\n[2] Manager\n[3] Employee\n[4] Reservation\n[5] Exit");
            System.out.println("Enter the choice:");
            int choice = in .nextInt();


            if (choice == 1) {
                while (i != -2) {

                    System.out.println("\nCustomer\n[1] Add Customer\n[2] Show Customer Details\n[3] Search Vehicle\n[4] View Vehicle \n[5] Exit");
                    System.out.println("Enter the choice:");
                    int customer_choice = in .nextInt();


                    if (customer_choice == 1) {
                        customerPanel.AddCustomer();
                        continue;
                    } else if (customer_choice == 2) {
                        customerPanel.ShowCustomerDetails();
                        continue;
                   
                    } else if (customer_choice == 3) {
                        System.out.print("Enter Car Id :");
                        Scanner id = new Scanner(System.in);
                        int Id = id.nextInt();

                        customerPanel.searchVehicle(Id);


                        continue;
                    } else if (customer_choice == 4) {
                        System.out.print("Enter Car Id :");
                        Scanner id = new Scanner(System.in);
                        int Id = id.nextInt();
                        customerPanel.ViewVehicle(Id);
                        continue;
                    } else {

                        break;

                    }
                }

            } else if (choice == 2) {
                while (i != -2) {

                    System.out.println("\nManager\n[1] Add Manager\n[2] Add Employee\n[3] Show All Employee\n[4] Stock Vehicle\n[5] Exit");

                    System.out.println("Enter the choice:");
                    int manager_choice = in .nextInt();

                    if (manager_choice == 1) {
                        managerPanel.AddManager();
                        continue;
                    } else if (manager_choice == 2) {
                        managerPanel.AddEmployee();
                        continue;
                    } else if (manager_choice == 3) {
                        managerPanel.showAllEmployee();
                        continue;
                    } else if (manager_choice == 4) {

                        System.out.print("Enter Car Id :");
                        Scanner id = new Scanner(System.in);
                        int Id = id.nextInt();

                        managerPanel.stockVehicle(Id);
                        continue;
                    } else {

                        break;

                    }
                }
            } else if (choice == 3) {
                while (i != -2) {

                    System.out.println("\nEmployee\n[1] Add Vehicle\n[2] Search Vehicle\n[3] View Reservation\n[4] Exit ");
                    System.out.println("Enter the choice:");
                    int employee_choice = in .nextInt();
                    
                        if (employee_choice == 1) {

                        System.out.print("Enter Car Name :");
                        Scanner name = new Scanner(System.in);
                        String Name = name.nextLine();

                        System.out.print("Enter Car Id :");
                        Scanner id = new Scanner(System.in);
                        int Id = id.nextInt();

                        System.out.print("Enter Car Color :");
                        Scanner color = new Scanner(System.in);
                        String Color = color.nextLine();

                        System.out.print("Enter Car Registration No :");
                        Scanner regiNo = new Scanner(System.in);
                        String RegiNo = regiNo.nextLine();

                        System.out.print("Enter Car model no :");
                        Scanner modelNo = new Scanner(System.in);
                        String ModelNo = modelNo.nextLine();

                        employeePanel.AddVehicle(Name, Id, Color, ModelNo, RegiNo);
                        }             

                        else if (employee_choice == 2) {

                        System.out.print("Enter Car Id :");
                        Scanner id = new Scanner(System.in);
                        int Id = id.nextInt();

                        employeePanel.searchVehicle(Id);
                        continue;

                    } else if (employee_choice == 3) {

                        System.out.print("Enter NidNo :");
                        Scanner nid = new Scanner(System.in);
                        String NidNo = nid.nextLine();

                        employeePanel.viewReservation(NidNo);
                        continue;
                    } else {

                        break;
                    }


                }
            } else if (choice == 4) {
                while (i != -2) {


                    System.out.println("\nReservation\n[1] Reserve\n[2] Reservation Status\n[3] Return Vehicle\n[4] Exit ");
                    System.out.println("Enter the choice:");
                    int reserve_choice = in .nextInt();

                    if (reserve_choice == 1) {
                        reservationPanel.reserve();
                        continue;
                    }
                    if (reserve_choice == 2) {
                        System.out.print("Enter Nid No :");
                        Scanner nid = new Scanner(System.in);
                        String Nid = nid.nextLine();
                        reservationPanel.reservationstatus(Nid);
                        if (reservationPanel.reservationstatus(Nid) == true) {
                            System.out.println("The vehicle has been reserved!!");
                        } else {
                            System.out.println("The vehicle has not been  reserved!!");
                        }
                        continue;
                    }

                    if (reserve_choice == 3) {
                        reservationPanel.returnVehicle();
                        continue;


                    } else {

                        break;


                    }

                }

            }

        }

    }
}