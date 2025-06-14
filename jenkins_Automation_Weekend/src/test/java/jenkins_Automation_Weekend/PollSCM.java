package jenkins_Automation_Weekend;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PollSCM 
{
	@Test
	public void poll()
	{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	Reporter.log("POLL SCM has been triggered in JenkinsTest class", true);
    }
}
