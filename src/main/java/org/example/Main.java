package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.saucedemo.com/");


        // Enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click submit button
        driver.findElement(By.id("login-button")).click();

        // Assert page title contains "Welcome"
        if(driver.getTitle().contains("Swag Labs")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }
//        try
//        {
//          Thread
//        }
//        catch (Exception e)
//        {}
        Thread.sleep(3000);
        // Close the browser
        driver.quit();
    }
}