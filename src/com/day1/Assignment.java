package com.day1;

import java.util.Scanner;

class defaultValuesOfPrimitiveDataTypes{
    int i;
    double d;
    float f;
    long l;
    boolean istrue;
    byte b;
    short s;
    char ch;

    void printValues(){
        System.out.println("Default value of int: "+i);
        System.out.println("Default value of double: "+d);
        System.out.println("Default value of float: "+f);
        System.out.println("Default value of long: "+l);
        System.out.println("Default value of boolean: "+istrue);
        System.out.println("Default value of byte: "+b);
        System.out.println("Default value of short: "+s);
        System.out.println("Default value of char: "+ch);
    }
}

class StringEquality{
    void checkStringEquality() {
        System.out.println("Enter the first string:");
        String str1 = new Scanner(System.in).nextLine();

        System.out.println("Enter the second string:");
        String str2 = new Scanner(System.in).nextLine();

        if (str1.equals(str2)){
            System.out.println("Strings are equal.");
        }
        else
            System.out.println("String are not equal.");
    }
}

class DifferentVariables{
    static int num = 3;
    int methodVariable(){
        return num;
    }

    void method(){
        int num = 90;
        System.out.println(num);
    }
}
public class Assignment {
    public static void main(String[] args) {
        System.out.println("Welcome to Day 1 practice problem.");

        // Default value of all primitive datatypes
        defaultValuesOfPrimitiveDataTypes myObj = new defaultValuesOfPrimitiveDataTypes();
        myObj.printValues();

        // Check the string equality
        StringEquality stringEquality = new StringEquality();
        stringEquality.checkStringEquality();

        // Demonstrate static variables, methods, and blocks.
        DifferentVariables variables = new DifferentVariables();

        // static variable is defined by using static keyword & you can't declare it inside the body of the method.
        System.out.println(variables.methodVariable());

        // instance/block variable is defined inside the class but outside the body of the method.
        {
            int num = 22;
            System.out.println(num);
        }
        System.out.println(DifferentVariables.num);

        // Local variable
        variables.method();
    }
}
