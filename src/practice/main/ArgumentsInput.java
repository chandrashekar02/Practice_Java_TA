package practice.main;

public class ArgumentsInput {
    public static void main(String[] args) {

        //If a person age is >25 then allowed to go Goa
        //Write a program for above condition age should be user input.

        //***** 1. Argument Input **********

        // int age = 30; //This is Hard coding.

        //Go to Configuration -> Edit configuration -> CLI arguments for your application(Program arguments)
        // -> Enter the value.

        int age = Integer.parseInt(args[0]);
        //Entered arguments will store in args[0] in string format and Integer.parseInt() will convert it into int.
        // Converted int will store into age variable.
        System.out.println(age>25? "Allowed to go" : "Not allowed to go");

    }
}
