package org.example.Medicine;

import java.util.Scanner;

public class MedicineProgram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();sc.nextLine();
        Medicine[] M = new Medicine[n];
        for(int i=0;i<n;i++){
            String MedicineName=sc.nextLine();
            String batch=sc.nextLine();
            String disease=sc.nextLine();
            int price=sc.nextInt();sc.nextLine();
            M[i]=new Medicine(MedicineName,batch,disease,price);
        }
        getPriceByDisease
    }

}
class Medicine{
    public String MedicineName;
    public String batch;
    public String disease;
    public int price;

    public Medicine(String MedicineName, String batch, String disease, int price){
        this.MedicineName=MedicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }

}