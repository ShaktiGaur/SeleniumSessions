package com.SeleniumSession;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;



public class SimpleSeleniumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("anoop.41987@gmail.com");
		
		//access object using parent child relation
		
		 List <WebElement> headers =  driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr[1]/td[4]"));
		 
		for(WebElement header : headers){
			System.out.println(header.getText());	
		}
		 
		

		
		
		
		
		
		

	}

}
