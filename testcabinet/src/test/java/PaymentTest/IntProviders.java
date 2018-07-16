package PaymentTest;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class IntProviders extends WebDriverSettings {


    @Test
    public void Sarkor() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Оплатить")).click();
        Thread.sleep(3000);

        Assert.
                assertEquals("UPAY - Интернет провайдеры", driver.getTitle());
        Assert.
                assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.
                assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("he-9364649");
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(7000);

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

    @Test
    public void SharqStream() throws Exception{


        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[2]")).click();
        Thread.sleep(4000);

        Assert.
                assertEquals
                        ("UPAY - Интернет провайдеры",
                                driver.getTitle());
        Assert.
                assertEquals
                        ("Sharq Stream",
                                driver.findElement
                                        (By.cssSelector("span.h2")).getText());
        Assert.
                assertTrue
                        (isElementPresent
                                (By.cssSelector
                                        ("header.panel-heading")));
        Assert.
                assertTrue
                        (isElementPresent
                                (By.cssSelector
                                        ("#dataTableLoad_length > label")));

        driver.
                findElement
                        (By.id("lNumber")).clear();
        driver
                .findElement
                        (By.id("lNumber")).sendKeys
                ("shsts2637708");

        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();

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

        Assert.assertEquals("UPAY - Интернет провайдеры", driver.getTitle());
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("2323232");
        Thread.sleep(1000);
        driver.findElement(By.id("addNewFavoritBtn")).click();
        Thread.sleep(1000);



        Assert.assertEquals("Успешно добавлен.", driver.findElement(By.cssSelector("#success > p.text")).getText());
        Assert.assertEquals("Успешно!", driver.findElement(By.cssSelector("#success > h4")).getText());
        Thread.sleep(8000);

        driver.findElement(By.linkText("Завершить")).click();






    }

    @Test
    public void TPS() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[3]")).click();
        Thread.sleep(3000);

        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-body.text-black")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[10]")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertEquals("UPAY - Интернет провайдеры", driver.getTitle());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("tps14_2373016");
        Thread.sleep(5000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(7000);

        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("UPAY - Интернет провайдеры", driver.getTitle());

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно", driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(10000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Неверная сумма для платежа",
                driver.findElement(By.cssSelector("#danger > p.text")).getText());


    }

    @Test
    public void  SkyLine() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("volkov");
        Thread.sleep(2000);


        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());


        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Thread.sleep(12000);

        Assert.assertEquals("Неверная сумма для платежа",
                driver.findElement(By.cssSelector("#danger > p.text")).getText());


    }

    @Test
    public void UzOnline() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[5]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Номер счета", driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("UzOnline", driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Оплата услуг", driver.getTitle());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Формат некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("1273364");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Оплата услуг",
                driver.getTitle());
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Номер счета :",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Баланс: :",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert.assertEquals("UzOnline",
                driver.findElement(By.cssSelector("span.h2")).getText());

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
        Thread.sleep(12000);

        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Номер транзакции ЕОПЦ:",
                driver.findElement(By.cssSelector("#abonentInfo3 > p > strong")).getText());
        Assert.assertEquals("Номер транзакции UPAY:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[2]/strong")).getText());
        Assert.assertEquals("Лицевой счет:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[4]/strong")).getText());
        Assert.assertEquals("Лицевой счет: 1273364",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[4]")).getText());

        Thread.sleep(3000);

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("23232322");
        Thread.sleep(2000);
        driver.findElement(By.id("addNewFavoritBtn")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Успешно добавлен.", driver.findElement(By.cssSelector("#success > p.text")).getText());
        Thread.sleep(2000);

        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(5000);

    }

    @Test
    public void EVO() throws Exception{


        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[6]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Тип технологии",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Лицевой счет:",
                driver.findElement(By.id("account-label")).getText());
        Assert.assertTrue(isElementPresent(By.id("type")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("UPAY - Интернет провайдеры", driver.getTitle());
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("41095");
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(2000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());
        Assert.assertEquals("EVO",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());

        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));


        driver.findElement(By.id("addToFavorite")).
                click();
        Thread.sleep(1000);

        driver.findElement(By.id("favoriteModelNickname")).
                click();
        Thread.sleep(1000);

        driver.findElement(By.id("favoriteModelNickname")).
                clear();
        Thread.sleep(1000);

        driver.findElement(By.id("favoriteModelNickname")).
                sendKeys("2323231");
        Thread.sleep(1000);

        driver.findElement(By.id("addNewFavoritBtn")).
                click();
        Thread.sleep(2000);

        Assert.assertEquals("Успешно добавлен.",
                driver.findElement(By.cssSelector("#success > p.text")).getText());
        Assert.assertEquals("Успешно!",
                driver.findElement(By.cssSelector("#success > h4")).getText());
        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(5000);
    }

    @Test
    public void Comnet() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[7]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("Comnet",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

       Assert.assertEquals("Поле не должно быть пустым",
               driver.findElement(By.cssSelector("span.text-danger")).getText());

       driver.findElement(By.id("lNumber")).clear();
       driver.findElement(By.id("lNumber")).sendKeys("f2261979");
       Thread.sleep(2000);

       driver.findElement(By.id("findStep")).click();
       driver.findElement(By.id("findStep")).click();
       Thread.sleep(3000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());

        driver.findElement(By.id("checkStep")).click();

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.id("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("a.dropdown-toggle > strong")));
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h2")));
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин: f2261979",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("div.panel-heading")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("23211111");
        Thread.sleep(1000);
        driver.findElement(By.id("addNewFavoritBtn")).click();
        Thread.sleep(1000);

        Assert.assertEquals("Успешно добавлен.",
                driver.findElement(By.cssSelector("#success > p.text")).getText());
        Assert.assertEquals("Успешно!",
                driver.findElement(By.cssSelector("#success > h4")).getText());

    }

    @Test
    public void FiberNet() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[8]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertEquals("FiberNet",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.id("findStep")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("div.panel-heading")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("1805");
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Логин: 1805",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")));
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());
        Assert.assertEquals("FiberNet",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);


        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());


        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Неверная сумма для платежа",
                driver.findElement(By.cssSelector("#danger > p.text")).getText());
        Assert.assertEquals("Ошибка!",
                driver.findElement(By.cssSelector("h4")).getText());
        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());

    }

    @Test
    public void Sonet() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[9]")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertEquals("Sonet",
                driver.findElement(By.cssSelector("span.h2")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("102270");
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Логин: 102270",
                driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertEquals("Sonet",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        driver.findElement(By.id("step2")).click();
        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Неверная сумма для платежа",
                driver.findElement(By.cssSelector("#danger > p.text")).getText());
        Assert.assertEquals("Ошибка!",
                driver.findElement(By.cssSelector("h4")).getText());
        Assert.assertEquals("UPAY - Интернет провайдеры",
                driver.getTitle());



    }

    @Test
    public void Cron() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[10]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Cron Telecom",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Идентификационный номер",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertEquals("Cron Telecom",
                driver.findElement(By.cssSelector("span.h2")).getText());

        driver.findElement(By.id("findStep")).click();

        Assert.assertEquals("Ошибка! Формат некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("2228");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Cron Telecom",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Идентификационный номер",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertEquals("Cron Telecom",
                driver.findElement(By.cssSelector("span.h2")).getText());

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(1000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

    }

    @Test
    public void Nano() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[11]")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Nano Telecom",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("I/H-647");
        driver.findElement(By.id("findStep")).click();

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert. assertEquals("Nano Telecom",
                driver.findElement(By.cssSelector("span.h2")).getText());

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Неверная сумма для платежа",
                driver.findElement(By.cssSelector("#danger > p.text")).getText());
        Assert.assertEquals("Ошибка!", driver.findElement(By.cssSelector("h4")).getText());
        Thread.sleep(2000);

    }

    @Test
    public void Freelink() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[12]")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("fl-up-p-11");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(1000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Неверная сумма для платежа",
                driver.findElement(By.cssSelector("#danger > p.text")).getText());
        Assert.assertEquals("Ошибка!",
                driver.findElement(By.cssSelector("h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
    }

    @Test
    public void EastStarkTV() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[13]")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(1000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("s4101285");
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин :",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Баланс: :",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(1000);

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

        Assert.assertEquals("Ошибка!",
                driver.findElement(By.cssSelector("h4")).getText());
        Assert.assertEquals("Неверная сумма для платежа",
                driver.findElement(By.cssSelector("#danger > p.text")).getText());
        Thread.sleep(3000);



    }

//    @Test
//    public void SpectrIT() throws Exception{
//
//        driver.findElement(By.linkText("Оплата услуг")).click();
//        Thread.sleep(3000);
//
//        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
//        Thread.sleep(3000);
//
//        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[14]")).click();
//        Thread.sleep(3000);
//
//        driver.findElement(By.id("findStep")).click();
//        Thread.sleep(1000);
//
//        Assert.assertEquals("Поле не должно быть пустым",
//                driver.findElement(By.cssSelector("span.text-danger")).getText());
//
//        driver.findElement(By.id("lNumber")).clear();
//        driver.findElement(By.id("lNumber")).sendKeys("SP998949419136");
//        Thread.sleep(3000);
//
//        driver.findElement(By.id("findStep")).click();
//        driver.findElement(By.id("findStep")).click();
//        Thread.sleep(2000);
//
//        Assert.assertEquals("Spectr-IT Интернет",
//                driver.findElement(By.cssSelector("span.h2")).getText());
//        Assert.assertEquals("Данные по абоненту",
//                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
//        Assert.assertEquals("Логин :",
//                driver.findElement(By.cssSelector("p > strong")).getText());
//        Assert.assertEquals("ФИО: :",
//                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
//        Assert.assertEquals("Баланс: :",
//                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
//        Assert.assertEquals("Номер карты:",
//                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
//        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
//        Assert.assertEquals("Сумма оплаты:",
//                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
//        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
//        Assert.assertEquals("Новости",
//                driver.findElement(By.cssSelector("span.h4")).getText());
//        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
//        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
//        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
//        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
//
//        driver.findElement(By.id("checkStep")).click();
//        Thread.sleep(1000);
//
//        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
//                driver.findElement(By.cssSelector("span.text-danger")).getText());
//
//        driver.findElement(By.id("summa")).clear();
//        driver.findElement(By.id("summa")).sendKeys("1");
//        Thread.sleep(4000);
//
//        driver.findElement(By.id("checkStep")).click();
//        driver.findElement(By.id("checkStep")).click();
//        Thread.sleep(3000);
//
//        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
//                driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
//
//        driver.findElement(By.id("confirmStep")).click();
//        Assert.assertTrue(isElementPresent(By.id("loader_box")));
//        Thread.sleep(12000);
//
//    }

    @Test
    public void ISTV() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[15]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(1000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("istv666");
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("ISTV Интернет",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("ISTV Интернет",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("ISTV Интернет",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Номер транзакции ЕОПЦ:",
                driver.findElement(By.cssSelector("#abonentInfo3 > p > strong")).getText());
        Assert.assertEquals("Номер транзакции UPAY:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[2]/strong")).getText());
        Assert.assertEquals("Лицевой счет:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[4]/strong")).getText());
        Assert.assertEquals("Сумма оплаченная:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.id("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("113222");
        Thread.sleep(1000);

        driver.findElement(By.id("addNewFavoritBtn")).click();
        Thread.sleep(2000);


        Assert.assertEquals("Успешно!",
                driver.findElement(By.cssSelector("#success > h4")).getText());
        Assert.assertEquals("Успешно добавлен.",
                driver.findElement(By.cssSelector("#success > p.text")).getText());

        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(3000);
    }

    @Test
    public void Buzton() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[16]")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(1000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("8000104838");
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Идентификационный номер",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(1000);

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
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertEquals("Buzton Internet", driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("ЧЕК ОПЛАТЫ", driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("113222");
        Thread.sleep(1000);

        driver.findElement(By.id("addNewFavoritBtn")).click();
        Thread.sleep(2000);


        Assert.assertEquals("Успешно!",
                driver.findElement(By.cssSelector("#success > h4")).getText());
        Assert.assertEquals("Успешно добавлен.",
                driver.findElement(By.cssSelector("#success > p.text")).getText());

        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(3000);







    }

    @Test
    public void UzScinet() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//li[2]/ul/li[3]/a/span")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[17]")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("1048-2-18");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Номер договора",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("checkStep")).click();

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

        Assert.assertEquals("UzScinet",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("113222");
        Thread.sleep(1000);

        driver.findElement(By.id("addNewFavoritBtn")).click();
        Thread.sleep(2000);


        Assert.assertEquals("Успешно!",
                driver.findElement(By.cssSelector("#success > h4")).getText());
        Assert.assertEquals("Успешно добавлен.",
                driver.findElement(By.cssSelector("#success > p.text")).getText());

        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(3000);






    }



    }

