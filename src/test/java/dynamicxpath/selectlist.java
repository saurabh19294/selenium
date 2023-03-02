package dynamicxpath;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectlist {
	WebDriver driver;
	//apply common thing
	
	@Before

	
	public void setup()
{
	driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	}
// new method
	@Test
public void validatetittle()
{
	String actualtittle=driver.getTitle();
	Assert.assertEquals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in", actualtittle);
}
	
	@Test
	public void searchprod() throws InterruptedException {
	WebElement searchlist=driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
	searchlist.sendKeys("led");
	Thread.sleep(2000);
	
	WebElement searchbtn=driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
	searchbtn.click();
	
	
	}
	// incomplete 
	
	@After
public void teardown()
{

	driver.quit();
}

}


