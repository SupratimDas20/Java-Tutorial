package org.example;
import java.util.*;

public class PractGetSet {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Student1 s1 = new Student1(22,100);
        System.out.println(s1.getAge());
        System.out.println(s1.getRoll());
        s1.setAge(21);
        s1.setRoll(102);
        System.out.println(s1.getAge());
        System.out.println(s1.getRoll());

    }
}
class Student1{
    private int age;
    private int roll;

//    parameterized constructor
    public Student1(int age,int roll){
        this.age=age;
        this.roll=roll;
    }
//    getters
    public int getAge(){
        return age;
    }
    public int getRoll(){
        return roll;
    }
//    setters
    public void setAge(int age){
        this.age=age;
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
}