package org.notes;

import java.util.*;
public class AreaOFRectangle {
    public static void main(String[] arges){
        double length=0;
        double width=0;
        double area=0;

        Scanner sc= new Scanner(System.in);

        System.out.println("Length: ");
        length=sc.nextDouble();
        sc.nextLine();
        System.out.println("Width: ");
        width=sc.nextDouble();
        sc.nextLine();

        area=length*width;
        System.out.println("Area: "+area+" cm²");

        sc.close();
    }
}
