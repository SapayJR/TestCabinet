package PaymentTest;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Mobile extends WebDriverSettings {


    @Test
    public void Beeline() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[2]/ul/li[2]/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Оплатить")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();

        Assert.assertEquals("Ошибка! Формат некорректно", driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("1203445");
        Thread.sleep(3000);
        Assert.assertEquals("UPAY - Мобильная связь", driver.getTitle());
        Assert.assertEquals("                        90\n" +
                "                        91\n" +
                "                    ",
         driver.findElement(By.id("type")).getText());


        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(5000);

        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.cssSelector("p > strong")).getText());

        driver.findElement(By.id("checkStep")).click();
        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("50");
        Thread.sleep(2000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Thread.sleep(5000);

        Assert.assertEquals("UPAY - Мобильная связь", driver.getTitle());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));

        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(5000);



    }

    @Test
    public void Ucell() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[2]/ul/li[2]/a/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[2]")).click();
        Thread.sleep(3000);

        Assert.
                assertTrue(isElementPresent(By.id("type")));
        new Select(driver.findElement(By.id("type"))).selectByVisibleText("94");
        Thread.sleep(2000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("4009051");
        Thread.sleep(3000);

        Assert.
                assertEquals("UPAY - Мобильная связь", driver.getTitle());
        Assert.
                assertTrue
                        (isElementPresent
                                (By.cssSelector
                                        ("#dataTableLoad_length > label")));
        Assert.
                assertTrue
                        (isElementPresent
                                (By.cssSelector
                                        ("header.panel-heading")
                                )
                        );

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.
                assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.
                assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.
                assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(2000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);


        Assert.
                assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Thread.sleep(10000);

        Assert.
                assertEquals
                        ("Неверная сумма для платежа",
                                driver.findElement(By.cssSelector("#danger > p.text")).getText());
        Assert.
                assertEquals
                        ("Ошибка!", driver.findElement
                                (By.cssSelector("h4")).getText());

    }

}
