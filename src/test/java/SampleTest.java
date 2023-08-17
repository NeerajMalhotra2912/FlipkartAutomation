import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
    @Test
        public void Test1() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qavalidation.com/2018/08/pom-xml-to-run-selenium-or-appium-tests.html/");

        Thread.sleep(3000);
        System.out.println("Hello Automation");
    }
}
