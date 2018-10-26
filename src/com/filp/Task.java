package com.filp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
   public static void lanuchBrowser() {
	    
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Bharathi\\eclipse-workspace\\Flipkart\\Driver2\\chromedriver.exe");  
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	 driver.manage().window().maximize();
	 WebElement login=driver.findElement(By.xpath("//span[text()='Cart']"));
	 login.click();
}
	
	
	public static void main(String[] args)
	{
		Task t1=new Task();
		t1.lanuchBrowser();
		
	}
	
}
