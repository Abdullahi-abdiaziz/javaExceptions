package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class builtInExceptions {

    public static void main(String[] args)  {
	// write your code here
        try {
            String name = null;
            System.out.println(name.length());
        }
        catch (NullPointerException npe) {
            System.out.println("the String is null");
        }
        System.out.println("--------------------------------------");

        try {
            int a=10 , b=0 ;
            int c = a/b ;
            System.out.println("Result is : "+c);
        }
        catch (ArithmeticException A) {
            System.out.println("Number cannot be devided by zero");
        }
        System.out.println("--------------------------------------");

        try {
            int arr[] = new int[5];
            arr[7] = 10;
        }
        catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Array Index Out Of Bounds");
        }
        System.out.println("--------------------------------------");

        try {
            int num = Integer.parseInt("Somalia");
            System.out.println(num);
        }
        catch (NumberFormatException nfe) {
            System.out.println("Number Format Exception");
        }
        System.out.println("--------------------------------------");
        try {
            readFile("myfile.txt");
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File not Found");
        }
    }
    private static void readFile(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader(fileName);
    }

}
