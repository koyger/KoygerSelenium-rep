package ru.koyger.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    public void start() {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public void myFirstTest() {
        driver.get("https://www.google.ru/");
        driver.findElement(By.name("q")).sendKeys("ОК Гугл, найди мне, пожалуйста, чего-нибудь хорошего");
        driver.findElement(By.name("btnG")).click();
        wait(10000);


    }

    public void stop() {

        driver.quit();
        driver = null;
    }







}
