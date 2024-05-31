//package StepDefiniations;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pages.LoginPage;
//
//public class LoginSteps {
//	WebDriver driver = null;
//	LoginPage loginPageObject = new LoginPage(driver);
//
//	@Given("browser is opened")
//	public void browser_is_opened() {
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		System.out.println("inside step : browser is opened");	
//	}
//
//	@And("user is on login page")
//	public void user_is_on_login_page() {
//		driver.get("https://www.saucedemo.com/");
//	}
//
//	@When("^user enters (.*) and (.*)$")
//	public void user_enters_username_and_password(String username, String password) {
//		//driver.findElement(By.id("user-name")).sendKeys(username);
//		//driver.findElement(By.id("password")).sendKeys(password);
//		
//		loginPageObject.getUsernameTextbox().sendKeys(username);
//		loginPageObject.getPasswordTextbox().sendKeys(password);
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		//driver.findElement(By.id("login-button")).click();
//		loginPageObject.getLoginBtn().click();
//	}
//
//	@Then("user is navigated to home page")
//	public void user_is_navigated_to_home_page() {
//		if(driver.getCurrentUrl().toString().equalsIgnoreCase("https://www.saucedemo.com/inventory.html")) {
//			System.out.println("test is passed user is navigated to home page.");
//		}
//	}
//
//}
