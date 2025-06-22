package org.notes;

import java.util.*;
public class ConditionalStatements {
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter your name:");
        String name=sc.nextLine();

        System.out.print("Please Enter your age: ");
        int age=sc.nextInt();
        sc.nextLine();

        System.out.println("Are you a student (true/false) :");
        boolean isStudent=sc.nextBoolean();
        sc.nextLine();

        System.out.println("Enter a day: ");
        String day=sc.nextLine();





        //        If-Else
        if(name.isEmpty()){
            System.out.println("You didn't enter your name: ");
        }else{
            System.out.println("Hello, "+name+"!");
        }


        //        If-Else
        if(age>=60){
            System.out.println("You are a senior citizen. ");
        }else if (age>=18){
            System.out.println("You are an adult. ");
        }else{
            System.out.println("You are minor. ");
        }

        if(isStudent){
            System.out.println("Hello, "+name+". You are a student.");
        }else{
            System.out.println("Hello, "+name+". You are not a student.");
        }


        switch(day){
            case "Monday","monday":
                System.out.println("Weekday");
                break;
            case "Tuesday" , "tuesday" :
                System.out.println("Weekday");
                break;
            case "Wednesday","wednesday":
                System.out.println("Weekday");
                break;
            case "Thursday","thursday":
                System.out.println("Weekday");
                break;
            case "Friday","friday":
                System.out.println("Weekday");
                break;
            case "Saturday","saturday":
                System.out.println("Weekend");
                break;
            case "Sunday","sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }

        sc.close();
    }
}
