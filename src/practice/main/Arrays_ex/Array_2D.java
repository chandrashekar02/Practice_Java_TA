package practice.main.Arrays_ex;

import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the number of rows ");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns ");
        int c = sc.nextInt();

        for(int rows=0; rows<=r; rows++){
            for(int cols=0; cols<=rows; cols++){

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
