package seleniumbasics12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorclass {

	public static void main(String[] args) throws InterruptedException {
		//open chromebrowser,delete coockies etc
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//open a webpage
		driver.get("http://zero.webappsecurity.com/");
		System.out.println("The webpage Tittle--"+driver.getTitle());
		// to open sign btn
		WebElement signbtn=driver.findElement(By.className("signin"));
		
		Thread.sleep(2000);
		if(signbtn.isDisplayed())
		{
		signbtn.click();
		}
		else
		{
			System.out.println("the naextb page is not showing");
		}
		System.out.println("The Nextpage Tittle is--"+driver.getTitle());
		WebElement loginbtn=driver.findElement(By.id("user_login"));
		WebElement passbtn=driver.findElement(By.id("user_password"));
		
		if(loginbtn.isEnabled())
		{
			loginbtn.sendKeys("saurabh");
		}
		else
		{
			System.out.println("theloginbtn not enable");
		}
		if(passbtn.isEnabled())
		{
			passbtn.sendKeys("password");
		}
		else
		{
			System.out.println("passbtn not enable");
		}
		WebElement signbtn1=driver.findElement(By.name("submit"));
		if(signbtn1.isEnabled())
		{
			signbtn1.click();		}
		else
		{
			System.out.println("signbtn1 not enable");
		}
		System.out.println("The login page Tittle is -" + driver.getTitle());
		Thread.sleep(2000);
		driver.close();
	}

}
