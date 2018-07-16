package PaymentTest;

import org.junit.Assert;
import org.junit.Test;
import Settings.WebDriverSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DashBoard extends WebDriverSettings {


    @Test

        public void Board() throws Exception {

        Assert.assertEquals("Рабочая панель", driver.getTitle());
        Assert.assertEquals("Оплата услуг", driver.findElement(By.xpath("//a/span[2]")).getText());
        Assert.assertEquals("Последние платежи", driver.findElement(By.cssSelector("span.h3")).getText());
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("th.sorting")));
        Assert.assertTrue(isElementPresent(By.xpath("//table[@id='dataTableLoad']/thead/tr/th[2]")));
        Assert.assertTrue(isElementPresent(By.xpath("//table[@id='dataTableLoad']/thead/tr/th[3]")));
        Assert.assertTrue(isElementPresent(By.xpath("//table[@id='dataTableLoad']/thead/tr/th[4]")));
        Assert.assertTrue(isElementPresent(By.xpath("//table[@id='dataTableLoad']/thead/tr/th[5]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("th.sorting_desc")));
        Assert.assertTrue(isElementPresent(By.id("serviceType")));
        Assert.assertTrue(isElementPresent(By.xpath("//table[@id='dataTableLoad']/tbody/tr[7]/td[6]/div/a/i")));
        Assert.assertTrue(isElementPresent(By.cssSelector("input[type=\"text\"]")));

        new Select(driver.findElement(By.name("dataTableLoad_length"))).selectByVisibleText("100");
        Thread.sleep(2000);

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[2]/ul/li/a/span")).click();
        Thread.sleep(10000);

        driver.findElement(By.linkText("Рабочая панель")).click();

        new Select(driver.findElement(By.id("serviceType"))).selectByVisibleText("Коммунальные услуги");
        driver.findElement(By.cssSelector("option[value=\"3\"]")).click();

        new Select(driver.findElement(By.id("serviceType"))).selectByVisibleText("Мобильная связь");
        driver.findElement(By.cssSelector("option[value=\"1\"]")).click();

        new Select(driver.findElement(By.id("serviceType"))).selectByVisibleText("Интернет");
        driver.findElement(By.cssSelector("option[value=\"2\"]")).click();

        new Select(driver.findElement(By.id("serviceType"))).selectByVisibleText("Телевидение");
        driver.findElement(By.cssSelector("option[value=\"5\"]")).click();

        new Select(driver.findElement(By.id("serviceType"))).selectByVisibleText("Интернет ресурсы");
        driver.findElement(By.cssSelector("option[value=\"7\"]")).click();


        Assert.assertTrue(isElementPresent(By.cssSelector("div.morris-hover-row-label")));



    }


}
