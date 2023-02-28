package day03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C01 extends TestBase {

    @Test
    public void test01(){

        //2- https://www.automationexercise.com/ adresine gidin
        driver.get("https://www.automationexercise.com/");

        //3- Category bolumundeki elementleri locate edin
        WebElement womanElementi= driver.findElement(By.xpath("(//a[@data-toggle='collapse'])[1]"));
        // womanElementi.click();

        WebElement menElementi= driver.findElement(By.xpath("(//a[@data-toggle='collapse'])[2]"));
       // menElementi.click();


        WebElement kidsElementi= driver.findElement(By.xpath("(//a[@data-toggle='collapse'])[3]"));
       // kidsElementi.click();
        bekle(3);


        //4- Category bolumunde 3 element oldugunu test edin

        List<WebElement> listeElementi=driver.findElements(By.xpath("//div[@class='panel panel-default']"));

        int expected=3;
        int actual=listeElementi.size();
        Assert.assertEquals(expected,actual);

        bekle(2);
        //5- Category isimlerini yazdirin
        int sayi=1;

        for (WebElement eac:listeElementi) {
            System.out.println(sayi+"- "+ eac.getText());
            sayi++;
        }

        //6- Sayfayi kapatin
    }
}
