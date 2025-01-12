package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxDemo extends Base{
	
	public void checkBox()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement check1=driver.findElement(By.cssSelector("input#gridCheck"));
		check1.click();
		WebElement check2=driver.findElement(By.cssSelector("section.clearfix"));
		check2.click();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckboxDemo checkboxdemo =new CheckboxDemo();
		checkboxdemo.initialize_Browse();
		checkboxdemo.checkBox();
		//checkboxdemo.driver_QuitandClose();
		

	}

}
