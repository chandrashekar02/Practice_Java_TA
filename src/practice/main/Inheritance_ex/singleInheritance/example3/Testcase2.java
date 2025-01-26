package practice.main.Inheritance_ex.singleInheritance.example3;

public class Testcase2 extends Comman_BaseTest{

    Testcase2 (){
        System.out.println("DC-> Testcase2");
    }

    void testcase2(){
        openBrowser();
        System.out.println("TC2 executing");
        readingExcel();
        closeBrowser();
    }
}
