package TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pageObjects.TranslationPage;
import testBase.BaseClass1;

public class TC003_TranslatingHeaders extends BaseClass1{
	@Test
	public void verifyTranslateHeader() {
		logger.info("TC003 TranslatingHeaders started");
		TranslationPage tp = new TranslationPage(driver);
		logger.info(" Translating the Headers ");
		tp.TranslateHeader1(p.getProperty("Header1"));
		tp.TranslateHeader2(p.getProperty("Header2"));
		tp.TranslateHeader3(p.getProperty("Header3"));
		tp.TranslateHeader4(p.getProperty("Header4"));
		tp.TranslateHeader5(p.getProperty("Header5"));
		logger.info("********TC003 is done*********");
		
	}
	
	

}
