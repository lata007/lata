import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

public class ShoePage extends LoadableComponent <ShoePage>
{
 FirefoxDriver dr;
 

 
 ShoePage(FirefoxDriver dr)
 
 {
	 this.dr=dr;
 }
 
 
 
 void verifyTitle()
 {
 	System.out.println(dr.getTitle().contains(" Womens Designer Shoes | BLUEFLY Up to 70% Off Designer Brands "));
}
 
 public DesignerPage clickDesignerPage()
 {
	dr.findElement(By.xpath(".//*[@id='departmentLeftNaviContainer']/div[2]/ul[1]/li[2]/a")).click(); 
	return new DesignerPage(dr);
 }



@Override
protected void isLoaded() 
{
	Assert.assertTrue(dr.getCurrentUrl().equals("http://www.bluefly.com/a/shoes"));
	System.out.println(dr.getTitle().contains(" Womens Designer Shoes | BLUEFLY Up to 70% Off Designer Brands "));
	
}



@Override
protected void load()
{
	dr.get("http://www.bluefly.com/a/shoes");
	System.out.println("load");
	System.out.println(dr.getPageSource().contains(" Womens Designer Shoes | BLUEFLY Up to 70% Off Designer Brands"));
	
}
}
