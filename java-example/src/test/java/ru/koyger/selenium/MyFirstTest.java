package ru.koyger.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start()
    {   driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void firstTest()
    {

        driver.get("https://www.google.ru/");

        driver.findElement(By.name("q")).sendKeys("ОК Гугл, найди мне, пожалуйста, чего-нибудь хорошего");
        driver.findElement(By.name("btnK")).click();

    }

    @After
    public void stop()
    {
        driver.quit();
        driver = null;
    }

}
