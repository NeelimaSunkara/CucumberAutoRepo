package com.basic.multiplescenarioSD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MultipleScenarioStepDef {
	
	WebDriver driver;
	
	@Given("^User need to be on Facebook login page$")
	public void user_need_to_be_on_Facebook_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\CucumberSetup\\chromedriver_win32_new\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
	}
	
	@When("^User enters user first name$")
	public void user_enters_user_first_name() {
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Neelima");
	}
	
	@Then("^User checks user first name is present$")
	public void user_checks_user_first_name_is_present() throws InterruptedException {
		String userNameActual = driver.findElement(By.xpath("//input[@id='u_0_m']")).getAttribute("value");
		Assert.assertEquals("Neelima", userNameActual);
		Thread.sleep(1000);
	}
	
	@And("^User enters user surname$")
	public void user_enters_user_surname() throws InterruptedException{
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("Sunkara");
		Thread.sleep(1000);
	}
	
	@Then("^User Mobile field should be blank$")
	public void user_Mobile_field_should_be_blank() {
		String mobileActual = driver.findElement(By.xpath("//input[@id='u_0_r']")).getAttribute("value");
		Assert.assertEquals("", mobileActual);
	}
	
	@Then("^close browser$")
	public void close_browser() {
		driver.quit();
		driver=null;
	}
	

}
