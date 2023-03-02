package seleniumbasics12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//open a webpage
		driver.get("https://www.google.com/");
		System.out.println("The webpage Tittle--"+driver.getTitle());
		WebElement css=driver.findElement(By.cssSelector("input.gLFyf"));
		//css.sendKeys("fridge");
//		WebElement serchbtnj=driver.findElement(By.cssSelector("input.gNO89b"));
//		serchbtnj.click();
		css.sendKeys("fridge "+Keys.ENTER);
		Thread.sleep(2000);
		
		
		
		driver.quit();
		
		

	}

}
