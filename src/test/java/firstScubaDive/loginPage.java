package firstScubaDive;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class loginPage {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com");
		Thread.sleep(3000);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notification");
		WebElement searchButton=driver.findElement(By.xpath("//input[@placeholder='Search AJIO']"));
		searchButton.sendKeys("Kids dress",Keys.ENTER);
		//WebElement a=driver.findElement(By.xpath("//a[text()='WOMEN']"));
		//a.click();
		//Actions action=new Actions(driver);
		//action.moveToElement(a);
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Devisree");
		Thread.sleep(1000);
		driver.quit();
		  
	}

}
