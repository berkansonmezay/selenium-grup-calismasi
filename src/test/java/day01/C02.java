package day01;

import org.junit.Test;
import utilities.TestBase;
import utilities.TestBaseClass;

public class C02 extends TestBaseClass {

    @Test
    public void test01(){

    //2. Youtube ana sayfasina gidelim . https://www.youtube.com/
        driver.get("https://www.youtube.com");

    //3. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

    //4. Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

    //5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();

    //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

    //7. Sayfayi kapatalim / Tum sayfalari kapatalim

    }
}
