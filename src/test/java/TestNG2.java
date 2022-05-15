import org.testng.Assert;
import org.testng.annotations.Test;

@Test()
public class TestNG2 {

    @Test (priority = 1)
    void setup () {
        System.out.println("This is a setup test");
    }

    @Test (priority = 2)
    void addCustomer(){
        System.out.println("This is add customer test");
    }

    @Test (priority = 3)
    void searchCustomer(){
        System.out.println("This is search customer test");
        Assert.assertEquals(1,1);
    }

    @Test (priority = 4)
    void teardown(){
        System.out.println("Closing browser");
    }

}