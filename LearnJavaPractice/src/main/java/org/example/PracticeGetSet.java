package org.example;
import java.util.*;


public class PracticeGetSet {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Student s1=new Student(22,100);
        System.out.println("Age of the student"+s1.age);
        System.out.println("Roll number of the student"+s1.roll);

    }
}
class Student{
    int age;
    int roll;

//    parameterized constructor
    public Student(int age,int roll){
        this.age=age;
        this.roll=roll;
    }

}