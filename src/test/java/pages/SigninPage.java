package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	WebDriver driver;
	
	public SigninPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); //this ==> SigninPage.class
		
	}
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement signinEmail;
	
 /*   @FindBy(how = How.XPATH, using = "//input[@name='el']" )    //how is a class==> for dynamically using libraries
	WebElement sign;  */
	
	@FindBy(id = "passwd")
	WebElement signinPass;
	
	@FindBy(xpath = "//span[text()[normalize-space()='Sign in']]")
	WebElement signIn;
	
	@FindBy(xpath = "//a[@title='Women']")
	WebElement womenmenu;
	
	/*@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	WebElement hover1; */
	
	@FindBy(xpath = "//div[@class='button-container']//a[@href='http://automationpractice.com/index.php?id_product=1&controller=product']")
	WebElement morebutton;
	
	@FindBy(id = "wishlist_button")
	WebElement wishlist;
	
	@FindBy(xpath = "//a[@class='fancybox-item fancybox-close']")
	WebElement close;
	
	@FindBy(xpath = "//a[@title='My wishlists']")
	WebElement mywishlist;
	
	@FindBy(xpath = "//li/a[@href='http://automationpractice.com/']")
	WebElement returnTohome;
	
	@FindBy(xpath = "//i[@class='icon-remove']")
	WebElement removeitem;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	WebElement tshirts;
	
	@FindBy(xpath = "//input[@id='layered_id_attribute_group_2']")
	WebElement selectsize; 
	
	@FindBy(xpath = "//img[@itemprop='image']")
	WebElement hover;
	
	@FindBy(xpath = "//a[@title = 'Add to cart']")
	WebElement addcart;
	
	@FindBy(xpath = "//a[@title = 'Proceed to checkout']")
	WebElement checkout;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	WebElement proceedcheckout;
	
	@FindBy(xpath = "//button[@name = 'processAddress']")
	WebElement processaddress;
	
	@FindBy(xpath ="//input[@id='cgv']")
	WebElement termsbutton;
	
	@FindBy(xpath = "//button[@name = 'processCarrier']")
	WebElement processcarrier;
	
	@FindBy(xpath = "//a[@title = 'Pay by bank wire']")
	WebElement paybybankwire;
	
	@FindBy(xpath = "//button[@class = 'button btn btn-default button-medium']")
	WebElement confirmorder;
	
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	WebElement title;
	
	@FindBy(xpath = "//a[@title='View my customer account']")
	WebElement profile;
	
	@FindBy(xpath = "//a[@title='Orders']")
	WebElement orders;
	
	public void signinemail(String Email) {
		signinEmail.sendKeys(Email);
	}
	
	public void signinpass(String Pass) {
		signinPass.sendKeys(Pass);
	}
	
	public void signinButton() {
		signIn.click();
	}
	
	public void clickWomen() {
		womenmenu.click();
	}
	

	/*public void hoveranItem() {
		Actions action = new Actions(driver);
		action.moveToElement(hover1).perform();
	} */
	
	public void clickMore() {
		morebutton.click();
	}
	
	public void wishList() {
		wishlist.click();
	}
	
	public void closeSymbol() {
		close.click();
	}
	
	public void chechMywishlist() {
		mywishlist.click();
	}
	
	public void removeItemfromWishlist() {
		removeitem.click();
	}
	
	public void confirmformAlert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void backTohome() {
		returnTohome.click();
	}
	public void clickTshirts() {
		tshirts.click();
	}
	
	public void selectSize() {
		selectsize.click();
	}
	
	
	public void hoveronItem() {
		Actions action = new Actions(driver);
		action.moveToElement(hover).perform();
	}
	public void addToCart() {
		addcart.click();
	}
	
	public void checkout() {
		checkout.click();
	}
	public void proceedCheckout() {
		proceedcheckout.click();
	}
	public void processAddress() {
		processaddress.click();
	}
	
	public void termsButton() {
		termsbutton.click();
	}
	public void processCarrier() {
		processcarrier.click();
	}
	public void paybyBankwire() {
		paybybankwire.click();
	}
	public void confirmOrder() {
		confirmorder.click();
	}
	
	public void clickonLogo() {
		title.click();
	}
	public void clickonProfile() {
		profile.click();
	}

	public void clickonOrders() {
		orders.click();
	}
}
