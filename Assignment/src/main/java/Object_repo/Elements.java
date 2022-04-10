package Object_repo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Elements {
	
	@FindBy(id="ap_customer_name")
	public static WebElement Name;
	
	@FindBy(id="ap_email")
	public  static WebElement Phone;
	
	@FindBy(id="ap_password")
	public  static WebElement password;
	
	@FindBy(id="ap_password_check")
	public  static WebElement Cpassword;
	
	@FindBy(id="continue")
	public  static WebElement ContinueBtn;
	
	@FindBy(id="signInSubmit")
	public  static WebElement SignInBtn;
	
	@FindBy(id="twotabsearchtextbox")
	public static WebElement SearchBar;
	
	@FindBy(id="nav-search-submit-button")
	public static WebElement SearchIcon;
	
	@FindBy(linkText="Apple iPhone 13 (128GB) - Midnight")
	public static WebElement Product;
	
	@FindBy(id="add-to-cart-button")
	public static WebElement CartBtn;
	
	@FindBy(name="proceedToRetailCheckout")
	public static WebElement Buy;
	
	@FindBy(id="orderSummaryPrimaryActionBtn")
	public static WebElement Address;
	
	@FindBy(id="nav-link-accountList")
	public static WebElement CustomerInfo;
	
	@FindBy(xpath="(//span[@class='a-color-secondary'])[4]")
	public static WebElement Updatelink;
	
	@FindBy(id="ya-myab-address-edit-btn-0")
	public static WebElement Edit;
	
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	public static WebElement FullName;
	
	@FindBy(className="a-button-input")
	public static WebElement SaveBtn;
	
	
/*
	//Creating Name Method
	public static WebElement Name(WebDriver driver) {
		return driver.findElement(By.id("ap_customer_name"));
	}
	
	//Creating phone or mailid Method
	public static WebElement Phone(WebDriver driver) {
		return driver.findElement(By.id("ap_email"));
	}
	
	//Creating password method
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("ap_password"));
	}
	
	//creating Cpassword method
	public static WebElement Cpassword(WebDriver driver) {
		return driver.findElement(By.id("ap_password_check"));
	}
	
	//Creating Continue method
	public static WebElement ContinueBtn(WebDriver driver) {
		return driver.findElement(By.id("continue"));
	}
	
	*/
}
