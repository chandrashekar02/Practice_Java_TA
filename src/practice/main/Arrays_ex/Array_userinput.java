package practice.main.Arrays_ex;
import java.util.Scanner;
public class Array_userinput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();

        int[] a = new int[size];

        for(int i=0; i<size; i++){
            System.out.println("Enter the number "+(i+1));
            int b = sc.nextInt();
            a[i]=b;
        }

        for(int i=0; i<size; i++) {
            System.out.print(a[i]+"\t");
        }

    }
}
