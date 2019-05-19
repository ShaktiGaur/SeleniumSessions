package automationTestCases;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstAutomationScript
{
  
	
	
  	public static void main(String[] args) 
	
	{
		
	    System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		//driver.get("https://www.facebook.com/");
	   /* driver.findElement(By.id("user-message")).sendKeys("Hi");
	    driver.findElement(By.xpath("//button[contains(text(),'Show Message')]")).click();
	    driver.findElement(By.id("sum1")).sendKeys("1");
		driver.findElement(By.id("sum2")).sendKeys("1");
		driver.findElement(By.xpath("//button[contains(text(),'Get Total')]")).click(); */
		
		/* usage of css selector
		driver.findElement(By.cssSelector("input[id='user-message']")).sendKeys("Welcome!!");
		driver.findElement(By.cssSelector("button[onclick='showInput();']")).click();  */
		
		/*shortcuts of css selector
		driver.findElement(By.cssSelector("input#user-message")).sendKeys("Welcome!!");
		driver.findElement(By.cssSelector("button.btn btn-default")).click(); */
		

		
		/*use of parent child concept
		driver.findElement(By.xpath("//form[@id='login_form'] //input[@id='email']")).sendKeys("ABC");
		driver.findElement(By.xpath("//form[@id='login_form'] //input[@id='pass']")).sendKeys("DEF"); */
		
		//use of identifying a cell in table
	   List <WebElement> header = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/th"));
	   for (WebElement headers:header)
	   {
		   System.out.println(headers.getText());
	   }
			   
       
		
		
  
	}


	
}
