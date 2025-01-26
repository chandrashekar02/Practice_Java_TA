package practice.main.Inheritance_ex.singleInheritance.example1;

public class SingleInheritnce {
    public static void main(String[] args) {
        //Single inheritance
        // Son will get attributes from father
        //only 1 son and 1 father

        Son s1 = new Son();   // Son object is created
        //Son can access all properties from the father and self.
        s1.bhk2();
        s1.bhk3();
        System.out.println(s1.gold_f);

        Father f1 = new Father();
        //Father cannot access son's property, because father doesn't extends son's properties.
        System.out.println(f1.gold_f);
        f1.bhk2();
        //f1.bhk3();  Not possible
    }
}
