package practice.main.Arrays_ex;

import java.util.Scanner;

public class Array_math {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();   //User input for size of the array

        int[] num1 = new int[size];  //creating a array object with size of "size"

        System.out.println("Enter the array values ");
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();     //user input for array values
            num1[i] = num;
        }

            int max = num1[0];
            int min = num1[0];
            for (int number : num1) {
                max = Math.max(max, number);
                min= Math.min(min, number);

            }
            System.out.println("maximum number is " + max);
        System.out.println("minimum number is "+min);

        }
    }




