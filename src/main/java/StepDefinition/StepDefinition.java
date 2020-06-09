package StepDefinition;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedCondition;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	
	WebDriver driver;
	
	@Given("User is on Login Page")
	public void user_is_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\chromedriver.exe");
		 
		// Initialize browser
		WebDriver driver=new ChromeDriver();
		 
//		// Open facebook
//		driver.get("https://www.freecrm.com");
//		 
//		// Maximize browser
//		 
//		driver.manage().window().maximize();
//		String j = driver.getTitle();
//		  System.out.println("Your page title Is : "+j);
		  
		  driver.get("http://www.google.com/");
		    try {
				Thread.sleep(5000);
				WebElement searchBox = driver.findElement(By.name("q"));
			    searchBox.sendKeys("ChromeDriver");
			    searchBox.submit();
			    Thread.sleep(5000);  // Let the user actually see something!
			 //   driver.quit();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  // Let the user actually see something!
		    
		
	   // throw new io.cucumber.java.PendingException();
	}
	@When("User enters chrome")
	public void user_enters_chrome() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Title of the page is Free CRM")
	public void title_of_the_page_is_Free_CRM() {
		 
		//String j = driver.getTitle();
		//System.out.println("Your page title Is : "+j);
//		  System.out.println("Your page title Is : "+j)
		   //   System.out.println(driver.getTitle());
		throw new io.cucumber.java.PendingException();
		    }
		


	@Then("User enter Name and Password")
	public void user_enter_Name_and_Password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User click on Login Button")
	public void user_click_on_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User is on Home")
	public void user_is_on_Home() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Given("User is on search Page")
	public void user_is_on_search_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
