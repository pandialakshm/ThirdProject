package salesforcepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforcecls {

	public static void main(String[] args) throws InterruptedException{
		
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(co);
		//driver.get("https://www.snapdeal.com");
		driver.get("https://www.leafground.com/radio.xhtml");
		
		//System.out.println(driver.getPageSource());
		WebElement unchecked=driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[3]/div/div[2]/span"));
		
		boolean status=unchecked.isSelected();
		
		
		//Select  drpdown=new Select(Register);
		//drpdown.selectByVisibleText("Showcase");
		
		
		
		//WebElement Registeremail = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
		
		//Registeremail.sendKeys("pandialakshmi.ravi@gamil.com");
		//System.out.println(Registeremail.getText());
		
		
			
		//System.out.println(searchstore.isEnabled());
		//System.out.println(searchstore.isDisplayed());
		System.out.println(status);
		
		Thread.sleep(3000000);
		driver.quit();
		
		
		
		

	}

}
