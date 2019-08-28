package com.testvagrant.cleartrip.tests;

import com.testvagrant.cleartrip.pages.HomePage;
import com.testvagrant.cleartrip.utility.CommonUtil;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

	WebDriver driver;
	HomePage homePage;

	@BeforeMethod
	public void beforeMethod() {

		// setting chrome driver path
		CommonUtil.setDriverPath();

		// initializing the driver to ChromeDriver
		driver = new ChromeDriver();

		// URL
		driver.get("https://www.cleartrip.com/");

		// For maximizing the browser window
		driver.manage().window().maximize();

		// for implicit wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		// creating object for home page class
		this.homePage = PageFactory.initElements(driver, HomePage.class);

	}

	@AfterMethod
	public void afterMethod() {
		// close the browser
		driver.quit();
	}

}
