package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOM{
  
	public void clickOnLogin() {
		loginLink.click();
	}
	
	public void emailid(String mail) {
		email.sendKeys(mail);
	}
	
	public void pass(String pass1) {
		password.sendKeys(pass1);
	}
	
	public void clickOnSubmit() {
		submitBtn.click();
	}
	
	public void validateLogout() {
	logOutBtn.isDisplayed();

	}
	public void clickOnElectronic() {
		ElectBtn.click();
	}
	
	public void clickOnCell() {
		cellphone.click();
	}
	
	public void clickOnaddcart() {
		addcart.click();
	}
	public void VerifyMsg() {
		cartmsg.isDisplayed();
	}
	
	WebDriver driver;
	
		public LoginPOM(WebDriver driver) {
			this.driver = driver;

			PageFactory.initElements(driver, this);

		}
		
		@FindBy(xpath = "//a[@class=\"ico-login\"]")
		private WebElement loginLink;

		@FindBy(xpath = "//input[@id=\"Email\"]")
		private WebElement email;

		@FindBy(xpath = "//input[@id=\"Password\"]")
		private WebElement password;

		@FindBy(xpath = "(//input[@type=\"submit\"])[2]")
		private WebElement submitBtn;
	
		@FindBy(xpath = "//a[@class=\"ico-logout\"]")
		private WebElement logOutBtn;
		
		@FindBy(xpath = "(//a[@href=\"/electronics\"])[1]")
		private WebElement ElectBtn;
		
		@FindBy(xpath = "//img[@alt=\"Picture for category Cell phones\"]")
		private WebElement cellphone;
		
		@FindBy(xpath = "(//input[@value=\"Add to cart\"])[1]")
		private WebElement addcart;
		
		@FindBy(xpath = "//p[text()='The product has been added to your ']")
		private WebElement cartmsg;
		
		
}
