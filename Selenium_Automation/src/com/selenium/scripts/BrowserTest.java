package com.selenium.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserTest {

	static WebDriver driver;
	
	static void launchBrowser(String browser) throws InterruptedException {
		switch (browser) {
		case "edge":
		    System.setProperty("webdriver.edge.driver", "./browsers/msedgedriver.exe");
			driver = new EdgeDriver();
		    break;
		case "chrome":
		    System.setProperty("webdriver.chrome.driver", "./browsers/chromedriver.exe");
			driver = new ChromeDriver();
		    break;
		default:
			System.out.println("valid browser");
			break;
		}
		driver.get("https://www.mycontactform.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().to("https://www.mycontactform.com/samples.php");
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getPageSource());
		
		//driver.findElement(By.id("user")).sendKeys("ramesh");
		//driver.findElement(By.id("pass")).sendKeys("Secure*1234");
		Thread.sleep(4000);
		driver.quit();
	}
	
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
	}

}
