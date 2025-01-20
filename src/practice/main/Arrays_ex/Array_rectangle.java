package practice.main.Arrays_ex;
import java.util.Scanner;
public class Array_rectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of Columns: ");
        int cols = sc.nextInt();

        for(int i=0; i<=rows; i++){
            for(int j=0; j<=cols; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
