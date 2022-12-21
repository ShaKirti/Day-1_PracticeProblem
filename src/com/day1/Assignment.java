package com.day1;

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
public class Assignment {
    public static void main(String[] args) {
        System.out.println("Welcome to Day 1 practice problem.");

        // Default value of all primitive datatypes

        defaultValuesOfPrimitiveDataTypes myObj = new defaultValuesOfPrimitiveDataTypes();
        myObj.printValues();
    }
}
