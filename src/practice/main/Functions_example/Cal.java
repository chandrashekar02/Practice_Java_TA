package practice.main.Functions_example;

import java.util.Scanner;
public class Cal
{

//Create a function of Sum, Sub, Mul and  Div with parameters a&b. Take the user inputs.

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num1 ");
        int c = sc.nextInt();
        System.out.println("Enter the Num2");
        int d = sc.nextInt();

        System.out.println(sum(c,d));
    }

    static int sum(int a, int b)
    {
        return a+b;
    }

    static int sub(int a, int b)
    {
        return a-b;
    }
}