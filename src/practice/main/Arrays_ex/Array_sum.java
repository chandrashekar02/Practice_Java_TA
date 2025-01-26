package practice.main.Arrays_ex;
import java.util.Scanner;
public class Array_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int size = sc.nextInt();
        System.out.println("Enter the array values ");
        int[] ar = new int[size];
        for(int i=0; i<size; i++){
            int values = sc.nextInt();
            ar[i]=values;
        }
      //  int[] a ={15, 20, 34};

        int sum = 0;

        for(int s:ar){
             sum =Math.addExact(s,sum);
        }
        int average = sum/size;
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+average);
    }
}
