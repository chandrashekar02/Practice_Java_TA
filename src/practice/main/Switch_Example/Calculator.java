package practice.main.Switch_Example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the 2nd Number ");
        double num2 = sc.nextDouble();

        System.out.println("Enter the Operator");
        String operator = sc.next();
        switch (operator){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "/" :
                System.out.println(num1/num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "%":
                System.out.println(num1%num2);
                break;
            default:
                System.out.println("Invalid input");
                break;

        }
    }
}
