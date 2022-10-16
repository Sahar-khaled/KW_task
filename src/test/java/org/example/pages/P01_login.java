package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefs.Hooks.driver;

public class P01_login {

    public WebElement click_on_signIn() {
        driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[2]/main/div/div/div[1]/div[1]/div/div[3]/div[5]/a")).click();
        return null;
    }
    public WebElement enter_your_name(String name) {
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[5]/label/div/div[2]/div/input")).sendKeys("@sahar622");
        return null;
    }
    public WebElement clickNext() {
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]")).click();
        return null;
    }

    public WebElement enter_your_pass(String pass) {
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[3]/div/label")).sendKeys("Sahar123@");
        return null;
    }

    public WebElement click_signIn() {
        driver.findElement(By.xpath("//*[@id=\"layers\"]/div[2]/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div/div[1]/div/div")).click();
        return null;
    }

    public boolean validate_login() {
        boolean result = false;
        if (driver.getCurrentUrl().equalsIgnoreCase("https://twitter.com/home")) {
            result = true;
        }
        return result;
    }
}
