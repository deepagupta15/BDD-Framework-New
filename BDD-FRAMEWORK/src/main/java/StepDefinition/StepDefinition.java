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
import net.bytebuddy.asm.Advice.This;

public class StepDefinition {

	 WebDriver driver;

	 
	public WebDriver getdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\BhagyashriStudy\\driver\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	@Given("User is on Login Page")
	public void user_is_on_Login_Page() {
		driver = getdriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\BhagyashriStudy\\driver\\chromedriver.exe");
//		 
//		// Initialize browser
//		WebDriver driver = new ChromeDriver();
		try {
			// Open freecrm
			driver.get("https://www.freecrm.com");

			// Maximise browser

			// getdriver().manage().window().maximize();

//		String j = driver.getTitle();
//		  System.out.println("Your page title Is : "+j);

//		  driver.get("http://www.google.com/");
//		    
//				Thread.sleep(5000);
//				WebElement searchBox = driver.findElement(By.name("q"));
//			    searchBox.sendKeys("ChromeDriver");
//			    searchBox.submit();
//			    Thread.sleep(5000);  // Let the user actually see something!
			// driver.quit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("User enters chrome")
	public void user_enters_chrome() {

	}

	@When("Title of the page is Free CRM")
	public void title_of_the_page_is_Free_CRM() {

		String title = driver.getTitle();
		System.out.println("Your page title Is : " + title);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}

	@Then("User enter Name and Password")
	public void user_enter_Name_and_Password() {

	}

	@Then("User click on Login Button")
	public void user_click_on_Login_Button() {

	}

	@Then("User is on Home")
	public void user_is_on_Home() {

	}

	@Given("User is on search Page")
	public void user_is_on_search_Page() {

	}

	@When("User enters BDD")
	public void user_enters_BDD() {

	}

}
