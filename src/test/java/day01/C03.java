package day01;

import org.junit.Test;
import utilities.TestBase;

public class C03 extends TestBase {

    @Test
    public void test01() {

        //2. Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //3. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //4. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();

        //5. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        bekle(3);
        driver.manage().window().maximize();

        //6. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println(driver.manage().window().getPosition());

        //7. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        //8. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println(driver.manage().window().getPosition());

        //9. Sayfayi kapatin


    }
}
