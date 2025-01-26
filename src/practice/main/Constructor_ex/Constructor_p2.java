package practice.main.Constructor_ex;
import java.util.Scanner;
public class Constructor_p2 {
    public static void main(String[] args) {

        //Example for Parameterize constructor
        Car2 c2 = new Car2(2020,"nano");
        System.out.println(c2.name);
        System.out.println(c2.year);

        Car2 c3 = new Car2(2020, "tesla");
        System.out.println(c3.name);
        System.out.println(c3.year);

        //User Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Model name ");
        String model_name_input=sc.next();
        System.out.println("Enter the year ");
        int year_input= sc.nextInt();

        Car2 c4 = new Car2(year_input, model_name_input);
        System.out.println(c4.year);
        System.out.println(c4.name);


    }
}

class Car2{

    String name;
    int year;

    //Parameterized constructor
    Car2(int created_year, String model_name){


        System.out.println("PC is executed");
        this.name=model_name;
        this.year=created_year;

    }
}
