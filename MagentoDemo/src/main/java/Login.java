
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver = null;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(id="send2")
	WebElement login;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmail(String em) {
		email.sendKeys(em);
	}
	
	public void sendPssword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		login.click();
	}
}