package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Csselector extends Base {
	
	//1.Tag and ID(tag#id)
			//2.Tag and class(tag.class)
			//3.Tag and Attribute(tag[attribute=value]
			//4.Tag,class,and Attribute(tag.classname[attribute=value]
	
public void tagAndid()
{
WebElement tag1=driver.findElement(By.cssSelector("button#button-one"));	
WebElement tag2=driver.findElement(By.cssSelector("div#message-two"));
WebElement tag3=driver.findElement(By.cssSelector("div#collapsibleNavbar"));
WebElement tag4=driver.findElement(By.cssSelector("input#value-b"));
WebElement tab5=driver.findElement(By.cssSelector("input#single-input-field"));
}
	
public void tagAndclass()
{
	WebElement tagclass1=driver.findElement(By.cssSelector("button.navbar-toggler"));
	WebElement tagclass2=driver.findElement(By.cssSelector("div.header-top"));
	WebElement tagclass3=driver.findElement(By.cssSelector("div.mb-sec"));
	WebElement tagclass4=driver.findElement(By.cssSelector("div.header-top"));
	WebElement tagclass5=driver.findElement(By.cssSelector("section.clearfix"));
}
	
	public void tagAndattribute()
	{
		WebElement tagattri1=driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement tagattri2=driver.findElement(By.cssSelector("div[id=message-one]"));
		WebElement tagattri3=driver.findElement(By.cssSelector("input[id=value-a]"));
		WebElement tagattri4=driver.findElement(By.cssSelector("div[id=message-two]"));
		WebElement tagattri5=driver.findElement(By.cssSelector("input[id=value-b]"));
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
