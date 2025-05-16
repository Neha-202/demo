package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Testbase {

 public WebDriver driver;
 Properties prop;
 
 public void logprop() throws IOException
 {
	 FileInputStream propol=new FileInputStream("C:\\mavenproject\\Livecasestudy\\src\\test\\resources\\config.properties");
  prop=new Properties();
 prop.load(propol);
 }
@BeforeTest
public void setConfig() throws IOException
{
	logprop();
	driver=new ChromeDriver();
	driver.get(prop.getProperty("Url"));
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}





}
