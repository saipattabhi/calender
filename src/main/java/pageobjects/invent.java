package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class invent {
	
 public	WebDriver driver;
	public invent(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//div[@class='IiD88i _351hSN']//input[@class='_2IX_2- VJZDxU']")
	WebElement email;
	
	@FindBy(xpath = "//div[@class='IiD88i _351hSN']//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement password;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement submitt;
	
	public WebElement emailfield()
	{
		return email;
	}
	public WebElement passwordfield()
	{
		
		return password;
	}
	
	public WebElement submittbutton()
	{
		return submitt;
	}

}
