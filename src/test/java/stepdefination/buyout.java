package stepdefination;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import base.resources;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobjects.afterbuyout;
import pageobjects.appliances;
import pageobjects.buynow;
import pageobjects.invent;
import pageobjects.slidebar;
import pageobjects.validation;

public class buyout extends resources {

	WebDriver driver;
	invent em;
	appliances goods;
	Actions action;
	slidebar bar;
	buynow noo;

	@Given("^Open flipkart application using browser$")
	public void Open_flipkart_application_using_browser() throws IOException {
		driver = intializedriver();

		driver.get("https://www.flipkart.com/");
	}

	@When("^User enter username as (.+) and password as (.+) into the fields$")
	public void User_enter_username_as_and_password_as_into_the_fields(String username, String password)

	{

		 em = new invent(driver);

		em.emailfield().sendKeys(username);
		em.passwordfield().sendKeys(password);

	}

	@And("^User clicks on the login button$")
	public void User_clicks_on_the_login_button() {
		
		em.submittbutton().click();
		

	}
   @When("^User clicks on the appliances$")
   public void User_clicks_on_the_appliances()
   {
	   
		 goods = new appliances(driver);
		 action = new Actions(driver);
		
   }
	@And("^User go the required product with specifications$")
	public void User_go_the_required_product_with_specifications()
	{
		
		for(int i=0;i<=2;i++)
		{
			
		try {
			action.moveToElement(goods.applianceicon()).build().perform();
			action.moveToElement(goods.televisi()).build().perform();

			action.moveToElement(goods.size()).click().build().perform();
			
			break;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	@And("^User sets the price range and see sony tv on the top of search results$")
    public void User_sets_the_price_range_and_see_sony_tv_on_the_top_of_search_results()
    {
		 bar = new slidebar(driver);

		action.dragAndDropBy(bar.startpoint(), 100, 0).build().perform();
		for (int i = 0; i <=2; i++) {
			try {
				bar.sonytv().click();
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

    }
	@And("^User clicks on the sonytv product and buyout$")
	public void User_clicks_on_the_sonytv_product_and_buyout()
	{

		 noo = new buynow(driver);

		Set<String> window = driver.getWindowHandles();

		Iterator<String> itr = window.iterator();

		String mainwindow = itr.next();

		String chilwindow = itr.next();

		driver.switchTo().window(chilwindow);

		noo.sold().click();

				
	}
	@When("^User should see sucessfully see light box of sucessfull delivery$")
	public void User_should_see_sucessfully_see_light_box_of_sucessfull_delivery()
	{
		
		afterbuyout after=new afterbuyout(driver);
		
		after.conbutton().click();
		validation verify=new validation(driver);
		Assert.assertTrue(verify.accept().isDisplayed());
	}
	
}
