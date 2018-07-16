package PaymentTest;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class IntServices extends WebDriverSettings {


    @Test
    public void OLX() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Интернет ресурсы")).click();
        Thread.sleep(3000);

        Assert.assertTrue(isElementPresent
                (By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Интернет ресурсы",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.wrapper")));

        driver.findElement(By.xpath("//a[contains(text(),'Оплатить')]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("4619");
        Thread.sleep(2000);

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("OLX",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Идентификатор абонента",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("i.fa.fa-ticket")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);


        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("OLX",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Идентификатор абонента:",
                driver.findElement(By.cssSelector("p > strong")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("#abonentInfo2 > h4.m-t-xxs")).getText());

        Assert.assertEquals("Идентификатор абонента:",
                driver.findElement(By.cssSelector("#abonentInfo2 > p > strong")).getText());

        Assert.assertEquals("Идентификатор абонента: 4619",
                driver.findElement(By.cssSelector("#abonentInfo2 > p")).getText());

        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("#step3 > div.col-lg-6 > div.form-group > label.control-label > strong")).getText());

        Assert.assertTrue(isElementPresent(By.cssSelector("#step3 > div.col-lg-6 > div.form-group > label.control-label > strong")));

        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step3']/div[2]/div[2]/label/strong")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//div[@id='step3']/div[2]/div[2]/label/strong")));

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        Assert.assertTrue(isElementPresent(By.cssSelector("div.alert.alert-info")));

        Assert.assertEquals("OLX",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));



        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(10000);

        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());

        Assert.assertEquals("OLX",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));

        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));

        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));


    }

    @Test
    public void MyJobsUz() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/aside/section/section/div/div/nav/ul/li[2]/ul/li[7]/a/span")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Arsenal D",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));


        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[3]")).click();
        Thread.sleep(3000);


        Assert.assertEquals("Arsenal D",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertEquals("Номер договора",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert. assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Интернет ресурсы")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Интернет ресурсы",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));


    }

    @Test
    public void HostimUZ() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Интернет ресурсы")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Хостинг",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("s-79808");
        Thread.sleep(3000);
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Thread.sleep(2000);

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(2000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert. assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Неверная сумма для платежа",
                driver.findElement(By.cssSelector("#danger > p.text")).getText());
        Assert.assertEquals("Ошибка!",
                driver.findElement(By.cssSelector("h4")).getText());

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/aside/section/section/div/div/nav/ul/li[2]/ul/li[7]/a/span")).click();
    }

    @Test
    public void UzInfocom() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/aside/section/section/div/div/nav/ul/li[2]/ul/li[7]/a/span")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[7]")).click();
        Thread.sleep(5000);

        Assert.assertEquals("UZINFOCOM",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Введите свой логин от ID.UZ",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("ID.UZ",
                driver.findElement(By.cssSelector("span.input-group-addon")).getText());
        Assert.assertTrue(isElementPresent(By.id("findStep")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("bekaka");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин ID.UZ:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Логин ID.UZ: bekaka",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("UZINFOCOM",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));

        Thread.sleep(15000);


    }

    @Test
    public void ENT() throws Exception{

        driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/aside/section/section/div/div/nav/ul/li[2]/a/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Интернет ресурсы")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Интернет ресурсы",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[25]/div/div/img")));
        Assert.assertEquals("ENT.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[25]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[20]")).click();
        Thread.sleep(5000);

        Assert.assertEquals("ENT.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        new Select(driver.findElement(By.id("type"))).selectByVisibleText("91");
        Thread.sleep(1000);

        new Select(driver.findElement(By.id("type"))).selectByVisibleText("93");
        Thread.sleep(1000);

        new Select(driver.findElement(By.id("type"))).selectByVisibleText("94");
        Thread.sleep(1000);

        new Select(driver.findElement(By.id("type"))).selectByVisibleText("95");
        Thread.sleep(1000);

        new Select(driver.findElement(By.id("type"))).selectByVisibleText("97");
        Thread.sleep(1000);

        new Select(driver.findElement(By.id("type"))).selectByVisibleText("98");
        Thread.sleep(1000);

        new Select(driver.findElement(By.id("type"))).selectByVisibleText("99");
        Thread.sleep(1000);

        new Select(driver.findElement(By.id("type"))).selectByVisibleText("90");
        Thread.sleep(1000);

        Assert.assertEquals("Код оператора:",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Номер телефона",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);


        Assert.assertEquals("Ошибка! Формат некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("1122275");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер телефона: 901122275",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Счет на оплату 1",
                driver.findElement(By.xpath("//div[@id='info2']/div/div/h4")).getText());
        Assert.assertEquals("Счет:",
                driver.findElement(By.xpath("//div[@id='info2']/div/div/p/strong")).getText());
        Assert.assertEquals("238977",
                driver.findElement(By.cssSelector("span.ahost-account")).getText());
        Assert.assertEquals("ФИО::",
                driver.findElement(By.xpath("//div[@id='info2']/div/div/p[2]/strong")).getText());
        Assert.assertEquals("Бегметов Ихтиёр",
                driver.findElement(By.cssSelector("span.address")).getText());
        Assert.assertEquals("RFID: 0005995607",
                driver.findElement(By.cssSelector("span.nalCode")).getText());
        Assert.assertEquals("Счет на оплату 2",
                driver.findElement(By.xpath("//div[@id='info2']/div[2]/div/h4")).getText());
        Assert.assertEquals("Счет:",
                driver.findElement(By.xpath("//div[@id='info2']/div[2]/div/p/strong")).getText());
        Assert.assertEquals("410809",
                driver.findElement(By.xpath("//div[@id='info2']/div[2]/div/p/span")).getText());
        Assert.assertEquals("ФИО::",
                driver.findElement(By.xpath("//div[@id='info2']/div[2]/div/p[2]/strong")).getText());
        Assert.assertEquals("Зикриллаева Шахноза",
                driver.findElement(By.xpath("//div[@id='info2']/div[2]/div/p[2]/span")).getText());
        Assert.assertEquals("RFID: 0002374627",
                driver.findElement(By.xpath("//div[@id='info2']/div[2]/div/p[3]/span")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());










    }










}
