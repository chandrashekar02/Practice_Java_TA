package practice.main;

import java.util.Scanner;

public class GradeCalculator {

    /*
    Grade calculator
    Write a program that calculates and display the letter grade
    for a given numerical score (e.g. A, B, C, D, F)
    Based on the following grade score

    A- 90-100
    B- 80-89
    C- 70-79
    D- 60-69
    F- 0-59
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks:- ");
        int marks = sc.nextInt();
        char grade = 'f';   //default grade will be f

        if(marks>=90 && marks<=100){
           // System.out.println("Your grade is A");
            grade = 'A';
        }else if(marks >=80 && marks<90){
          //  System.out.println("Your grade is B");
            grade = 'B';
        }else if(marks >= 70 && marks <80){
           // System.out.println("your grade is C");
            grade = 'C';
        }else if(marks >= 60 && marks <70) {
          //  System.out.println("your grade is D");
            grade = 'D';
        }else if(marks >=0 && marks<60){
           // System.out.println("Your grade is F");
            grade = 'F';
        }else{        //Extra edge case
            System.out.println("Input is invalid...");
            grade = 'O';
        }
        System.out.println("Your Grade is " + grade);

        sc.close();   //Close the Scanner
    }
}
