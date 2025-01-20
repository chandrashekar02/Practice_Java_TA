package practice.main.UserInput_ex;

import java.util.Scanner;

public class ScannerExample
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);         //Scanner is the class, creating a Scanner object to read the user input.

        System.out.println("enter the Number ");
        int in = sc.nextInt();                    //Integer

        System.out.println("Enter the text");
        String st = sc.next();                    //String

        System.out.println("Enter the long number");
        long lo = sc.nextLong();                  //long

        System.out.println("Enter True/False");
        boolean bo = sc.nextBoolean();            //Boolean

        System.out.println(in);
        System.out.println(st);
        System.out.println(lo);
        System.out.println(bo);

        sc.close();
    }
}
