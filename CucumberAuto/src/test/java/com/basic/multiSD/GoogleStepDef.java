package com.basic.multiSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleStepDef {
	
WebDriver driver;
	
	@Given("^User need to be on google page$")
	public void user_need_to_be_on_google_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\CucumberSetup\\chromedriver_win32_new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com.au");
	}
	
	@When("^User enters search string$")
	public void user_enters_search_string() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
		
	}
}
