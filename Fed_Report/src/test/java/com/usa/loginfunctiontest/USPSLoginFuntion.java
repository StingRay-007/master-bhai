package com.usa.loginfunctiontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class USPSLoginFuntion {

	public static void main(String[] args) {
		//open browser
		//java can not open browser, so we call selenium
		
		WebDriver driver = new FirefoxDriver();
		// webdriver = interface
		// driver = object (firefox object, not a webdriver object, because its not possible, bcz webdriver is an interface and cant create obj)
		// firefox driver = class
		
		//this how to go to a url using java
		//type driver.g and hit enter
		driver.navigate().to("https://www.ups.com/us/en/Home.page");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/header/div/nav/ul/li[1]/a")).click();;
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Sarooowar2017");;
		
		driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Ttech123$");;
		
		driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div/div/div/div/main/div/div/form/div[4]/button")).click();;
		
		driver.quit();
		
		System.out.println("PASS");
	}
}
