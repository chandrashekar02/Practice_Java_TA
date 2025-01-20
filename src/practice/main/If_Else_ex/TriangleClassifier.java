package practice.main.If_Else_ex;

import java.util.Scanner;

public class TriangleClassifier {

    public static void main(String[] args) {

        /*
        Write a program that classifies a triangle based on its side lengths.

        Given three input values representing the length of the sides, determine if the triangle
        is equilateral (all sides are equal), isosceles(exactly two sides are equal),
        or scalene (no sides are equal). Use an If-else statement to classify the triangle.
         */

        //Datatype -> double
        //output -> String (Equilateral, Isosceles, Scalene)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side 1 length of the triangle: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the side 2 length of the triangle: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter the side 3 length of the triangle: ");
        double side3 = sc.nextDouble();

        String triangle;

        if(side1<0 || side2<0 || side3<0){
            //System.out.println("Invalid Input: Value should be positive");
            triangle = "Invalid Input: Value should be positive";
        }
        else if(side1 ==side2 && side2 == side3)
        {
            //System.out.println("Triangle is Equilateral");
            triangle = "Equilateral";
        } else if (side1 == side2 || side2==side3 || side1==side3)
        {
            //System.out.println("Triangle is Isosceles");
            triangle = "Isosceles";
        }else
        {
            //System.out.println("Triangle is Scalene");
            triangle = "Scalene";
        }
        System.out.println("Your triangle is "+triangle);
        sc.close();
    }
}
