package seleniumbasics12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser {
	public static void main(String[]agrs) throws InterruptedException
	{
		
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    System.out.println("the page tittle is --"+ driver.getTitle());   
    driver.navigate().to("https://www.youtube.com/");
    System.out.println("THe next page is ---"+driver.getTitle());
    driver.navigate().back();
    System.out.println("THe next page is ---"+driver.getTitle());
    
    Thread.sleep(3000);
    driver.close();
}
}