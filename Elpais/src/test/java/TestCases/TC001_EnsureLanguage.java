package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_EnsureLanguage  extends BaseClass{
	
	@Test
	public void Decect_Lang_spanish() {
		logger.info("TC001_EnsureLanguage started");
		HomePage hp = new HomePage(driver);
		hp.ClickAgree_btn();
		String ActualTitle= driver.getTitle();
		String ExpectedTitle="EL PAÍS: el periódico global";
		System.out.println(ActualTitle);
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		logger.info("Verified the text website is in Spanish");
		logger.info("********TC001 is done*********");
		
		
	}

}
