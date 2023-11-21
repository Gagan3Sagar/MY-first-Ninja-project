package NinjaOpencart.NinjaPRoject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {
	//@DataProvider(parallel=true)
	@DataProvider
	public Object[][] pleaseProvideTheData()
	{
		Object[][] mydata= {{"Sagarg311997@gmail.com","abcdef"},{"Sagarg1997@gmail.com","abcef"},{"shyamsundar456789000@gmail.com","shyam@321"}};
		return mydata;
	}
}
