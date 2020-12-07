package com.orange.hrmlive;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
	
	
  @Test(dataProvider = "dp")
  public void dt(String uname, String pass) {
	System.out.println("Username :"+uname);
	System.out.println("Password :"+pass);
	System.out.println("Opening Browser");
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\jenkinsdemo\\myfirst.mavn.testngapp\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	System.out.println("Loging in");
	driver.findElement(By.name("txtUsername")).sendKeys("uname");

	driver.findElement(By.id("txtPassword")).sendKeys("pass");

	driver.findElement(By.name("Submit")).click();

  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	{"test","test123"},
    	{"Admin","admin123"},
    	
    };
  }
}
