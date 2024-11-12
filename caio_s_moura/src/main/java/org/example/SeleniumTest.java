package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com.br");

        System.out.println("Title: " + driver.getTitle());
        driver.manage().window().maximize();

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("github");
        searchBox.submit();

        WebElement clickGithub = driver.findElement(By.className("DKV0Md"));
        clickGithub.click();

        driver.get("https://github.com/login");

        WebElement username = driver.findElement(By.name("login"));
        username.sendKeys("caio_s_moura@estudante.sesisenai.org.br");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12343223456789");
        WebElement clickLogin = driver.findElement(By.name("commit"));
        clickLogin.click();
    }
}