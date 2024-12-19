
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	
	WebDriver driver=null;

	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step- browser is open");
		System.setProperty("webdriver.chrome.driver","C:/Tushar_Workspace/Code With Harry/JavaCucumber/src/test/resources/driver/chromedriver.exe");
		                                         
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		System.out.println("Inside steps-user is on google search page");
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		
	}

	@When("user enters text in search box")
	public void user_enters_text_in_search_box() throws InterruptedException {
		System.out.println("Inside steps-user enters text in search box");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		System.out.println("Inside step-hits enter");
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		System.out.println("Inside step-user is navigated to search results");
		driver.getPageSource().contains("online courses");
		Thread.sleep(3000);
		driver.close();
	}

}
