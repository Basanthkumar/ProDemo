package Package_1;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewClass {

	public static WebDriver obrowser = null;
	public static void main(String[] args) {
		launch();
		navigate();
		login();
		createUser();
		
	
	}
	
	static void launch()
	{
		obrowser = new FirefoxDriver();
		
	}

	static void navigate()
	{
		obrowser.get("http://localhost/login.do");
		obrowser.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		
	}
	
	static void login()
	{
		try{
		obrowser.findElement(By.id("username")).sendKeys("admin");
		obrowser.findElement(By.name("pwd")).sendKeys("manager");
		obrowser.findElement(By.id("loginButton")).click();
		
		//obrowser.findElement(By.id("taskSearchControl_field")).sendKeys("Hi");
		
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void createUser()
	{
		try{
			//obrowser.findElement(By.id("userNameInput")).sendKeys("Hi");
		//obrowser.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[9]/a/img")).click();
		obrowser.findElement(By.xpath("//a[@class='content users_selected selected']")).click();
		Thread.sleep(2000);
		obrowser.findElement(By.xpath("//div[@id='ext-comp-1003']/span")).click();
		obrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("First");
		obrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("FirstID");
		obrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Last");
		obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("abc@gmail.com");
		obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Password");
		obrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Password");
		obrowser.findElement(By.xpath("//*[@class='btnDivWithBgImg']/span")).sendKeys("Password");
		
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyuser()
	{
		try{
			obrowser.findElement(By.xpath("//div/span[text()='Last, First (FirstID)']")).click();
			obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("abcModified@gmail.com");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void logout()
	{
		obrowser.close();
	}
	
	
}
