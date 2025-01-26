package practice.main.Constructor_ex;

public class Constructor_ex {
    public static void main(String[] args) {

        //Example for default constructor

        //New object is created with c1 reference
        Car c1 = new Car();                             //1st object
        //the default value from the car is printed.
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);


        //I can replace the default value
        Car c2 = new Car();                             //2nd object
        c2.name="Tata nano";
        System.out.println(c2.name);
    }


}
