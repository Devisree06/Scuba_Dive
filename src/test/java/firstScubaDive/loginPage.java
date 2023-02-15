package firstScubaDive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class loginPage {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notification");
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
		WebElement a=driver.findElement(By.xpath("//a[text()='WOMEN']"));
		Actions action=new Actions(driver);
		action.moveToElement(a);
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Devisree");
		Thread.sleep(1000);
		driver.quit();
		  
	}

}
