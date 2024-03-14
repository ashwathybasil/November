package pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class KK {
	@Test
	public void test()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	
	
	

}
