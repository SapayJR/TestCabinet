package PaymentTest;

import Settings.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class Links extends WebDriverSettings {

    @Test
    public void Hilolnashr()  throws Exception{


        driver.findElement(By.linkText("Покупка товаров и услуг")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Покупка товаров и услуг",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertEquals("Hilolnashr",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));
        Assert.assertEquals("Sharq Nashriyoti",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));
        Assert.assertEquals("BarakaCard",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertEquals("E-Hilolnashr.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/div/img")));
        Assert.assertEquals("Optima[OBP]",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/div/img")));
        Assert.assertEquals("VIPerson",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/div/img")));
        Assert.assertEquals("e-obuna.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/div/img")));
        Assert.assertEquals("Uzsoft.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/div/img")));
        Assert.assertEquals("Oxus Travel",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/h4")).getText());

        driver.findElement(By.linkText("Оплатить")).click();
        Thread.sleep(8000);

        Assert.assertEquals("«HILOL NASHR» нашриёт-матбааси",
                driver.getTitle());


    }

    @Test
    public void SharqNashriyoti()  throws Exception{


        driver.findElement(By.linkText("Покупка товаров и услуг")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Покупка товаров и услуг",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertEquals("Hilolnashr",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));
        Assert.assertEquals("Sharq Nashriyoti",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));
        Assert.assertEquals("BarakaCard",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertEquals("E-Hilolnashr.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/div/img")));
        Assert.assertEquals("Optima[OBP]",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/div/img")));
        Assert.assertEquals("VIPerson",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/div/img")));
        Assert.assertEquals("e-obuna.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/div/img")));
        Assert.assertEquals("Uzsoft.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/div/img")));
        Assert.assertEquals("Oxus Travel",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[2]")).click();
        Thread.sleep(8000);

        Assert.assertEquals("Sharq", driver.getTitle());


    }

    @Test
    public void BarakaCard()  throws Exception{


        driver.findElement(By.linkText("Покупка товаров и услуг")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Покупка товаров и услуг",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertEquals("Hilolnashr",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));
        Assert.assertEquals("Sharq Nashriyoti",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));
        Assert.assertEquals("BarakaCard",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertEquals("E-Hilolnashr.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/div/img")));
        Assert.assertEquals("Optima[OBP]",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/div/img")));
        Assert.assertEquals("VIPerson",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/div/img")));
        Assert.assertEquals("e-obuna.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/div/img")));
        Assert.assertEquals("Uzsoft.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/div/img")));
        Assert.assertEquals("Oxus Travel",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[3]")).click();
        Thread.sleep(8000);

        Assert.assertEquals("Скидки на товары и услуги в Ташкенте и по Узбекистану",
                driver.getTitle());


    }

    @Test
    public void EHilolnashruz()  throws Exception{


        driver.findElement(By.linkText("Покупка товаров и услуг")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Покупка товаров и услуг",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertEquals("Hilolnashr",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));
        Assert.assertEquals("Sharq Nashriyoti",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));
        Assert.assertEquals("BarakaCard",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertEquals("E-Hilolnashr.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/div/img")));
        Assert.assertEquals("Optima[OBP]",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/div/img")));
        Assert.assertEquals("VIPerson",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/div/img")));
        Assert.assertEquals("e-obuna.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/div/img")));
        Assert.assertEquals("Uzsoft.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/div/img")));
        Assert.assertEquals("Oxus Travel",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[4]")).click();
        Thread.sleep(8000);

        Assert.assertEquals("HILOL-NASHR НАШРИЁТИ",
                driver.getTitle());


    }

    @Test
    public void OptimaOBP()  throws Exception{


        driver.findElement(By.linkText("Покупка товаров и услуг")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Покупка товаров и услуг",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertEquals("Hilolnashr",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));
        Assert.assertEquals("Sharq Nashriyoti",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));
        Assert.assertEquals("BarakaCard",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertEquals("E-Hilolnashr.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/div/img")));
        Assert.assertEquals("Optima[OBP]",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/div/img")));
        Assert.assertEquals("VIPerson",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/div/img")));
        Assert.assertEquals("e-obuna.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/div/img")));
        Assert.assertEquals("Uzsoft.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/div/img")));
        Assert.assertEquals("Oxus Travel",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[5]")).click();
        Thread.sleep(8000);

        Assert.assertEquals("Добро пожаловать!",
                driver.getTitle());


    }

    @Test
    public void VIPerson()  throws Exception{


        driver.findElement(By.linkText("Покупка товаров и услуг")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Покупка товаров и услуг",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertEquals("Hilolnashr",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));
        Assert.assertEquals("Sharq Nashriyoti",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));
        Assert.assertEquals("BarakaCard",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertEquals("E-Hilolnashr.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/div/img")));
        Assert.assertEquals("Optima[OBP]",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/div/img")));
        Assert.assertEquals("VIPerson",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/div/img")));
        Assert.assertEquals("e-obuna.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/div/img")));
        Assert.assertEquals("Uzsoft.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/div/img")));
        Assert.assertEquals("Oxus Travel",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[6]")).click();
        Thread.sleep(8000);

        Assert.assertEquals("ViPerson", driver.getTitle());


    }

    @Test
    public void eobunauz()  throws Exception{


        driver.findElement(By.linkText("Покупка товаров и услуг")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Покупка товаров и услуг",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertEquals("Hilolnashr",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));
        Assert.assertEquals("Sharq Nashriyoti",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));
        Assert.assertEquals("BarakaCard",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertEquals("E-Hilolnashr.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/div/img")));
        Assert.assertEquals("Optima[OBP]",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/div/img")));
        Assert.assertEquals("VIPerson",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/div/img")));
        Assert.assertEquals("e-obuna.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/div/img")));
        Assert.assertEquals("Uzsoft.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/div/img")));
        Assert.assertEquals("Oxus Travel",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[7]")).click();
        Thread.sleep(8000);

        Assert.assertEquals("E-obuna.uz",
                driver.getTitle());


    }

    @Test
    public void Uzsoftuz()  throws Exception{


        driver.findElement(By.linkText("Покупка товаров и услуг")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Покупка товаров и услуг",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertEquals("Hilolnashr",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));
        Assert.assertEquals("Sharq Nashriyoti",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));
        Assert.assertEquals("BarakaCard",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertEquals("E-Hilolnashr.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/div/img")));
        Assert.assertEquals("Optima[OBP]",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/div/img")));
        Assert.assertEquals("VIPerson",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/div/img")));
        Assert.assertEquals("e-obuna.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/div/img")));
        Assert.assertEquals("Uzsoft.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/div/img")));
        Assert.assertEquals("Oxus Travel",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[8]")).click();
        Thread.sleep(8000);

        Assert.assertEquals("Главная страница - Business Work Stars LLC",
                driver.getTitle());


    }

    @Test
    public void OxusTravel()  throws Exception{


        driver.findElement(By.linkText("Покупка товаров и услуг")).click();
        Thread.sleep(4000);

        Assert.assertEquals("Покупка товаров и услуг",
                driver.findElement(By.cssSelector("span.h2")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[4]/div/span/i")));

        Assert.assertTrue(isElementPresent(By.cssSelector("div.serv_block > img")));
        Assert.assertEquals("Hilolnashr",
                driver.findElement(By.cssSelector("div.panel.wrapper > h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/div/img")));
        Assert.assertEquals("Sharq Nashriyoti",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[7]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/div/img")));
        Assert.assertEquals("BarakaCard",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[8]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/div/img")));
        Assert.assertEquals("E-Hilolnashr.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[9]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/div/img")));
        Assert.assertEquals("Optima[OBP]",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[10]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/div/img")));
        Assert.assertEquals("VIPerson",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[11]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/div/img")));
        Assert.assertEquals("e-obuna.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[12]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/div/img")));
        Assert.assertEquals("Uzsoft.uz",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[13]/div/h4")).getText());
        Assert.assertTrue(isElementPresent(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/div/img")));
        Assert.assertEquals("Oxus Travel",
                driver.findElement(By.xpath("//section[@id='my_main_content']/section/section/section/div/div/div[14]/div/h4")).getText());

        driver.findElement(By.xpath("(//a[contains(text(),'Оплатить')])[9]")).click();
        Thread.sleep(8000);

        Assert.assertEquals("Отдых для жителей Узбекистана,Туристические поездки, горящие путевки",
                driver.getTitle());


    }
}
