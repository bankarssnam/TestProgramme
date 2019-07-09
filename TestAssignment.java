package TestAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAssignment extends WriteInternetPlans
{

	public static void main(String[] args) {
		
		
		String Url;
		String ExpectedUrl;
		
		WebDriver driver = new ChromeDriver();
		
		//delete Cookies
		
		driver.manage().deleteAllCookies();
		
		// Launch URL
		driver.get("https://www/att/com/");
		
		//Global Navigation
		driver.findElement(By.xpath(".//*[@id='z1-pullMenu-open']/i[1]")).click();
		
		//Select Internet
		driver.findElement(By.xpath(".//*[@id='tab-desktop-menu']/li[15]/a")).click();
		
		//Click Internet bundles
		driver.findElement(By.xpath(".//*[text()='Internet Bundles']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Internet bundles page
		try {
			driver.findElement(By.xpath(".//*[@id='302622559080052394163960555455285511945']/div/div[5]/div/section/div/a")).click();
		} catch (Exception e) {
			System.out.println("Internet bundles page did not load");
		}
		driver.findElement(By.xpath(".//*[@id='302622559080052394163960555455285511945']/div/div[5]/div/section/div/a")).click();
		
		//Check Availability
		//get CurrentURL
		Url=driver.getCurrentUrl();
		
		//Expected URL
		
		ExpectedUrl= "https://www.att.com/shop/unified/availability.html?filter_id=1400014&destination_page=OFP&product_suite=DTV&referral_app_id=att.com";
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='zipcode']")).sendKeys("91911");
		
		driver.findElement(By.xpath(".//*[@id='streetaddress']")).sendKeys("952 helix ave");
		
		driver.findElement(By.xpath(".//*[@id='content']/div/div[2]/div[3]/div/div/div/form/div[2]/input")).click();
		
		//Offer page
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		driver.findElement(By.xpath(".//*[@id='offerTilesDiv']/div[4]/div/a")).click();
		
		//Build your bundle page
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='hsiaSelectBtn']")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Add internet Plan
		//WriteInternetPlans fis = new WriteInternetPlans();
	//	fis.
		
		
		
		
		driver.findElement(By.xpath(".//*[@id='leftConsumer']/div/div/div[2]/div[2]/div[4]/div[4]/div/div/div[4]/div/p[2]/span[2]/a")).click();
		
		//Add TV
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='iptvSelectBtn']")).click();
		
		driver.findElement(By.xpath(".//*[@id='leftConsumer']/div/div/div[2]/div[2]/div[4]/div[5]/div[1]/div/div[4]/div/p[2]/span[2]/a")).click();
		
		//Add Phone
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='voipSelectBtn']")).click();
		
		driver.findElement(By.xpath(".//*[@id='leftConsumer']/div/div/div[2]/div[2]/div[4]/div[3]/div/div/div[4]/div/p[2]/span[2]/a")).click();
		
		driver.findElement(By.xpath(".//*[@id='leftConsumer']/div/div/div[2]/div[2]/div[4]/p/a[2]/span")).click();
		
		System.out.println("Flow is completed");
		
		
		
		
		
				
		
		
		

	}

}
