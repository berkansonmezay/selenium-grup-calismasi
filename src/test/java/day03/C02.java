package day03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class C02 extends TestBase {


   @Test
    public void test01(){

    // https://the-internet.herokuapp.com/dropdown adresine gidin.
       driver.get("https://the-internet.herokuapp.com/dropdown");

    //1.Index kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
       WebElement ddm = driver.findElement(By.id("dropdown"));
       Select select=new Select(ddm);
       select.selectByIndex(1);
       System.out.println(select.getFirstSelectedOption().getText());
      System.out.println("---------------------------------");

       bekle(2);

       //2.Value kullanarak Seçenek 2'yi (Option 2) seçin ve yazdırın
       select.selectByValue("2");
      System.out.println(select.getFirstSelectedOption().getText());
      System.out.println("---------------------------------");
      bekle(2);

      //3.Visible Text(Görünen metin) kullanarak Seçenek 1’i (Option 1) seçin ve yazdırın
      select.selectByVisibleText("Option 1");
      System.out.println(select.getFirstSelectedOption().getText());
      System.out.println("---------------------------------");
      bekle(2);

    //4.Tüm dropdown değerleri(value) yazdırın

      List<WebElement> optionElementListesi=select.getOptions();
      for (WebElement each:optionElementListesi) {
         System.out.println(each.getText());

      }
      System.out.println("---------------------------------");
    //5. Dropdown’un boyutunu bulun, Dropdown’da 3 olduğunu test edin ,


      int expected=3;
      int actual= optionElementListesi.size();

      Assert.assertEquals(expected,actual);


   }
}
