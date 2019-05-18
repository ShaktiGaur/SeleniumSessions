package com.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		
		WebElement childDriver = driver.findElement(By.cssSelector(".footer"));
		
		List <WebElement> footerLinks = childDriver.findElements(By.tagName("a"));
		
		System.out.println(footerLinks.size());
		
		for(WebElement link : footerLinks){
			System.out.println(link.getText());
		}
		
		
	}

}
