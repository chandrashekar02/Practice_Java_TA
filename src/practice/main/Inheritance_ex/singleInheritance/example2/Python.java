package practice.main.Inheritance_ex.singleInheritance.example2;

public class Python extends Programming{

    //Extends -> is a
    //Python is a Programming

    //default constructor
Python(){
    System.out.println("DC-> Python");
}

public static void main(String[] args)
    {
         Python p1 = new Python();
         System.out.println(p1.author);
    }
}

