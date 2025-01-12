package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadiobuttonDemo extends Base {
	public void radioButton()
	{
	driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	WebElement check1=driver.findElement(By.cssSelector("input#inlineRadio1"));
	check1.click();
	WebElement check2=driver.findElement(By.cssSelector("input#inlineRadio23"));
	check2.click();
	
	
	}

	public void isSelected()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement check1=driver.findElement(By.cssSelector("input#inlineRadio1"));
		check1.click();
		if(check1.isSelected()) {
			System.out.println("already selected");
		}
		else {
			check1.click();
			System.out.println("select");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RadiobuttonDemo radiobuttondemo =new RadiobuttonDemo();
		radiobuttondemo.initialize_Browse();
		//radiobuttondemo.radioButton();
		//radiobuttondemo.driver_QuitandClose();
		radiobuttondemo.isSelected();

	}

}
