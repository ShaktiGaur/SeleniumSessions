package com.SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		Select dropDown = new Select(driver.findElement(By.id("select-demo")));
		
		dropDown.selectByValue("Monday");
		
		
	}

}
