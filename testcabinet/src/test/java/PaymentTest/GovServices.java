package PaymentTest;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class GovServices extends WebDriverSettings {

    @Test
    public void Notarius() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Гос. услуги")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Гос. услуги",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertEquals("Ассоциация Хунарманд",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/h4")).getText());
        Assert.assertEquals("Регистрация бизнеса",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertEquals("Штрафы ГУБДД",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertEquals("Членские взносы ТПП",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());
        Assert.assertEquals("Нотариус",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Нотариус",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Номер инвойса",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Нотариус",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));

        driver.findElement(By.id("findStep")).click();
        Assert.assertEquals("Ошибка! Формат некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("94753808238720");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("loader_box"));
        Thread.sleep(5000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Номер инвойса :",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер инвойса : 94753808238720",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Сумма :",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert.assertEquals("Сумма : 500.00",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("ФИО: :",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[4]/strong")).getText());
        Assert.assertEquals("BALTABAEV",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[4]/span")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
            Assert.assertEquals("503",
                    driver.findElement(By.id("summa")).getAttribute("value"));
        Assert.assertEquals("0.6 %",
                driver.findElement(By.id("commissionRate")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(5000);









    }
}
