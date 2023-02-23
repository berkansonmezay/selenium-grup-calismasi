package day02;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Odev_Soru1_farkli_Cozum extends TestBase {

    /* ...Exercise3...


 */
    @Test
    public void test01(){
         //  go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //    fill the firstname
        Faker faker = new Faker();

      WebElement firstNameElementi = driver.findElement(By.xpath("(//input[@name='firstname'])[1]"));
      firstNameElementi.sendKeys(faker.name().firstName());
        //    fill the lastname
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).perform();

        bekle(3);
        //    check the gender
        actions.sendKeys(Keys.TAB).click().perform();
        bekle(3);
        //    check the experience

        actions.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.ARROW_RIGHT).click().perform();

        bekle(3);
        //    fill the date
        actions.sendKeys(Keys.TAB).sendKeys(faker.date().birthday().toString()).perform();

        //    choose your profession -> Automation Tester
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).click().perform();
        bekle(3);
        //    choose your tool -> Selenium Webdriver
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).click().perform();
        bekle(3);
        //    choose your continent -> Antartica
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();
        bekle(3);

        //    choose your command  -> Browser Commands
        actions.sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN).perform();
        bekle(3);
        //    click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        bekle(3);
    }


}
