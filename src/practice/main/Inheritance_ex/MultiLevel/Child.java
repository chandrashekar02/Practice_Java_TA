package practice.main.Inheritance_ex.MultiLevel;

public class Child extends Father{
    void child(){
        System.out.println("child");
    }

    void home(){
        System.out.println("child home");
    }

    public static void main(String[] args) {

        Child ch = new Child();
        ch.child();
        ch.home();
        ch.f();
        ch.gf();
        ch.extra();
    }
}


//bottom to top
//if child doesn't have the home then it will take from father
//if father also doesn't have the home then it will take from grandfather