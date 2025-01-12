package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drop_down extends Base {
	
	
public void dropDown()
{
	driver.navigate().to("https://selenium.qabible.in/select-input.php");
	WebElement check1=driver.findElement(By.cssSelector("select#single-input-field"));
	Select select=new Select(check1);
	//select.selectByVisibleText("Yellow");
	select.selectByIndex(3);
	
}
	

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drop_down dropdown2 = new Drop_down();
		dropdown2.initialize_Browse();
		dropdown2.dropDown();
		//dropdown2.driver_QuitandClose();
	}

}
