package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TranslationPage extends BasePage{

	public TranslationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//textarea[@class='er8xn']")	
	WebElement detectarea;
	
	@FindBy(xpath="//span[@jsaction='agoMJf:PFBcW;MZfLnc:P7O7bd;nt4Alf:pvnm0e,pfE8Hb,PFBcW;B01qod:dJXsye;H1e5u:iXtTIf;lYIUJf:hij5Wb']")
	WebElement translatedarea;
	
	@FindBy(xpath="//button[@class='VfPpkd-Bz112c-LgbsSe VfPpkd-Bz112c-LgbsSe-OWXEXe-e5LLRc-SxQuSe yHy1rc eT1oJ mN1ivc ZihNHd GA2I6e']")
	WebElement closeBtn;
	
	public void TranslateHeader1(String title1) {
		detectarea.sendKeys(title1);
		String engHeader= translatedarea.getText();
		System.out.println(engHeader);
		closeBtn.click();
	}
	public void TranslateHeader2(String title2) {
		detectarea.sendKeys(title2);
		String engHeader1= translatedarea.getText();
		System.out.println(engHeader1);
		closeBtn.click();
		
	}
	public void TranslateHeader3(String title3) {
		detectarea.sendKeys(title3);
		String engHeader2= translatedarea.getText();
		System.out.println(engHeader2);
		closeBtn.click();
		
	}
	public void TranslateHeader4(String title4) {
		detectarea.sendKeys(title4);
		String engHeader3= translatedarea.getText();
		System.out.println(engHeader3);
		closeBtn.click();
		
	}
	public void TranslateHeader5(String title5) {
		detectarea.sendKeys(title5);
		String engHeader4= translatedarea.getText();
		System.out.println(engHeader4);
		
	}
	
	

}
