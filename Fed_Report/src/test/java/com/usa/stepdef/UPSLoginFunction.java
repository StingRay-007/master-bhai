package com.usa.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class UPSLoginFunction {

	WebDriver driver;
	
	@Given("^User wants to open the browser$")
	public void user_wants_to_open_the_browser() throws Throwable {	    
	    driver = new FirefoxDriver();
	}

	@Given("^And go to UPS homepage$")
	public void and_go_to_UPS_homepage() throws Throwable {
	    	    
	    driver.navigate().to("https://www.ups.com/us/en/Home.page");
	}

	@When("^User navigate to login button link$")
	public void user_navigate_to_login_button_link() throws Throwable {
	
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div/div/div/header/div/nav/ul/li[1]/a")).click();;
	}

	@When("^user inputs valid username: Sarowar(\\d+)$")
	public void user_inputs_valid_username_Sarowar(int arg1) throws Throwable {
	    
	    
	    
	    driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("Sarooowar2017");;
	}

	@When("^User inputs valid password: Ttech(\\d+)\\$$")
	public void user_inputs_valid_password_Ttech_$(int arg1) throws Throwable {
	    
	    
	    
	    driver.findElement(By.xpath(".//*[@id='pwd']")).sendKeys("Ttech123$");;
	}

	@Then("^Pass or Fail$")
	public void pass_or_Fail() throws Throwable {
	    
	    
	    driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div/div/div/div/main/div/div/form/div[4]/button")).click();;
	    
	}

	
	
}
