package day02;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

public class C03_Odev_Soru1 extends TestBase {
    @Test
    public void test01(){

        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get(" https://www.techlistic.com/p/selenium-practice-form.html");

        // fill the firstname

        WebElement firstname= driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Riza");

        bekle(2);
        //    fill the lastname
        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastname.sendKeys("Cimen");

        bekle(2);
        //    check the gender
        driver.findElement(By.xpath("(//input[@id='sex-0'])[1]")).click();

        bekle(2);

        //    check the experience
        driver.findElement(By.xpath("(//input[@id='exp-4'])[1]")).click();
        bekle(2);

        //    fill the date
        WebElement date= driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("25.07.1998");

        bekle(2);

        //    choose your profession -> Automation Tester
        driver.findElement(By.id("profession-1")).click();
        bekle(2);

        //    choose your tool -> Selenium Webdriver
        driver.findElement(By.id("tool-2")).click();
        bekle(2);

        //    choose your continent -> Antartica
        WebElement ddm=  driver.findElement(By.xpath("(//select[@class='input-xlarge'])[1]"));
        Select select=new Select(ddm);
        select.selectByVisibleText("Antartica");
        bekle(2);

        //    choose your command  -> Browser Commands
        ddm=  driver.findElement(By.xpath("(//select[@class='input-xlarge'])[2]"));
        select=new Select(ddm);
        select.selectByVisibleText("Browser Commands");
        bekle(2);

        //    click submit button

        driver.findElement(By.xpath("//button[@id='submit']")).click();
        bekle(2);
    }
}
