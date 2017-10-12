package ru.koyger.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest {

    @Test
    public void firstTest()
    {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);


        driver.get("https://www.google.ru/");
        driver.findElement(By.name("q")).sendKeys("ОК Гугл, найди мне, пожалуйста, чего-нибудь хорошего");
        driver.findElement(By.name("btnK")).click();


        driver.quit();
        driver = null;
    }









}
