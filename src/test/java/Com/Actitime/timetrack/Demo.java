package Com.Actitime.timetrack;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
@Test
	public void runtest()
	{
	Reporter.log("Driver running succesfully", true);
	new FirefoxDriver();
	

	}

}
