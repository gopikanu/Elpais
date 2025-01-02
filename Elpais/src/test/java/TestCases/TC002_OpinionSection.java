package TestCases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.OpinionSection;
import testBase.BaseClass;

public class TC002_OpinionSection  extends BaseClass{

	@Test
	public void verify_OpinionSection() throws Exception{
		logger.info("TC002_OpinionSection started");
		
		HomePage hp = new HomePage(driver);
		hp.ClickAgree_btn();
		hp.Navigate_OpinionLnk();
		logger.info("Print the title and the contenet of the article");
		OpinionSection  os = new OpinionSection(driver);
		os.print_Articles_Title();
		os.print_Articles_Content();
		
		logger.info("********TC002 is done*********");
		os.downloadImage1();	
		os.downloadImage2();	
		os.downloadImage3();
		os.downloadImage4();
		os.downloadImage5();
		
	}
}
