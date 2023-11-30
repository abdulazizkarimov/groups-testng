import base.BaseTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MyTest extends BaseTest {

    @Test
    public void myTestCase() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://google.com/");
        System.out.println(driver.getWindowHandle());
        System.out.println("myTestCase()");

        


    }

    @Test
    public void someOtherTestCase() {
        System.out.println("someOtherTestCase()");
    }

    @Test
    public void yetAnotherTestCase() {
        System.out.println("yetAnotherTestCase()");
    }
}
