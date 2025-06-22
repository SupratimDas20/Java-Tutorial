package org.notes;


/**************************************************************

Prefix operators modify the variable before its value is used,
while postfix operators modify the variable after its original
value has been used.

***************************************************************/
public class IncreDecreOperator {
    public static void main(String[] args){
        int num = 5;
        int result;

//        Pre-incement
        result = ++num; // num becomes 6, then result is assigned 6
        // num is now 6, result is 6
        System.out.println(result);

//        Post-increment
        result = num++; // result is assigned 6, then num becomes 7
        // num is now 7, result is 6
        System.out.println(result);

//        Pre-decrement

        result = --num; // num becomes 6, then result is assigned 6
        // num is now 6, result is 6
        System.out.println(result);

//        Post-decrement
        result = num--; // result is assigned 6, then num becomes 5
        // num is now 5, result is 6
        System.out.println(result);
    }
}
