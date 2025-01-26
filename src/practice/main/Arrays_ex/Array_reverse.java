package practice.main.Arrays_ex;
import java.util.Scanner;

public class Array_reverse {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size ");
        int size = sc.nextInt();

        System.out.println("Enter the values ");
        int[] val = new int[size];

        for(int k=0; k<size; k++){
            int values=sc.nextInt();
            val[k]=values;
        }

       // int[] a = {10, 20, 30};
        for(int i=size-1; i>=0; i--){
            System.out.println(val[i]);
        }
    }
}
