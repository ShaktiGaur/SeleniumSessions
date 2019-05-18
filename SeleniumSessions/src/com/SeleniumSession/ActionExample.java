package com.SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		WebElement child = driver.findElement(By.cssSelector("#nav-tools"));

		Actions action = new Actions(driver);

		List<WebElement> links = child.findElements(By.tagName("a"));

		for (WebElement link : links) {
			action.moveToElement(link).build().perform();

			Thread.sleep(5000);
		}

	}

}
