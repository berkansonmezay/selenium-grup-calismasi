package day02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C05_Odev_Soru3 extends TestBase {

    @Test
    public void test(){
        //        Navigate to website https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        //         Under the ORIGINAL CONTENTS
        //        click on Alerts
        driver.findElement(By.xpath("//a[@id='alert']")).click();
        //        print the URL
        System.out.println(driver.getCurrentUrl());
        //        navigate back
        driver.navigate().back();
        //        print the URL
        System.out.println(driver.getCurrentUrl());
        //        Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();
        //        print the URL
        System.out.println(driver.getCurrentUrl());
        //        enter value 20 and ENTER
        driver.findElement(By.id("lteq30")).sendKeys("20"+ Keys.ENTER);

        //        and then verify Submitted Values is displayed open page
        String expected = "Submitted Values";
        String actual = driver.findElement(By.xpath("//*[text()='Submitted Values']")).getText();
        Assert.assertEquals(expected,actual);

        //        close driver
    }
}
