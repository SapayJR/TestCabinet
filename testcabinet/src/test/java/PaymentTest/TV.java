package PaymentTest;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TV extends WebDriverSettings {


    @Test
    public void UZDigital() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телевизионные услуги")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Оплатить")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(4000);

        Assert.assertEquals("UzDigital TV",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("172476");

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Предоплата:",
                driver.findElement(By.cssSelector("p.text-success.fa-2x > strong")).getText());
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("ФИО:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert.assertEquals("Задолженность:",
                driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());

        driver.findElement(By.id("checkStep")).click();

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(2000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("UzDigital TV",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("123222");
        Thread.sleep(2000);
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
    public void Mediabay() throws Exception{


        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телевизионные услуги")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("Mediabay.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("255587");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Mediabay.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Логин:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));

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
                driver.findElement(By.cssSelector("div.alert.alert-info")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Assert.assertEquals("Mediabay.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertEquals("Номер транзакции ЕОПЦ:",
                driver.findElement(By.cssSelector("#abonentInfo3 > p > strong")).getText());
        Assert.assertEquals("Номер транзакции UPAY:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[2]/strong")).getText());
        Assert.assertEquals("Агент платежной системы:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[3]/strong")).getText());
        Assert.assertEquals("Лицевой счет:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[4]/strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[5]/strong")).getText());
        Assert.assertEquals("Сумма оплаченная:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]/strong")).getText());
        Assert.assertEquals("Дата и время:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[7]/strong")).getText());
        Assert.assertEquals("Наименование услуги:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[8]/strong")).getText());

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("23232");
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

    @Test
    public void Kinopokaz() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телевизионные услуги")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[3]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Kinopokaz.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Идентификатор абонента",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("21550");
        Thread.sleep(300);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Kinopokaz.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Идентификатор абонента:",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));

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
        Thread.sleep(8000);

        Assert.assertEquals("Неверная сумма для платежа",
                driver.findElement(By.cssSelector("#danger > p.text")).getText());

        Assert.assertEquals("Ошибка!",
                driver.findElement(By.cssSelector("h4")).getText());

    }

    @Test
    public void Oxo() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телевизионные услуги")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Oxo",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Идентификатор клиента (ID)",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Ошибка! Формат некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("151751");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Oxo",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Идентификатор клиента (ID):",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
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
        Thread.sleep(12000);

    }

    @Test
    public void Player() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телевизионные услуги")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[5]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Player.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertTrue(isElementPresent(By.id("findStep")));
        Assert.assertEquals("Идентификатор клиента (ID)",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(1000);

        Assert.assertEquals("Ошибка! Формат некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("83476");
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Player.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("Номер карты:",
                driver.findElement(By.cssSelector("div.col-lg-6 > div.form-group > label.control-label > strong")).getText());
        Assert.assertEquals("Сумма оплаты:",
                driver.findElement(By.xpath("//div[@id='step2']/div[2]/div[2]/label/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertEquals("Данные по абоненту",
                driver.findElement(By.cssSelector("h4.m-t-xxs")).getText());
        Assert.assertEquals("Идентификатор клиента (ID):",
                driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));

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

        Assert.assertEquals("Player.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ",
                driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("Сумма оплаченная:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[6]/strong")).getText());
        Assert.assertEquals("Лицевой счет:",
                driver.findElement(By.xpath("//span[@id='abonentInfo3']/p[4]/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert. assertTrue(isElementPresent(By.linkText("Завершить")));
        Assert. assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert. assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));


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
        Assert.assertTrue(isElementPresent(By.cssSelector("span.h2")));
    }

    @Test
    public void OnlineTV() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телевизионные услуги")).click();
        Thread.sleep(2000);

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/div/img")));
        Assert.assertEquals("OnlineTV",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[6]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("OnlineTV",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Идентификационный номер",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("div.panel-heading")));
        Assert.assertEquals("Новости",
                driver.findElement(By.cssSelector("span.h4")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));
        Assert.assertTrue(isElementPresent(By.name("dataTableLoad_length")));


        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Поле не должно быть пустым",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("5748");
        Thread.sleep(1000);

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
        Thread.sleep(3000);

       Assert.assertEquals("Ошибка! Сумма оплаты некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

       driver.findElement(By.id("summa")).clear();
       driver.findElement(By.id("summa")).sendKeys("1");
       Thread.sleep(2000);

       driver.findElement(By.id("checkStep")).click();
       driver.findElement(By.id("checkStep")).click();
       Thread.sleep(3000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».",
                driver.findElement(By.cssSelector("div.alert.alert-info")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Assert.assertTrue(isElementPresent(By.id("loader_box")));
        Thread.sleep(12000);

    }

    @Test
    public void Allmovies() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Телевизионные услуги")).click();
        Thread.sleep(2000);

        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/div/img")));
        Assert.assertEquals("Allmovies.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[7]")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Allmovies.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Идентификационный номер",
                driver.findElement(By.cssSelector("label.control-label > strong")).getText());

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(1000);
        Assert.assertEquals("Ошибка! Формат некорректно",
                driver.findElement(By.cssSelector("span.text-danger")).getText());

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("77724");
        Thread.sleep(3000);

        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Allmovies.uz",
                driver.findElement(By.cssSelector("span.h2")).getText());
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
        Thread.sleep(13000);

    }


}
