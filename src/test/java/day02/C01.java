package day02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01 extends TestBase {


    @Test
    public void test01(){
        //2- https://www.amazon.com adresine gidin
        driver.get("https://www.amazon.com");

        //3- amazon arama kutusunu locate edin
        WebElement aramaKutusuElementi =driver.findElement(By.id("twotabsearchtextbox"));

        //4- arama kutusuna “Nutella” yazdirin
        aramaKutusuElementi.sendKeys("Nutella");

        //5- arama islemini yapabilmek icin ENTER tusuna basin
        aramaKutusuElementi.submit();
       // aramaKutusuElementi.sendKeys(Keys.ENTER);

    }
}
