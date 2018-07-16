package PaymentTest;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Telephony extends WebDriverSettings {

    @Test
    public void TSHTT() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/div/img")));
        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.wrapper")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h2")));

        driver.findElement(By.linkText("Оплатить")).click();
        Thread.sleep(5000);

        Assert.assertTrue(isElementPresent(By.cssSelector("div.wrapper")));
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ТШТТ",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());

        new Select(driver.findElement(By.id("type"))).selectByVisibleText("МТР");
        Thread.sleep(2000);

        new Select(driver.findElement(By.id("type"))).selectByVisibleText("ГТС");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("2451099");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(4000);

        Assert.assertEquals("ТШТТ",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Тип оплаты:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());

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
        Thread.sleep(12000);





    }

    @Test
    public void PlatinumMob() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Platinum Mobile",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[2]")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Platinum Mobile",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Код оператора:",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.id("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("9348801");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Platinum Mobile",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("#abonentInfo1 > p")));
        Assert.assertEquals("Номер телефона: 37259348801",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(2000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Platinum Mobile",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Номер транзакции ЕОПЦ:",
                driver.findElement(By.cssSelector("#abonentInfo3 > p > strong")).getText());
        Assert.assertEquals("Номер транзакции UPAY:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[2]/strong")).getText());
        Assert.assertEquals("Лицевой счет:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[4]/strong")).getText());
        Assert.assertEquals("Лицевой счет: 37259348801",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[4]")).getText());
        Assert.assertEquals("Сумма оплаченная:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]/strong")).getText());
        Assert.assertEquals("1 сум",
                driver.findElement(By.id("transaction-amount")).getText());
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("123222222");
        Thread.sleep(1000);
        Assert.assertEquals("Добавить в Регулярные платежи",
                driver.findElement(By.cssSelector("h4.modal-title")).getText());
        Thread.sleep(1000);
        driver.findElement(By.id("addNewFavoritBtn")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Успешно!",
                driver.findElement(By.cssSelector("#success > h4")).getText());
        Assert.assertEquals("Успешно добавлен.",
                driver.findElement(By.cssSelector("#success > p.text")).getText());

        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(4000);


    }

//    @Test
//    public void TeleKarta() throws Exception {
//
//
//        driver.findElement(By.linkText("Оплата услуг")).click();
//        Thread.sleep(2000);
//
//        driver.findElement(By.linkText("Телефония")).click();
//        Thread.sleep(3000);
//
//        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[3]")).click();
//        Thread.sleep(3000);
//
//        Assert.assertEquals("TeleKarta",
//                driver.findElement(By.cssSelector("span.h2")).getText());
//        Assert.assertEquals("Номинал карты:",
//                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
//        Assert.assertTrue(isElementPresent(By.id("lNumber")));
//
//        new Select(driver.findElement(By.id("lNumber"))).selectByVisibleText("5000");
//        Thread.sleep(3000);
//
//        new Select(driver.findElement(By.id("lNumber"))).selectByVisibleText("15000");
//        Thread.sleep(3000);
//
//        driver.findElement(By.id("findStep")).click();
//        Thread.sleep(2000);
//
//        Assert.assertEquals("Данные по карте",
//                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
//        Assert.assertEquals("Номинал карты:",
//                driver.findElement(By.cssSelector("p > strong")).getText());
//        Assert.assertEquals("Номинал карты: 15000",
//                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
//        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
//        Assert.assertTrue(isElementPresent(By.id("summa")));
//        Assert.assertTrue(isElementPresent(By.cssSelector("div.wrapper")));
//
//        Assert.assertEquals("15000",
//                driver.findElement(By.id("summa")).getAttribute("value"));
//
//
//
//    }

    @Test
    public void UzTelJizzakh() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());

        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Джиззак");
        Thread.sleep(2000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("3922156");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                        driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Баланс:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[4]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Джиззак",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 3922156",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Номер телефона: 723922156",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[4]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);




    }

    @Test
    public void JizzakhUZI() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Джиззак");
        Thread.sleep(2000);


        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("2260513");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Джиззак",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 2260513",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);
    }

    @Test
    public void  SamarqandUZI() throws Exception{


        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Самарканд");
        Thread.sleep(4000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("4752733");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Самарканд",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 4752733",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);



    }

    @Test
    public void SamarkandUZTEL() throws Exception {

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Самарканд");
        Thread.sleep(4000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("2287795");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Самарканд",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 2287795",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);


    }

    @Test
    public void Surhan() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Сурхандарья");
        Thread.sleep(4000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("4133789");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Сурхандарья",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 4133789",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);

    }

    @Test
    public void Sirdaryo() throws Exception{


        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Сирдарья");
        Thread.sleep(4000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("2278366");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Сирдарья",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 2278366",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);


    }

    @Test
    public void TashRegion() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Ташкентская обл.");
        Thread.sleep(4000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("5938278");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Ташкентская обл.",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 5938278",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);


    }

    @Test
    public void Namangan() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Наманган");
        Thread.sleep(4000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("2371306");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Наманган",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 2371306",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);



    }

    @Test
    public void Khorezm() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Хорезм");
        Thread.sleep(4000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("2247324");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Хорезм",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 2247324",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);

    }

    @Test
    public void Navoi() throws Exception{


        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Навои");
        Thread.sleep(4000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("5322177");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Навои",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 5322177",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);

    }

    @Test
    public void Buxara() throws Exception{


        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Бухара");
        Thread.sleep(4000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("5273354");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Бухара",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 5273354",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);


    }

    @Test
    public void Fergana() throws Exception{


        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телефония")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Телефония",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Филиал",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());
        Assert.assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.xpath("//div[@id='step1']/div/div[3]/span")).getText());


        new
                Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Фергана");
        Thread.sleep(4000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("2269500");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Регион:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Тип пополнения счета:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert. assertEquals("Номер телефона:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Регион: Фергана",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("Тип пополнения счета: Абонентская плата",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Номер телефона: 2269500",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        Thread.sleep(1000);

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Узбектелеком",
                driver.findElement(By.cssSelector("span.h2")).getText());

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Агент платежной системы: UPAY",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]")).getText());
        Assert.assertEquals("Сумма оплаченная: 1 сум",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]")).getText());
        Assert.assertEquals("Наименование услуги: Узбектелеком",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h4")));


        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(7000);



    }

}
