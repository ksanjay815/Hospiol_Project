package com.Hospiol.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logins {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing.hospiol.com/site/login");
		driver.findElement(By.name("username")).sendKeys("sampath.marolix@gmail.com", Keys.TAB,"sampath@777",Keys.ENTER);
		}

}
