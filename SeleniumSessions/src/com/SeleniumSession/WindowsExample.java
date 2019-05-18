package com.SeleniumSession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		driver.findElement(By.xpath("//*[text()='Follow All']")).click();
		
		Thread.sleep(5000);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> windowsId = driver.getWindowHandles();
		
		//WebDriver childWindow = driver.switchTo().window(windowsId);
		
		
		//Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=windowsId.iterator();
        
        while(i1.hasNext()){
        	String child = i1.next();
        	
        	System.out.println(child);
        	if(!(child.toString().matches(parent))){
        	WebDriver childWindow = driver.switchTo().window(child);
        	
        	//childWindow.findElement(By.id("username_or_email")).sendKeys("anoop");
        	
        	
        	System.out.println(childWindow.getTitle());
        	
        	childWindow.close();
        	}
        	
        	
        }
        //driver.switchTo().window(parent);
        
		
       // driver.findElement(By.xpath("//*[@class='btn btn-primary followeasy']")).click();
				
		
	}

}
