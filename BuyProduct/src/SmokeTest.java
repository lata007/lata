import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmokeTest extends BaseTest
{
 
 HomePage hp;
 ShoePage sp;
 
 
 @Test
 public void test01()
 {
	          hp= new HomePage(dr);
	          hp.verifyTitle();
	          sp = hp.clickShoePage().get();
	 
 }
}
