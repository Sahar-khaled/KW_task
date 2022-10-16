package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.example.stepDefs.Hooks.driver;

public class P02_submission {
    public WebElement writePost() {

        driver.findElement(By.xpath("//div[@class=\"notranslate public-DraftEditor-content\"]")).sendKeys("post");
        return null;
    }
    public WebElement clickOnTweetButton(){
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div/div[1]/div/div[3]/div/div[2]/div[1]/div/div/div/div[2]/div[3]/div/div/div[2]/div")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return null;

    }
    public WebElement writePostOutOfLimit(){
        driver.findElement(By.xpath("//div[@class=\"notranslate public-DraftEditor-content\"]"))
                .sendKeys("JHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDMJHFVJFVBJFBVFBVJBFVDFVBDM");

        return null;
    }
    public WebElement writeNewPostContainsGIF(){
        driver.findElement(By.xpath("//div[@aria-label=\"Add a GIF\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"css-18t94o4 css-1dbjc4n r-16y2uox r-19ex51r r-1ny4l3l r-o7ynqc r-6416eg\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div/div[3]/div/div[1]/div/div[1]")).click();
        return null;
    }


//    public WebElement validatePostSuccessfully() {
//        Assert.assertTrue(driver.findElement(
//                By.xpath
//                        ("/div/div/div/div[1]/span")).isDisplayed());
//
//        return null;
//    }
}
