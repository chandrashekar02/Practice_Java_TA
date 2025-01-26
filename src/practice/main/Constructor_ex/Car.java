package practice.main.Constructor_ex;

public class Car {
    String model;
    int year;
    String name;


    //default constructor
    Car(){
        name="Unknown name";
        model="XYZ";
        year=0;
        System.out.println("DC is executed");
    }
}
