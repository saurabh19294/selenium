package seleniumbasics12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//open a webpage
		driver.get("https://demo.automationtesting.in/");
		System.out.println("main page tittle is --"+ driver.getTitle());
		Thread.sleep(2000);
		WebElement searchbox=driver.findElement(By.id("email"));
		searchbox.sendKeys("saurabh@gmail.com");
		WebElement searchbtn=driver.findElement(By.id("enterimg"));
		searchbtn.click();	
		System.out.println("next page tittle is -"+driver.getTitle());
		
		
		
		driver.quit();

	}

}
