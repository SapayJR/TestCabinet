package PaymentTest;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Insurance extends WebDriverSettings {


    @Test
    public void UzbekInvest() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Страхование")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Страхование",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertEquals("Uzbekinvest",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());

        driver.findElement(By.linkText("Оплатить")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Узбекинвест",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Номер телефона",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("+998",
                driver.findElement(By.cssSelector("span.input-group-addon")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Формат телефона некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("907377447");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер телефона: 907377447",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(20000);

    }

}
