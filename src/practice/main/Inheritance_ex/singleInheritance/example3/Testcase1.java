package practice.main.Inheritance_ex.singleInheritance.example3;

public class Testcase1 extends Comman_BaseTest {

    Testcase1() {
        System.out.println("DC-Child");
    }

    void testcase() {
        openBrowser();
        closeBrowser();
        readingExcel();
    }


/*
    public static void main(String[] args) {
        Testcase1 tc1 = new Testcase1();
        tc1.testcase();
    }

 */ //We can create main method here only or we can create 1 more class "RealTC"
}