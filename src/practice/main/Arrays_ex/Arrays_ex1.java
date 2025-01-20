package practice.main.Arrays_ex;

import java.util.Arrays;

public class Arrays_ex1 {
    public static void main(String[] args) {
        int[] marks = {52, 95, 85, 90,65,98};   //user defined
        Arrays.sort(marks);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks.length);

        String[] names = {"pramod", "ravi", "abhi"};
        System.out.println(names[2]);

        int[] marks1 = new int[5];
        marks1[0]=86;
        marks1[1]=96;
        marks1[2]=65;
        marks1[3]=35;
        marks1[4]=59;
       // marks1[5]=67;   //it is Index out of boundary
        System.out.println(marks1[4]);
        System.out.println(marks1[1]);
        System.out.println(marks1[0]);
        System.out.println(marks1[3]);
        System.out.println(marks1[2]);



    }
}
