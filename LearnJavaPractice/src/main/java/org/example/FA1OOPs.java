package org.example;

import java.util.Scanner; // Importing Scanner class for user input
import java.util.*; // Importing all classes from java.util package (redundant here)

public class FA1OOPs {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in); // Creating a Scanner object for input

        int n= sc.nextInt();sc.nextLine(); // Reading the number of trucks and consuming the newline character
        Truck[] truck = new Truck[n]; // Creating an array to store Truck objects

        // Loop to take input for each Truck object
        for(int i=0;i<n;i++){
            int truckId=sc.nextInt();sc.nextLine(); // Reading truckId and consuming newline
            String manufacture=sc.nextLine(); // Reading manufacturer name
            double capacity =sc.nextDouble();sc.nextLine(); // Reading truck capacity and consuming newline
            double mileage = sc.nextDouble(); // Reading mileage
            truck[i] =new Truck(truckId,manufacture,capacity,mileage); // Creating Truck object and storing it in array
        }

        String companyName=sc.nextLine(); // Reading the name of the manufacturer to search for
        findTruckWithMinimumCapacity(truck,companyName); // Calling method to find truck with minimum capacity
    }

    // Method to find and display the truck with the minimum capacity for a given manufacturer
    public static void findTruckWithMinimumCapacity(Truck[] truck,String str){
        double min = Double.MAX_VALUE; // Initializing minimum capacity to the highest possible value
        int truckWithMinCap= -1; // Variable to store index of truck with minimum capacity

        // Looping through the truck array
        for(int i=0;i<truck.length;i++) {
            // Checking if the truck's manufacturer matches the input string
            if (truck[i].manufacturer.trim().equalsIgnoreCase(str.trim()))
            {
                // Updating the minimum capacity if a smaller one is found
                if (min > truck[i].capacity) {
                    min = truck[i].capacity;
                    truckWithMinCap = i; // Storing the index of the truck with minimum capacity
                }
            }
        }

        // If no matching truck is found, display "No Truck Found"
        if(truckWithMinCap ==-1){
            System.out.println("No Truck Found");
        } else {
            // Displaying the details of the truck with minimum capacity
            System.out.println("truckId-" + truck[truckWithMinCap].truckId);
            System.out.println("manufacturer-" + truck[truckWithMinCap].manufacturer);
            System.out.println("capacity-" + truck[truckWithMinCap].capacity);
            System.out.println("mileage-" + truck[truckWithMinCap].mileage);
        }
    }
}

// Truck class to represent a truck object
class Truck{
    public int truckId; // Truck ID
    public String manufacturer; // Manufacturer name
    public double capacity; // Capacity of the truck
    public double mileage; // Mileage of the truck

    // Constructor to initialize truck attributes
    public Truck(int truckId,String manufacture,double capacity,double mileage){
        this.truckId=truckId;
        this.manufacturer=manufacture;
        this.capacity=capacity;
        this.mileage=mileage;
    }
}
