package practice.main.Ternary_Condition_ex;

import java.util.Scanner;

public class MartksCard {
    public static void main(String[] args) {

        /* Using Nested Ternary operation create a Marks card grade.

        If the score is above 90then grade will be A
        if the score is between 80 and 89 then grade will be B
        if the score is between 70 and 79 then grade will be C
        if the score is between 60 and 69 then grade will be D
        if the score is below 60 then grade will be F
         */

        //Using Scanner for User inputs for marks.
        System.out.println("Please Enter the Marks: ");
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

       // int score = 50;   //-> Direct Input from the user.

        //String grade = Condition1? "Expression1" : (Condition2? "Expression2" : "Expression3");

        String grade = score >= 90 && score<=100? "Grade is A" : (score>=80 && score <90? "Grade is B" :
                       (score>=70 && score <80? "Grade is C":
                               (score>=60 && score<70? "Grade is D":
                                       (score<60 && score>=0? "Grade is F" : "Invalid entry"))));

        System.out.println(grade);

        System.out.printf("your %s",grade);  // '%s' will replace the grade value i.e, "Grade is **".
    }
}
