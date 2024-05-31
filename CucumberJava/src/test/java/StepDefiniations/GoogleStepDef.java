//package StepDefiniations;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class GoogleStepDef {
//
//	WebDriver driver = null;
//
//	@Given("browser is opened")
//	public void browser_is_opened() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		System.out.println("inside step : browser is opened");	
//	}
//
//	@And("user is on google search page")
//	public void user_is_on_google_search_page() {
//		driver.get("https://www.google.co.in/");
//		System.out.println("inside step : user is on google search page");
//	}
//
//	@When("user enters a text in searchbox")
//	public void user_enters_a_text_in_searchbox() {
//		driver.findElement(By.name("q")).sendKeys("iphone");
//		System.out.println("inside step : user enters a text in searchbox");
//	}
//
//	@And("hits enter")
//	public void hits_enter() throws InterruptedException {
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		System.out.println("inside step : hits enter");
//	}
//
//	@Then("user is navigated to search results")
//	public void user_is_navigated_to_search_results() {
//		System.out.println(driver.getTitle().toString());
//		System.out.println("inside step : user is navigated to search results");
//	}
//}
