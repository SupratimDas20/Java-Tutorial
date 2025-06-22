package org.notes;

public class OrderOfPrecedenceOfArthOps {
    public static void main(String[] args){
/*
    ORDER OF OPERATIONS[P--E--M--D--A--S]
    P:Parenthesis
    E:Exponents
    M:Multiplication
    D:Division
    A:Addition
    S:Subtraction
*/
        double result = 3+4*(7-5)/2.0;
        System.out.println(result);//7.0
    }
}
