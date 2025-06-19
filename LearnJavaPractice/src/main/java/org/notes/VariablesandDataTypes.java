package org.notes;


/*
    variables ->    a reusable container for a value
                    a variable behaves as if it was the value it contains

    Primitive -> simple value stored directly in memory (stack)
    Reference -> memory address (Stack) that points to the (heap)

* */
public class VariablesandDataTypes {
    public static void main(String[] args){

//        integer(int): used for storing whole numbers
        int age=30;
        int year=2025;
        int quantity=1;
        System.out.println("I am "+age+" years old as of "+year+" with "+quantity);

//        double(decimal) : used for storing decimal numbers
        double price=19.99;
        double gpa=3.5;
        double temperature=-12.5;
        double a=16;
        System.out.println("$ " +price);
        System.out.println(gpa);
        System.out.println(temperature);
        System.out.println(a);

//        character(char):used for storing single character inside single quote(' ')
        char grade='A';
        char symbol='!';
        char currency='$';
        System.out.println(grade+" "+symbol+" "+currency);

//        boolean(bool) : are either true or false
        boolean isStudent = true;
        boolean isSale = false;
        boolean isOnline = true;

        if(isStudent){
            System.out.println("You are a student.");
        }else{
            System.out.println("You are not  student.");
        }

//        String:used to store series of characters
        String name="Bro code";
        System.out.println(name);
        String food="pizza";
        String email="false@gmail.com";
        String car="Mustang";
        String color="red";
        System.out.println("You are "+age+" years old");
        System.out.println("Hello, " + name);
        System.out.println("Your gpa is: "+gpa);
        System.out.println("Your average letter is: " + grade);
        System.out.println("Your choice is a "+color+" "+year+" "+car);
        System.out.println("The price is:"+currency+" "+price);

        if(isSale){
            System.out.println("There is a "+car+" for sale.");
        }else{
            System.out.println("The "+car+"is not for sale.");
        }
    }
}
