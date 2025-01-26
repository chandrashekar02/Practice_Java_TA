package practice.main.Arrays_ex;
import java.util.Scanner;

public class Array_searchElement {
    public static void main(String[] args){

  /*      int[] a = {10, 20, 30, 45};

        for(int i=0; i<a.length; i++){
            if(a[i]==30){
                System.out.println("The element is found int the index of "+i);
            }
        }
    */
        //User Inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the values of array ");
        for(int i=0; i<size; i++){
            int values = sc.nextInt();
            array[i]=values;
        }

        //Search the element in the array
        System.out.println("Enter the element to search in the array ");
        int search_element = sc.nextInt();
        for(int k=0; k<size; k++){
            if(search_element==array[k]){
                System.out.println("The element is found in the index of "+k);
            }
        }
    }
}
