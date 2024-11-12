package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://accounts.google.com/signin");

        Thread.sleep(2000);
        System.out.println("Title: " + driver.getTitle());

        WebElement emailInput = driver.findElement(By.id("identifierId"));
        emailInput.sendKeys("gustavo_souza12@estudante.sesisenai.org.br");

        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("Passwd")));

        passwordInput.sendKeys("teste");

        WebElement passwordNextButton = driver.findElement(By.id("passwordNext"));
        passwordNextButton.click();

        Thread.sleep(5000);

        driver.quit();
    }
}
