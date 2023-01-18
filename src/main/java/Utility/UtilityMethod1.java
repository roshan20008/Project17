package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethod1 {
	
	public static void selectClass(WebElement ele, String option)
	{
		Select s = new Select(ele);
	    s.deselectByVisibleText(option);
	}

}
