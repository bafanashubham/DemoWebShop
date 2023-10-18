package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardPOM {

	
	public void clickOngiftCard() {
		GiftCardsLink.click();
	}
	public void Phycard() {
		phycard.click();
	}
	public void Recepname(String rec) {
		recepname.sendKeys(rec);
	}
	public void Mssg(String Msg) {
		msg.sendKeys(Msg);
	}
	public void Emailbut() {
		emailbut.click();
	}
	public void Emailadd(String emailid) {
		emailadd.sendKeys(emailid);
	}
	public void Sendemailbut() {
		sendemailbut.click();
	}
	public void Vmsg() {
		Vmsg.isDisplayed();
	}
	WebDriver driver;
	
	public GiftCardPOM(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "(//a[@href=\"/gift-cards\"])[1]")
	private WebElement GiftCardsLink;
	
	@FindBy(xpath = "(//a[@href=\"/100-physical-gift-card\"])[2]")
	private WebElement phycard;
	
	@FindBy(xpath = "//input[@class=\"recipient-name\"]")
	private WebElement recepname;
	
	@FindBy(xpath = "//textarea[@class=\"message\"]")
	private WebElement msg;
	
	@FindBy(xpath = "//input[@value=\"Email a friend\"]")
	private WebElement emailbut;
	
	@FindBy(xpath = "//input[@class=\"friend-email\"]")
	private WebElement emailadd;
	
	@FindBy(xpath = "//input[@name=\"send-email\"]")
	private WebElement sendemailbut;
	
	@FindBy(xpath = "//div[@class=\"result\"]")
	private WebElement Vmsg;
}
