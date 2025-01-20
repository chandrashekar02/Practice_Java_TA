package practice.main.Switch_Example;

import java.util.Scanner;

public class MonthSelector {

    /*
    Write a program that takes an integer input from 1 to 12 and prints the name of the
    corresponding month using switch statement
     */
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the month number: ");
    int month = sc.nextInt();
    
    switch (month){
        case 1 -> System.out.println("This month is Jan");
        case 2 -> System.out.println("This month is Feb");
        case 3 -> System.out.println("This month is Mar");
        case 4 -> System.out.println("This month is Apr");
        case 5 -> System.out.println("This month is May");
        case 6 -> System.out.println("This month is Jun");
        case 7 -> System.out.println("This month is Jul");
        case 8 -> System.out.println("This month is Aug");
        case 9 -> System.out.println("This month is Sep");
        case 10 -> System.out.println("This month is Oct");
        case 11 -> System.out.println("This month is Nov");
        case 12 -> System.out.println("This month is Dec");
        default -> System.out.println("Invalid Month Number");
        }
sc.close();
    }
}
