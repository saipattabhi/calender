package sentil;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {

	WebDriver driver;

	@Test
	public void makemytrip() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		List<WebElement> frame = driver.findElements(By.tagName("iframe"));

		System.out.println("no of frames" + frame.size());

		driver.switchTo().frame("notification-frame-~55852cba");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@class=\"wewidgeticon we_close\"]")).click();

		driver.switchTo().defaultContent();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@class=\"userSection pushRight\"]//li[4]")).click();

		driver.findElement(By.xpath("//*[contains(@class,\"fsw_inner returnPersuasion\")]/descendant::div[3]")).click();

		Thread.sleep(5000);

		String date = "March 2023";
		
		String day="18";

		while (true) {

			String month = driver.findElement(By.xpath(
					"//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[1]"))
					.getText();
			
			System.out.println(month);
			
			
			if (month.equalsIgnoreCase(date)) {

				break;
			}

			else  {

				driver.findElement(By.xpath("//*[contains(@class,\"DayPicker-NavButton DayPicker-NavButton--next\")]"))
						.click();
				
				
				
				
			}
			
		

		}
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div/div/div/div[@class=\"dateInnerCell\"]/p[text()='18']")).click();
		
	

		
		
		

	}

}
