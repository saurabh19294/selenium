package seleniumbasics12;


import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchbox {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver= new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		String tittle = driver.getTitle();
		System.out.println("The Page Tittle --"+driver.getTitle());
		WebElement searchbox= driver.findElement(By.name("q"));
		searchbox.sendKeys("miranda cohen");
		Thread.sleep(2000);
		WebElement searchbtn=driver.findElement(By.name("btnK"));
		searchbtn.click();
		String pagetittle=driver.getTitle();
		System.out.println("The nextpage tittle is --"+driver.getTitle());
		Thread.sleep(2000);
		
		driver.close();
		
	}

}





