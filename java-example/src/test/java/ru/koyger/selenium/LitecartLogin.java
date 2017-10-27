package ru.koyger.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class LitecartLogin {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void litecartLogin() throws InterruptedException {
        driver.get("http://localhost/litecart/admin");

        //Ввод логина-пароля
        driver.findElement(By.cssSelector("input.form-control")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        // Нажатие на кнопку Логин
        driver.findElement(By.className("btn-default")).click();
        // Логаут
        driver.findElement(By.className("fa-sign-out")).click();




    }

    @After
    public void stop()
    {
        driver.quit();
        driver = null;
    }

}
