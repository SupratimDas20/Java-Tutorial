package org.example;

import java.util.Scanner;

public class FA1OOPs {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();sc.nextLine();
        Truck[] truck = new Truck[n];
        for(int i=0;i<n;i++){
            int truckId=sc.nextInt();sc.nextLine();
            String manufacture=sc.nextLine();
            double capacity =sc.nextDouble();sc.nextLine();
            double mileage = sc.nextDouble();
            truck[i] =new Truck(truckId,manufacture,capacity,mileage);
        }
        findTruckWithMinimumCapacity(truck);
    }
    public static void findTruckWithMinimumCapacity(Truck[] truck){
        double min = Double.MAX_VALUE;
        int truckWithMinCap= Integer.parseInt(null);
        for(int i=0;i<truck.length;i++){
            if(min>truck[i].capacity){
                min=truck[i].capacity;
                truckWithMinCap=i;
            }
//            [1,8,7,6,5,] min>
        }
    }
}
class Truck{
    public int truckId;
    public String manufacturer;
    public double capacity;
    public double mileage;

    public Truck(int truckId,String manufacture,double capacity,double mileage){
        this.truckId=truckId;
        this.manufacturer=manufacture;
        this.capacity=capacity;
        this.mileage=mileage;
    }
}