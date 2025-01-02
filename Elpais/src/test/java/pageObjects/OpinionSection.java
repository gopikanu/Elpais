package pageObjects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OpinionSection extends BasePage{

	public OpinionSection(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//section[@class='_g _g-md _g-o b b-d']//div[@class='b-d_a']//article[1]//header[1]//h2")
	WebElement article1_Title;
	
	@FindBy(xpath="//section[@class='_g _g-md _g-o b b-d']//div[@class='b-d_a']//article[2]//header[1]//h2")
	WebElement article2_Title;
	
	@FindBy(xpath="//section[@class='_g _g-md _g-o b b-d']//div[@class='b-d_a']//article[3]//header[1]//h2")
	WebElement article3_Title;
	
	@FindBy(xpath="//section[@class='_g _g-md _g-o b b-d']//div[@class='b-d_b b_op _g _g-md b_op-1-2']//article[1]//header//h2")
	WebElement article4_Title;
	
	@FindBy(xpath="//div[@class='b-d_c b_st']//article[@class='c c-d c--m   ']//h2[@class='c_t ']")
	WebElement article5_Title;
	
	@FindBy(xpath="//section[@class='_g _g-md _g-o b b-d']//div[@class='b-d_a']//article[1]//p[@class='c_d']")
	WebElement article1_content;
	
	@FindBy(xpath="//section[@class='_g _g-md _g-o b b-d']//div[@class='b-d_a']//article[2]//p[@class='c_d']")
	WebElement article2_content;
	
	@FindBy(xpath="//section[@class='_g _g-md _g-o b b-d']//div[@class='b-d_a']//article[3]//p[@class='c_d']")
	WebElement article3_content;
	
	@FindBy(xpath="//section[@class='_g _g-md _g-o b b-d']//div[@class='b-d_b b_op _g _g-md b_op-1-2']//article[1]//p[@class='c_d']")
	WebElement article4_content;
	
	@FindBy(xpath="//div[@class='b-d_c b_st']//article[@class='c c-d c--m   ']//p[@class='c_d']")
	WebElement article5_content;
	
	@FindBy(xpath="//img[@class='_re  a_m-h']")
	WebElement image1;
	
	
	
	public void print_Articles_Title() 
	{
		je.executeScript("arguments[0].scrollIntoView();", article1_Title);
		String Title1=article1_Title.getText();
		String Title2=article2_Title.getText();
		String Title3=article3_Title.getText();
		String Title4=article4_Title.getText();
		String Title5=article5_Title.getText();
		System.out.println("***Article1***"+newline+ "Title: "+Title1);
		System.out.println("***Article2***"+newline+ "Title: "+Title2);
		System.out.println("***Article3***"+newline+ "Title: "+Title3);
		System.out.println("***Article4***"+newline+ "Title: "+Title4);
		System.out.println("***Article5***"+newline+ "Title: "+Title5);
	}
	
	public void print_Articles_Content() 
	{
		String content1=article1_content.getText();
		String content2=article2_content.getText();
		String content3=article3_content.getText();
		String content4=article4_content.getText();
		String content5=article5_content.getText();
		System.out.println("***Article1***"+newline+ "Content :"+content1);			
		System.out.println("***Article2***"+newline+"Content :"+content2);			
		System.out.println("***Article3*** "+newline+"Content :"+content3);			
		System.out.println("***Article4*** "+newline+"Content :"+content4);			
		System.out.println("***Article5***"+newline+"Content :"+content5);
			
	}
	
	public void downloadImage1() throws Exception {
		try {
		je.executeScript("scroll(0,-250)");
			
		article1_Title.click();	
		
		je.executeScript("arguments[0].scrollIntoView();", image1);
		
		String SRC= image1.getAttribute("src");
		
			URL imageURL = new URL(SRC);
			BufferedImage saveImage = ImageIO.read(imageURL);
		     
		     
				ImageIO.write(saveImage, "png", new File("Article1_Image.png"));
		 
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*actions.contextClick(image1).build().perform();
		actions.sendKeys(Keys.CONTROL,"V").click();
		
		actions.sendKeys(Keys.CONTROL,"S").click();*/
		driver.navigate().back();
	}
	
	public void downloadImage2() throws Exception {
		try {
		je.executeScript("scroll(0,-250)");
			
		article2_Title.click();	
		
		je.executeScript("arguments[0].scrollIntoView();", image1);
		
		String SRC= image1.getAttribute("src");
		
			URL imageURL = new URL(SRC);
			BufferedImage saveImage = ImageIO.read(imageURL);
		     
		     
				ImageIO.write(saveImage, "png", new File("Article2_Image.png"));
		 
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	}
	
	public void downloadImage3() throws Exception {
		try {
		je.executeScript("scroll(0,-250)");
			
		article3_Title.click();	
		
		je.executeScript("arguments[0].scrollIntoView();", image1);
		
		String SRC= image1.getAttribute("src");
		
			URL imageURL = new URL(SRC);
			BufferedImage saveImage = ImageIO.read(imageURL);
		     
		     
				ImageIO.write(saveImage, "png", new File("Article3_Image.png"));
		 
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	}
	
	public void downloadImage4() throws Exception {
		try {
		je.executeScript("scroll(0,-250)");
			
		article4_Title.click();	
		
		je.executeScript("arguments[0].scrollIntoView();", image1);
		
		String SRC= image1.getAttribute("src");
		
			URL imageURL = new URL(SRC);
			BufferedImage saveImage = ImageIO.read(imageURL);
		     
		     
				ImageIO.write(saveImage, "png", new File("Article4_Image.png"));
		 
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	}
	public void downloadImage5() throws Exception {
		try {
		je.executeScript("scroll(0,-250)");
			
		article5_Title.click();	
		
		je.executeScript("arguments[0].scrollIntoView();", image1);
		
		String SRC= image1.getAttribute("src");
		
			URL imageURL = new URL(SRC);
			BufferedImage saveImage = ImageIO.read(imageURL);
		     
		     
				ImageIO.write(saveImage, "png", new File("Article5_Image.png"));
		 
		} 
		catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	}
	
	
	

}
