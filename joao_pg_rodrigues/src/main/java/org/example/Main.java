package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://estudante.sesisenai.org.br/login");

        System.out.println("Title: " + driver.getTitle());

        WebElement acceptPolicy = driver.findElement(By.id("accept_policy"));
        acceptPolicy.click();

        Thread.sleep(1000);

        WebElement username = driver.findElement(By.name("user"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.className("login__btn"));

        username.sendKeys("Seu login aqui para validação");
        password.sendKeys("Sua senha aqui para validação");
        Thread.sleep(1000);
        loginButton.click();
    }
}