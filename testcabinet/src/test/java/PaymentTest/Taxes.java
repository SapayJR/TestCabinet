package PaymentTest;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Taxes extends WebDriverSettings {

    @Test
    public void InsurTaxes() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Налоги")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Оплатить")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Выберите тип налогооблажения для поиска.",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));
        Assert.assertEquals("Налоги",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ИНН:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);



        Assert.assertEquals("Ошибка! Формат некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        new Select(driver.findElement(By.id("type"))).
                selectByVisibleText("38 - Страховой сбор ИП");
        Thread.sleep(3000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("489199557");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(5000);

        Assert.assertEquals("Налоги",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Налоги",
                driver.getTitle());
        Assert.assertEquals("Данные о клиенте",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("ФИО:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("ИНН:",
                driver.findElement(By.xpath("//div[@id='info']/p[2]/strong")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//div[@id='info2']/div/div")));
        Assert.assertEquals("Налог 1",
                driver.findElement(By.xpath("//div[@id='info2']/div/div/h4")).getText());
        Assert.assertEquals("Область:",
                driver.findElement(By.xpath("//div[@id='info2']/div/div/p/strong")).getText());
        Assert.assertEquals("Расчётный счёт:",
                driver.findElement(By.xpath("//div[@id='info2']/div/div/p[3]/strong")).getText());
        Assert.assertEquals("Номер в кадастре:",
                driver.findElement(By.xpath("//div[@id='info2']/div/div/p[6]/strong")).getText());
        Assert.assertEquals("Вид налога:",
                driver.findElement(By.xpath("//div[@id='info2']/div/div/p[7]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("ИНН: 489199557",
                driver.findElement(By.xpath("//div[@id='info']/p[2]")).getText());


        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(1000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка!",
                driver.findElement(By.cssSelector("h4")).getText());
        Assert.assertEquals("Не выбран объект налогообложения",
                driver.findElement(By.cssSelector("#danger > p.text")).getText());

        driver.findElement(By.name("r1")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());










    }


}
