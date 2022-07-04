package com.mindtree.seleniumclass1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PersnalFinance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[contains(@href,'https://www.moneycontrol.com/personal-finance')]"));
	}

	}


