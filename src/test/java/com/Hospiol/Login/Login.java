package com.Hospiol.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://testing.hospiol.com/site/login");
	driver.findElement(By.name("username")).sendKeys("sampath.marolix@gmail.com");
	driver.findElement(By.name("password")).sendKeys("sampath@777");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	}
}
