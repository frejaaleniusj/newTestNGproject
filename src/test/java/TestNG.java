import org.testng.annotations.Test;

@Test()
public class TestNG {

     @Test (priority = 1)
     void setup () {
        System.out.println("This is a setup test");
     }


    @Test (priority = 2)
    void login(){
     System.out.println("This is a login test");
    }

    @Test (priority = 3)
    void teardown(){
     System.out.println("Closing browser");
    }

}

