package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends ProjectSpecificMethod {

	@Given("Type the username as {string}")
	public void typeUserName(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	 }
	@And("Type the password as {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		 
	 }
	@When("Click on the Login button")
			public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
				 
			 }	
	@Then("Verify the home page is displayed")
	public void verifyHomepage() {
		String text = driver.findElement(By.tagName("h2")).getText();
		if( text.contains("Welcome")) {
			System.out.println("login successful");
		}
	
				
		 
	 }	
	@But("Verify the Error Message is displayed")
	public void verifyErrorMess() {
		String text = driver.findElement(By.className("serviceError")).getText();
		if(text.contains("error")) {
			System.out.println("Login Failed");
		}
	 }
}
