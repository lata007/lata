import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest
{
	FirefoxDriver dr;
	@Before
	public  void start() throws InterruptedException
	{
		dr=new FirefoxDriver();
		dr.get("http://www.bluefly.com");
		dr.manage().window().maximize();
		Thread.sleep(3000);
		dr.navigate().refresh();
	}
	@After
		
	public void end() throws InterruptedException
	{
		 Thread.sleep(3000); 
		 dr.quit();
	}
}
