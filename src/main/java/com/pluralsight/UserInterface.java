package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
private Dealership dealership;
public UserInterface(Dealership dealership) {
    this.dealership = dealership;
}
    public void display() {
    Scanner scanner = new Scanner(System.in);
        init();
        while (true) {
            System.out.println("1) Price");
            System.out.println("2) Make/Model");
            System.out.println("3) Year");
            System.out.println("4) Color");
            System.out.println("5) Mileage");
            System.out.println("6) Vehicle Type");
            System.out.println("7) All Vehicles");

            System.out.println("8) Add Vehicles");
            System.out.println("9) Remove Vehicles");

            System.out.println("10) Exit");

            System.out.print("Please enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
            }
                break;
            }
        }
    private void init() {
        DealershipFileManager dealership = new DealershipFileManager();
        dealership.getDealership();
    }
    private void displayVehicles() {

    }
    /*
    This is just the Dealership options being called upon
    UserInterface();
    display() - This will load the dealership. Loop, display menu, scanner, switch statement for the process() method. Helper method
    private init() - Create dealership object. Instance file class, call getDealership(), returns the this.dealership attribute
    private displayVehicles() (helper) - displays the list and called from ALL get-vehicle methods. contains the vehicles and then loop
    processGetByPriceRequest()
    processGetByMakeModelRequest()
    processGetByYearRequest()
    processGetByColorRequest()
    processGetByMileageRequest()
    processGetByVehicleTypeRequest()
    processGetByAllVehiclesRequest() - all vehicles. Call getAllVehicles(), use displayVehicles().
    processAddVehicleRequest()
    processRemoveVehicleRequest()
     */
}
