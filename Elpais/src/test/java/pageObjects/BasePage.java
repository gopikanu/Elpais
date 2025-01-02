package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	WebDriver driver;
	JavascriptExecutor je;
	Select sel;
    Actions actions;
    String newline ;

	public BasePage(WebDriver driver) {
		 this.driver= driver;
		 je = (JavascriptExecutor) driver;
		 actions=new Actions(driver);
		 PageFactory.initElements(driver,this);
		 newline = System.lineSeparator(); 
	}

}
