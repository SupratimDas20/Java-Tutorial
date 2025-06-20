package org.notes;

import java.util.*;
public class UserInput {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        System.out.println("Hello, "+name);
        sc.close();
    }
}
