package steps;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SigninPage;

public class StepsofDef {
	WebDriver driver;
	SigninPage sp;
	
	
	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    sp = new SigninPage(driver);
	  
	}

	
	@When("User navigates to the URL {string}")
	public void user_navigates_to_the_URL(String url) {
	   driver.get(url);
	}


	@When("User Enters EmailAddress as {string} and Password as {string}")
	public void user_Enters_EmailAddress_as_and_Password_as(String email, String pass) {
	    sp.signinemail(email);
	    sp.signinpass(pass);
	}

	
	@When("Click on Signin button")
	public void click_on_Signin_button() {
	   sp.signinButton();
	}

	@When("Click on Women Menu")
	public void click_on_Women_Menu() throws Exception {
	    sp.clickWomen();
	    Thread.sleep(10000);
	    //sp.hoveranItem();
	    sp.hoveronItem();
	    Thread.sleep(5000);
	    sp.clickMore();
	}

	@When("Add an item to wishlist")
	public void add_an_item_to_wishlist() throws Exception {
	    Thread.sleep(5000);
	    sp.wishList();
	    Thread.sleep(5000);
	    sp.closeSymbol();
	}

	@When("Click on my wishlist")
	public void click_on_my_wishlist() throws Exception {
		Thread.sleep(5000);
	    sp.clickonProfile();
	    Thread.sleep(5000);
	    sp.chechMywishlist();
	}

	@When("Remove an item from wishlist")
	public void remove_an_item_from_wishlist() throws Exception {
	    Thread.sleep(5000);
	    sp.removeItemfromWishlist();
	    Thread.sleep(5000);
	    sp.confirmformAlert();
	    Thread.sleep(5000);
	    sp.backTohome();
	}
	
	@When("Click on Tshirts Menu")
	public void click_on_Tshirts_Menu() throws Exception {
	   sp.clickTshirts();
	   Thread.sleep(5000);
	   sp.selectSize();
	}

	@When("Click on Added to Cart button")
	public void click_on_Added_to_Cart_button() throws Exception {
		Thread.sleep(5000);
	    sp.hoveronItem();
		Thread.sleep(5000);
	    sp.addToCart();
	    
	}

	@When("Click on Proceed to Checkout button")
	public void click_on_Proceed_to_Checkout_button() throws Exception {
		Thread.sleep(5000);
	    sp.checkout();
	    Thread.sleep(5000);
	    
	    sp.proceedCheckout();
	    Thread.sleep(5000);
	    
	    sp.processAddress();
	    Thread.sleep(5000);
	    
	    sp.termsButton();
	    Thread.sleep(5000);
	    sp.processCarrier();
	    Thread.sleep(5000);
	    sp.paybyBankwire();
	    Thread.sleep(5000);
	    sp.confirmOrder();
	}
	
	@When("Navigate to HomePage")
	public void navigate_to_HomePage() throws Exception {
		Thread.sleep(5000);
	    sp.clickonLogo();
	}

	@When("Click on your profile")
	public void click_on_your_profile() throws Exception {
		Thread.sleep(5000);
	    sp.clickonProfile();
	   
	}

	@When("Click on Order History and Details")
	public void click_on_Order_History_and_Details() throws Exception {
	   Thread.sleep(5000);
	   sp.clickonOrders();
	}

	
	
}
