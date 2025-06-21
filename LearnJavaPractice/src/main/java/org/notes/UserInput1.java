package org.notes;

import java.util.*;
public class UserInput1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name= sc.nextLine();
        System.out.println("Hello, "+name);

        System.out.println("Enter your age: ");
        int age=sc.nextInt();
        System.out.println("Age: "+age);

        System.out.println("Enter your gpa: ");
        double gpa=sc.nextDouble();
        System.out.println("Gpa: "+gpa);

        System.out.println("Are you a student(true/false): ");
        boolean isStudent=sc.nextBoolean();
        if(isStudent){
            System.out.println("You are enrolled as a student.");
        }else {
            System.out.println("You are not a student.");
        }

        sc.close();
    }
}
