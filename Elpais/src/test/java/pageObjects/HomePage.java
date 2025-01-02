package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//button[@id='didomi-notice-agree-button']")
	WebElement agree_btn;
	
	@FindBy(xpath="//a[@class='b_h_t _pr'][normalize-space()='Opinión']")
	WebElement Lnk_Opinion;
	
	
	
	
	public void ClickAgree_btn() {
		agree_btn.click();
	}
	
	public void Navigate_OpinionLnk() {
		//JavascriptExecutor js =  (JavascriptExecutor)driver;
		//je.executeScript("arguments[0].scrollIntoView();", Lnk_Opinion);
		Lnk_Opinion.click();
	}
	
	
	

}
