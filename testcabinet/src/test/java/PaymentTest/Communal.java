package PaymentTest;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Communal extends WebDriverSettings {


    @Test
    public void Gaz() throws Exception {

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/aside/section/section/div/div/nav/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[2]")).click();
        Thread.sleep(10000);

//        Assert.assertEquals("Коммунальные услуги", driver.findElement(By.cssSelector("span.h2")).getText());
//        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));


        new Select(driver.findElement(By.id("region_id"))).selectByVisibleText("г. Ташкент");
        Thread.sleep(3000);
        new Select(driver.findElement(By.id("subregion_id"))).selectByVisibleText("Юнусабадский район");
        Thread.sleep(3000);

        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[10]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("label > input[type=\"text\"]")));
        Assert.assertTrue(isElementPresent(By.cssSelector("img.price-list")));


        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("07315130");
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(10000);

        Assert.assertEquals("Лицевой счет:", driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("ФИО:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert.assertEquals("Адрес:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Задолженность:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[4]/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));


        new Select(driver.findElement(By.id("ptype"))).selectByVisibleText("Нет");
        Thread.sleep(2000);

        driver.findElement(By.id("fromD")).sendKeys("20");
        driver.findElement(By.id("fromD")).clear();
        driver.findElement(By.id("fromD")).sendKeys("01.06.2018");
        Thread.sleep(2000);

        driver.findElement(By.id("toD")).sendKeys("20");
        driver.findElement(By.id("toD")).clear();
        driver.findElement(By.id("toD")).sendKeys("30.06.2018");
        Thread.sleep(2000);


        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);


        Assert.assertTrue(isElementPresent(By.cssSelector("div.alert.alert-info > strong")));
        driver.findElement(By.id("confirmStep")).click();
        Thread.sleep(10000);


        Assert.assertEquals("ЧЕК ОПЛАТЫ", driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertTrue(isElementPresent(By.cssSelector("h3.text-success")));
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.id("kvitLink")));
        driver.findElement(By.linkText("Завершить")).click();

    }

    @Test
    public void Electro() throws Exception {

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/aside/section/section/div/div/nav/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(10000);

        driver.findElement(By.xpath("//a[contains(text(),'Оплатить')]")).click();
        Thread.sleep(7000);

        Assert.assertEquals("Электроэнергия", driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//table[@id='dataTableLoad']/tbody/tr/td[6]/div/a/i")));
        Assert.assertTrue(isElementPresent(By.cssSelector("i.fa.fa-ticket")));

        new Select(driver.findElement(By.id("region_id"))).selectByVisibleText("г. Ташкент");
        Thread.sleep(3000);

        new Select(driver.findElement(By.id("subregion_id"))).selectByVisibleText("Юнусабадское ЭСП");
        Thread.sleep(3000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("0670323");
        Thread.sleep(10000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(10000);

        Assert.assertEquals("Лицевой счет:", driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("ФИО:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert.assertEquals("Регион:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Район:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[4]/strong")).getText());
        Assert.assertEquals("Адрес:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[5]/strong")).getText());
        Assert.assertEquals("UPAY - ГАК \"Узбекэнерго\"", driver.getTitle());
        Assert.assertEquals("Задолженность:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[6]/strong")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("(//button[@type='button'])[2]")));
        Assert.assertTrue(isElementPresent(By.id("fromCh")));
        Assert.assertTrue(isElementPresent(By.id("toCh")));

        new Select(driver.findElement(By.id("ptype"))).selectByVisibleText("Нет");
        Thread.sleep(2000);

//        driver.findElement(By.id("fromCh")).sendKeys("20");
//        driver.findElement(By.id("fromCh")).clear();
//        driver.findElement(By.id("fromCh")).sendKeys("01.06.2018");
//        Thread.sleep(2000);
//
//        driver.findElement(By.id("toCh")).sendKeys("20");
//        driver.findElement(By.id("toCh")).clear();
//        driver.findElement(By.id("toCh")).sendKeys("30.06.2018");
//        Thread.sleep(2000);

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(2000);

        Assert.assertTrue(isElementPresent(By.className("price-list")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».", driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Thread.sleep(10000);

        Assert.assertEquals("Ошибка!\n" +
                "Неверная сумма для платежа", driver.findElement(By.id("danger")).getText());
        Thread.sleep(5000);

    }

    @Test
    public void Mahsustrans() throws Exception {


        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/aside/section/section/div/div/nav/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(10000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[3]")).click();
        Thread.sleep(5000);

        new Select(driver.findElement(By.id("company_store_id"))).selectByVisibleText("Mahsustrans");
        Thread.sleep(2000);

        new Select(driver.findElement(By.id("region_id"))).selectByVisibleText("Бектемирский район");
        Thread.sleep(2000);

        driver.findElement(By.id("lNumber")).sendKeys("101021418");
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(10000);

        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
//        Assert.assertTrue(driver.findElement(By.id("cardNumber")).getText().matches("^exact:АКИБ \"Ипотекабанк\" \\( 8600 [\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]* [\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]* 3612 \\) ЧАКБ \"Даврбанк\" \\( 8600 [\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]* [\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]* 8378 \\) ЧАКБ \"Universal Bank\" \\( 8600 [\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]* [\\s\\S]*[\\s\\S]*[\\s\\S]*[\\s\\S]* 7923 \\)$"));
        Assert.assertEquals("Лицевой счет:", driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("ФИО:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert.assertEquals("Адрес:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Задолженность:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[4]/strong")).getText());
        Assert.assertEquals("UPAY - ПУ \"Махсустранс\"", driver.getTitle());

        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(2000);

        Assert.assertTrue(isElementPresent(By.cssSelector("img.price-list")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».", driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Thread.sleep(10000);

        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.id("kvitLink")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("22222");
        driver.findElement(By.id("addNewFavoritBtn")).click();
//        Assert.assertEquals("Успешно!", driver.findElement(By.cssSelector("#success > h4")).getText());
//        driver.findElement(By.id("kvitLink")).click();



    }

    @Test
    public void TeploEnergo() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/aside/section/section/div/div/nav/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(10000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[5]")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(2000);

        Assert.assertEquals("Код безопасности для внешних систем назначается владельцем лицевого счёта в персональном кабинете потребителя тепловой энергии ГУП \"Toshissiqquvvati\"", driver.findElement(By.cssSelector("p > i")).getText());
        Assert.assertEquals("Для получения персональной информации о владельце лицевого счёта, введите код безопасности для внешних систем:", driver.findElement(By.xpath("//div[@id='step1']/div/div[2]/label/strong")).getText());

        Assert.assertEquals("Поле не должно быть пустым", driver.findElement(By.cssSelector("span.text-danger")).getText());
        Thread.sleep(2000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("04000081290");
        Thread.sleep(2000);

        driver.findElement(By.id("sCode")).clear();

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(10000);


        Assert.assertEquals("Лицевой счет:", driver.findElement(By.cssSelector("p > strong")).getText());
        Assert.assertEquals("Лицевой счет: 04000081290", driver.findElement(By.cssSelector("#abonentInfo1 > p")).getText());
        Assert.assertEquals("ФИО:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert.assertEquals("Адрес:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("UPAY - УП ПО \"Тошиссиккуввати\"", driver.getTitle());
        Assert.assertEquals("Задолженность:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[4]/strong")).getText());
        Assert.assertEquals("Сумма последней оплаты:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[6]/strong")).getText());
        Assert.assertEquals("Количество проживающих:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[7]/strong")).getText());
        Assert.assertEquals("Отапливаемая площадь:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[8]/strong")).getText());
        Assert.assertEquals("Дата последней оплаты:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[9]/strong")).getText());
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("04000081290");
        Thread.sleep(2000);

        driver.findElement(By.id("sCode")).clear();
        driver.findElement(By.id("sCode")).sendKeys("123");
        Thread.sleep(2000);

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(5000);

        Assert.assertEquals("ФИО: Хидаев Хаким Абдукаримович", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]")).getText());
        Assert.assertEquals("Количество проживающих: 5", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[7]")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(1000);

        Assert.assertEquals("Ошибка! Сумма оплаты некорректно", driver.findElement(By.cssSelector("span.text-danger")).getText());
        Assert.assertEquals("UPAY - УП ПО \"Тошиссиккуввати\"", driver.getTitle());

        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        Thread.sleep(3000);

        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».", driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());

        driver.findElement(By.id("confirmStep")).click();
        Thread.sleep(10000);

        Assert.assertTrue(isElementPresent(By.cssSelector("h3.text-success")));
        Assert.assertEquals("ЧЕК ОПЛАТЫ", driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.id("kvitLink")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        Thread.sleep(2000);

        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(1000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("r232323");
        Thread.sleep(1000);
        driver.findElement(By.id("addNewFavoritBtn")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Успешно добавлен.", driver.findElement(By.cssSelector("#success > p.text")).getText());

        driver.findElement(By.linkText("Завершить")).click();

        Assert.assertEquals("Партнеры", driver.getTitle());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[5]")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("12345678912");
        Thread.sleep(3000);

        Assert.assertEquals("UPAY - УП ПО \"Тошиссиккуввати\"", driver.getTitle());

        driver.findElement(By.id("findStep")).click();
        Thread.sleep(7000);

        Assert.assertEquals("Лицевой счет не найден!", driver.findElement(By.cssSelector("#danger > p.text")).getText());

    }

    @Test
    public void Suvsoz() throws Exception{

        driver.findElement(By.linkText("Оплата услуг")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/aside/section/section/div/div/nav/ul/li[2]/ul/li/a/span")).click();
        Thread.sleep(10000);

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("findStep")).click();
        Assert.assertEquals("Поле не должно быть пустым", driver.findElement(By.cssSelector("span.text-danger")).getText());
        Thread.sleep(3000);

        driver.findElement(By.id("lNumber")).sendKeys("123123123");
        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(5000);

        Assert.assertEquals("Учетная запись не существует", driver.findElement(By.cssSelector("#danger > p.text")).getText());
        Thread.sleep(3000);
        driver.findElement(By.id("lNumber")).clear();
        driver.findElement(By.id("lNumber")).sendKeys("401885");
        driver.findElement(By.id("findStep")).click();
        driver.findElement(By.id("findStep")).click();
        Thread.sleep(10000);

        Assert.assertEquals("UPAY - ГУП \"Сувсоз\"", driver.getTitle());
        Assert.assertEquals("Холодная вода и канализация", driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertEquals("Лицевой счет:", driver.findElement(By.cssSelector("p > strong")).getText());
        Assert. assertEquals("ФИО:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[2]/strong")).getText());
        Assert.assertEquals("Адрес:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[3]/strong")).getText());
        Assert.assertEquals("Задолженность:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[4]/strong")).getText());
        Assert.assertEquals("Дата последней оплаты:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[6]/strong")).getText());
        Assert.assertEquals("Сумма последней оплаты:", driver.findElement(By.xpath("//span[@id='abonentInfo1']/p[7]/strong")).getText());
        Assert.assertTrue(isElementPresent(By.id("cardNumber")));
        Assert.assertTrue(isElementPresent(By.cssSelector("header.panel-heading")));
        Assert.assertTrue(isElementPresent(By.cssSelector("#dataTableLoad_length > label")));

        new Select(driver.findElement(By.id("ptype"))).selectByVisibleText("Нет");
        Thread.sleep(2000);

        driver.findElement(By.id("fromD")).sendKeys("20");
        driver.findElement(By.id("fromD")).clear();
        driver.findElement(By.id("fromD")).sendKeys("01.06.2018");
        Thread.sleep(2000);

        driver.findElement(By.id("toD")).sendKeys("20");
        driver.findElement(By.id("toD")).clear();
        driver.findElement(By.id("toD")).sendKeys("30.06.2018");
        Thread.sleep(2000);


        driver.findElement(By.id("summa")).clear();
        driver.findElement(By.id("summa")).sendKeys("1");
        driver.findElement(By.id("checkStep")).click();
        Thread.sleep(3000);

        Assert.assertEquals("Внимательно проверьте данные. Если Вы действительно подтверждаете платеж, нажмите кнопку «ДАЛЕЕ».", driver.findElement(By.cssSelector("div.alert.alert-info > strong")).getText());
        driver.findElement(By.id("confirmStep")).click();
        Thread.sleep(10000);

        Assert.assertEquals("ЧЕК ОПЛАТЫ", driver.findElement(By.cssSelector("h3.text-success")).getText());
        Assert.assertEquals("UPAY - ГУП \"Сувсоз\"", driver.getTitle());
        Assert.assertTrue(isElementPresent(By.id("addToFavorite")));
        Assert.assertTrue(isElementPresent(By.cssSelector("button.btn.btn-danger")));
        Assert.assertTrue(isElementPresent(By.id("kvitLink")));
        Assert.assertTrue(isElementPresent(By.linkText("Завершить")));
        driver.findElement(By.id("addToFavorite")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("favoriteModelNickname")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("favoriteModelNickname")).sendKeys("wwwww");
        Thread.sleep(2000);
        driver.findElement(By.id("addNewFavoritBtn")).click();
        Thread.sleep(2000);
        Assert.assertEquals("Успешно добавлен.", driver.findElement(By.cssSelector("#success > p.text")).getText());
        Thread.sleep(2000);
        driver.findElement(By.linkText("Завершить")).click();
        Thread.sleep(2000);

    }


}
