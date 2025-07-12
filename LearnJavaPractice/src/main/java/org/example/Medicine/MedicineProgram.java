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
        String str=sc.nextLine();
        getPriceByDisease(M,str);
    }
    static void getPriceByDisease(Medicine[] M,String str){
        int index=-1;
        for(int i=0;i<M.length;i++){
            if(M[i].disease.equalsIgnoreCase(str)){
                index=M[i].price;
            }
        }
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println(M[index].price);
        }
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