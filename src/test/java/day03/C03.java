package day03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBaseClass;

import java.util.List;

public class C03 extends TestBaseClass {



    //-Test 2
    //1. Kategori menusunden Books secenegini secin
    //2. Arama kutusuna Java yazin ve aratin
    //3. Bulunan sonuc sayisini yazdirin
    //4. Sonucun Java kelimesini icerdigini test edin

    @Test
    public void test01(){
        //● https://www.amazon.com/ adresine gidin.
        driver.get("https://www.amazon.com");

        //- Test 1
        //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
        //oldugunu test edin
        WebElement ddm= driver.findElement(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));

        bekle(3);
        Select select=new Select(ddm);
        select.selectByIndex(1);
        System.out.println(select.getFirstSelectedOption());


        List<WebElement> kategoriElemetleri=select.getOptions();
        int expected=28;
        int actual =kategoriElemetleri.size();

        Assert.assertEquals(expected,actual);

    }
}
