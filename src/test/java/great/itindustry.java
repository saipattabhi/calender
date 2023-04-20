package great;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.resources;
import pageobjects.afterbuyout;
import pageobjects.appliances;
import pageobjects.buynow;
import pageobjects.invent;
import pageobjects.slidebar;
import pageobjects.validation;

public class itindustry extends resources {

	WebDriver driver;

	@Test
	public void itindustry() throws IOException, InterruptedException {

		driver = intializedriver();

		driver.get("https://www.flipkart.com/");

		invent em = new invent(driver);

		em.emailfield().sendKeys("saipattabhi18@gmail.com");
		em.passwordfield().sendKeys("Sai@2255");

		em.submittbutton().click();

		appliances goods = new appliances(driver);

		// Thread.sleep(5000);

		Actions action = new Actions(driver);

		for (int i = 0; i<=2; i++) {

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

		slidebar bar = new slidebar(driver);

		action.dragAndDropBy(bar.startpoint(), 100, 0).build().perform();

		for (int i = 0; i < 2; i++) {
			try {
				bar.sonytv().click();
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		buynow noo = new buynow(driver);

		Set<String> window = driver.getWindowHandles();

		Iterator<String> itr = window.iterator();

		String mainwindow = itr.next();

		String chilwindow = itr.next();

		driver.switchTo().window(chilwindow);

		noo.sold().click();
		
		
		afterbuyout after=new afterbuyout(driver);
		
		after.conbutton().click();
		
		validation verify=new validation(driver);
		
	
		//verify.accept().isDisplayed();
		
		Assert.assertTrue(verify.accept().isDisplayed());
			
		

	}

}
