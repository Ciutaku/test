package com.docler.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.*;

public class Docler
{

	public static void main(String[] args) throws InterruptedException {
		
		// Create Chrome driver to drive the browser
		// WebDriver driver =new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "G://Downloads//chromedriver_win32//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // UI Testing and Logo checks      
		driver.get("http://uitest.duodecadits.com/");
	    System.out.println(driver.findElement(By.id("site")).getText() + " string is present.");
	    System.out.println("Is Logo present? " + driver.findElement(By.id("dh_logo")).isDisplayed());
	    
	    //Home tab tests
		driver.findElement(By.id("home")).click();
		System.out.println("Home has been accessed");
		System.out.println(driver.findElement(By.id("site")).getText() + " string is present.");
		System.out.println("Is Logo present? " + driver.findElement(By.id("dh_logo")).isDisplayed());
		//Home tab button highlight verification (Was so happy when I figured this one out, haha)
		System.out.println(driver.findElement(By.className("active")).getText()+ " tab button is highlighted");
		
		//Form tab tests
		driver.findElement(By.id("form")).click();	
		System.out.println("Form has been accessed");
		System.out.println(driver.findElement(By.id("site")).getText() + " string is present.");
		System.out.println("Is Logo present? " + driver.findElement(By.id("dh_logo")).isDisplayed());
		//Form tab button highlight verification
		System.out.println(driver.findElement(By.className("active")).getText()+ " tab button is highlighted");
		
		//Error tab tests
		driver.findElement(By.id("error")).click();
		System.out.println("Error has been accessed");
		System.out.println(driver.getTitle() + " string is present.");
		
		//Going to homepage from a different tab by clicking UI Testing
		driver.get("http://uitest.duodecadits.com/form.html");
		driver.findElement(By.id("site")).click();
		
		//Verifying that the Home page contains the required texts 
		assertEquals("Welcome to the Docler Holding QA Department", driver.findElement(By.cssSelector("h1")).getText());
		assertEquals("This site is dedicated to perform some exercises and demonstrate automated web testing.", driver.findElement(By.cssSelector("p")).getText());
		
		//Go to Form and input values into field
		//Depending on what the document required, I would have, of course, put either verify, or assert if these conditions are a must.
		//I really wanted to wrap these together but failed.
		//John
		driver.findElement(By.id("form")).click();
		driver.findElement(By.id("hello-input")).clear();
		driver.findElement(By.id("hello-input")).sendKeys("John");
		driver.findElement(By.id("hello-submit")).click();
		System.out.println("Text for John input is "+ driver.findElement(By.id("hello-text")).getText());
		driver.navigate().back();
		
		//Sophia
		Thread.sleep(2000);
		driver.findElement(By.id("hello-input")).clear();
		driver.findElement(By.id("hello-input")).sendKeys("Sophia");
		driver.findElement(By.id("hello-submit")).click();
		System.out.println("Text for Sophia input is "+ driver.findElement(By.id("hello-text")).getText());
		driver.navigate().back();
		
		//Charlie
		Thread.sleep(2000);
		driver.findElement(By.id("hello-input")).clear();
		driver.findElement(By.id("hello-input")).sendKeys("Charlie");
		driver.findElement(By.id("hello-submit")).click();
		System.out.println("Text for Charlie input is "+ driver.findElement(By.id("hello-text")).getText());
		driver.navigate().back();
		
		//Emily
		Thread.sleep(2000);
		driver.findElement(By.id("hello-input")).clear();
		driver.findElement(By.id("hello-input")).sendKeys("Emily");
		driver.findElement(By.id("hello-submit")).click();
		System.out.println("Text for Emily input is "+ driver.findElement(By.id("hello-text")).getText());
		
		driver.quit();
	}
}

		
		
	
