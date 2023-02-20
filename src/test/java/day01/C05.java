package day01;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBase;
import utilities.TestBaseClass;

public class C05 extends TestBaseClass {
    @Test
    public void test01(){


        //2. facebook sayfasina gidin ve sayfa basliginin
        driver.get("hhtps://www.facebook.com");


        // ve sayfa basliginin (title) “facebook” oldugunu dogrulayin (verify),
        // degilse dogru basligi yazdirin.
        String expectedTitle = "facebook";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("facebook title testi PASSED");
        }else{
            System.out.println("facebook title testi FAILED" +
                    "\nGerceklesen title : " + actualTitle);
        }

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa
        //“actual” URL’i yazdirin.
        String expectedUrl ="facebook";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedUrl)){
            System.out.println("Test PASSED");
        }else{
            System.out.println("Test FAILED"+ actualUrl);
        }

        //4.https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String expectedWalmmartTitle= "Walmart.com";
        String actualWalmartTitle=driver.getTitle();
        Assert.assertTrue(actualWalmartTitle.contains(expectedWalmmartTitle));

        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //7. Sayfayi yenileyin
        driver.navigate().refresh();

        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();

        //9.Browser’i kapatin

    }

}
