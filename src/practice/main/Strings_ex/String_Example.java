package practice.main.Strings_ex;

public class String_Example {
    public static void main(String[] args) {

        //String: It is a bunch of characters or sequence of characters.
        //Strings can be created by 2 types
        //1. Using assignment operator (=)   String name = "Ravi";
        //2. Using new operator              String name = new String("Ravi");

        //1. Using assignment operator creating String
      /* This string will store the value in the String constant pool (SCP) memory.
       * Strings are constant; their values cannot be changed after they are created.
       * If the same variable is used for another literal or value then the variable will point to new value,
         but old literal still exist in the SCP memory.
         * String name = "abc";   String name = "hfj";        //2 Strings are present in the SCP with same variable.
       * If the 2 different variable are created with the same literal/value then both variable will point to
         single value only in the String constant pool.
       * EX: String name = "abc";        String = name2 = "abc";      //only 1 string is present in the SCP

       //2. Using new operator
       * Everytime this string will create a new object memory in the object area of Heap area.
       * When we use new operator then new memory will create in the object area.
       * If the different variables the same value then also they are not same in the object area.
       * String name = new String("abc")   String name2 = new String("abc");   //2 strings are created in object area.
      */
        String name = "chandru";
        String name1 = "chandru";
        System.out.println(name == name1);            //true

        String name2 = new String("chandru");
        String name3 = new String ("chandru");
        System.out.println(name2 == name3);            //false
    }
}
