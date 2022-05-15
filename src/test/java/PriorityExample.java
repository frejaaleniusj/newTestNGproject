import org.testng.annotations.Test;

public class PriorityExample {

    @Test (priority = 0)
    void TestOne(){
        System.out.println("this is test 1");
    }

    @Test (priority = 1)
    void TestTwo(){
        System.out.println("this is test 2");
    }

    @Test (priority = 2)
    void TestThree(){
        System.out.println("this is test 3");
    }

    @Test (priority = 3, enabled = false)
    void TestFour(){
        System.out.println("this is test 4");
    }

}
