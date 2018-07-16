package Settings;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;


import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    public ChromeDriver driver;


    @Before
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cabinet.smst.uz/index.html");
        driver.findElement(By.name("userModel.login")).clear();
        driver.findElement(By.name("userModel.login")).sendKeys("901203445");
        Thread.sleep(2000);
        driver.findElement(By.id("inputPassword")).clear();
        driver.findElement(By.id("inputPassword")).sendKeys("1111");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(15000);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() throws Exception {
        if (driver != null)
            driver.quit();
    }


    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
