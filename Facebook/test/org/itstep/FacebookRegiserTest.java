package org.itstep;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriverService.Builder;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegiserTest {

	private static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\drvs\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	

	@Test
	public void test() {
		driver.findElement(By.id("u_0_j")).sendKeys("Alex");
		driver.findElement(By.id("u_0_l")).sendKeys("Perederiy");
		driver.findElement(By.id("u_0_o")).sendKeys("+30999999999");
		driver.findElement(By.id("u_0_v")).sendKeys("1111111111111");
		Select select1 = new Select(driver.findElement(By.id("day")));
		select1.selectByValue("23");
		Select select2 = new Select(driver.findElement(By.id("month")));
		select2.selectByValue("6");
		Select select3 = new Select(driver.findElement(By.id("year")));
		select3.selectByValue("2015");
		WebElement sex = driver.findElement(By.id("u_0_7"));
		if(!sex.isEnabled()) {
			sex.click();
		}
		//driver.findElement(By.id("u_0_11")).submit();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("");
		
		Builder builder = new Builder();
		
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
}
