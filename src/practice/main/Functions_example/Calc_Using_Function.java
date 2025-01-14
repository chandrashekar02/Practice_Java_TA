package practice.main.Functions_example;

import java.util.Scanner;

public class Calc_Using_Function {

    //Create a function of Sum, Sub, Mul and  Div with parameters a&b. Take the user inputs.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number");
        int c = sc.nextInt();
        System.out.println("Enter the second number");
        int d = sc.nextInt();
        System.out.println("Enter the operation");
        String operation = sc.next();

        switch (operation){
            case "+" -> System.out.println(sum(c, d));
            case "-" -> System.out.println(sub(c, d));
            case "*" -> System.out.println(multi(c, d));
            case "/" -> System.out.println(div(c, d));
            default -> System.out.println("Invalid Input");
        }
        sc.close();

    }

    //sum
    static int sum(int a, int b)
    {
        return a+b;
    }

    //Sub
    static int sub(int a, int b)
    {
        return a-b;
    }

    //Multiplication
    static int multi(int a, int b)
    {
        return a*b;
    }

    //Div
    static int div(int a, int b)
    {
        return a/b;
    }
}
