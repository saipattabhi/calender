package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class afterbuyout {
	
	
WebDriver driver;

public afterbuyout(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
	
	
	
}
	
@FindBy(xpath = "//button[@class='_2KpZ6l _1seccl _3AWRsL']")

WebElement continuebutton;
	
	public WebElement conbutton()
	{
		
		return continuebutton;
	}
	
	

}
