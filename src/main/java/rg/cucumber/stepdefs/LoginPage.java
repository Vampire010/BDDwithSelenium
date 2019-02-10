package rg.cucumber.stepdefs;

import org.cucumber.tests.OpenMRSTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 

public class LoginPage  
{
	@Given("^Open Application and Enter url$")

	public void open_Application_and_Enter_url() throws Throwable
	{
	  OpenMRSTests.driver.get("https://www.facebook.com/");
	  
	}

	@When("^enter username$")
	public void enter_username() throws Throwable {
		OpenMRSTests.driver.findElement(By.id("email")).sendKeys("Admin");
	}

	@When("^enter password$")
	public void enter_password() throws Throwable {
		OpenMRSTests.driver.findElement(By.id("pass")).sendKeys("Admin123");
		
		//OpenMRSTests.driver.findElement(By.id("Inpatient Ward")).click();
		
		OpenMRSTests.driver.findElement(By.id("u_0_2")).click();
	}

	@Then("^verify Msg$")
	public void verify_Msg() throws Throwable {
	   WebElement result =  OpenMRSTests.driver.findElement(By.xpath("//*[@id='error_box']/div[1]"));
	   
	   String text=result.getText();
	  
	   //SoftAssert.assertEquals (result, text);
	   Assert.assertEquals("Please try again later", text);
}
}