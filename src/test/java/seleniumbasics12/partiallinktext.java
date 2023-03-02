package seleniumbasics12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallinktext {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//open a webpage
		driver.get("https://dzone.com/articles/find-elements-with-link-text-amp-partial-link-text/");
		System.out.println("The webpage Tittle--"+driver.getTitle());


		WebElement idlink=driver.findElement(By.partialLinkText("Name locator"));
		idlink.click();
		
		System.out.println("Link page tittle is-" + driver.getTitle());
		Thread.sleep(5000);
		driver.quit();
	
	}

}
