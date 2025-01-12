package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath extends Base {
	
	
	//1.xpath  //tag[@attribute='value']
	
	
	
	
	public void xPath()
	{
		WebElement xp1=driver.findElement(By.xpath("// button[@id='button-one']"));
		WebElement xp2=driver.findElement(By.xpath("//input[@id='value-b']"));
		WebElement xp3=driver.findElement(By.xpath("//div[@id='message-two']"));
		WebElement xp4=driver.findElement(By.xpath("//button[@id='button-two']"));
		WebElement xp5=driver.findElement(By.xpath("//input[@id='value-a']"));
		
	}

	
	
	
	public void contains()
	{
		//contains   //tag[contains(@attribute,'value')]

		WebElement contain1=driver.findElement(By.xpath("//div[contains(@id,'message-one')]"));
		WebElement contain2=driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement contain3=driver.findElement(By.xpath("//button[contains(@id,'button-one')]"));
		WebElement contain4=driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
		WebElement contain5=driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
		
		
		
		
		
		
	}
	public void startsWith()
	{
		//startsWith()  //tag[starts-with(@attribute,'value')]
		WebElement starts1=driver.findElement(By.xpath("//button[starts-with(@id,'button-two')]"));
		WebElement starts2=driver.findElement(By.xpath("//input[starts-with(@id,'value-a')]"));
		WebElement starts3=driver.findElement(By.xpath("//input[starts-with(@id,'single-input-field')]"));
		WebElement starts4=driver.findElement(By.xpath("//button[starts-with(@id,'button-one')]"));
		WebElement starts5=driver.findElement(By.xpath("//div[starts-with(@id,'message-two')]"));
		
		
		
	}
	
	
	public void texttt()
	{
		//text()//tag[text()='text']
		WebElement text1=driver.findElement(By.xpath("//title[text()='Obsqura Testing']"));
		WebElement text2=driver.findElement(By.xpath("//label[text()='Enter Message']"));
		WebElement text3=driver.findElement(By.xpath("//button[text()='Show Message']"));
		WebElement text4=driver.findElement(By.xpath("//label[text()='Enter value A']"));
		WebElement text5=driver.findElement(By.xpath("//button[text()='Get Total']"));
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
