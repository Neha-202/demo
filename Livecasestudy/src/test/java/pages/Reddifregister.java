package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Reddifregister {

WebDriver driver;
public Reddifregister(WebDriver driver)
{
	this.driver=driver;
}
public void setUsername(String fname)
{
WebElement name=driver.findElement(By.xpath("//input[starts-with(@name, 'name')]"));	
name.sendKeys(fname);
}
public void setPassword(String pass)
{
	WebElement pwd=driver.findElement(By.id("newpasswd"));
pwd.sendKeys(pass);
}
public void confPassword(String conpass)
{
	WebElement cpass=driver.findElement(By.id("newpasswd1"));
cpass.sendKeys("conpass");
}
public void dropdown()
{
	WebElement dpdw=driver.findElement(By.xpath("//select[starts-with(@name,'DOB_Month')]"));
Select selbj=new Select(dpdw);
selbj.selectByValue("05");
}




}
