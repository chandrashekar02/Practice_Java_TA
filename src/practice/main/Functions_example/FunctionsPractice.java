package practice.main.Functions_example;

public class FunctionsPractice {

    /*
    Functions:- Functions are referred to as method in java
                Functions in java are block of code to perform specific task.

    Key points:-
    1) Definition/Declaration:- A function must be declared within the class. (outside main method)
    2) Calling:- After declaration we need to call the function in the main method.

    Types:
    1) Built In: Java already prepared functions.
    2) User Defined:
        a) Without Parameter and without return type.
        b) without Parameter but with return type.
        c) with Parameter and without return type.
        d) with Parameter and with return type.

     */
    public static void main(String[] args) {

        //      Calling the functions inside main method.

        //a)
        greet();  //Calling the greet function

        //b)
        String st = greet_with_message();      //this will return string, so we need to create a variable to store it.
        System.out.println(st);                //using variable performing print action.

        //c)
        greet_with_name("Abhi");           //Here Abhi will store in the name variable and able to perform the task.

        //d)
        int add = sum(15,35);
        System.out.println(add);

    }
            //Creating functions Outside Main Method

                                                       // a) Without Parameter and without return type.
                                                       //Declaring or defining the Function
    static void greet()
    {
        System.out.println("Hi, How are yoy");
    }

                                                        // b) without Parameter but with return type.
    static String greet_with_message()                  //String is the return type.
    {

        return "Hello, you are awesome";
    }

                                                         // c) with Parameter and without return type.
                                                         //Void -> No return type  and String name -> Parameter
    static void greet_with_name(String name)
    {
        System.out.println("Hello, how are you "+name);
    }

                                                         // d) with Parameter and with return type.
                                                         //Here int -> return type and int a & b are the parameters.
    static int sum(int a, int b)
    {
        return a+b;
    }
}
