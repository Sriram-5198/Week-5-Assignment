package week5.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.sukgu.Shadow;

public class BaseClass1 {

	public ChromeDriver d;
	
	
	@BeforeMethod
	public void preCondition() throws InterruptedException {
	 d=new ChromeDriver();
	 d.get("https://dev120394.service-now.com");
	 d.manage().window().maximize();
	 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 d.findElement(By.id("user_name")).sendKeys("admin");
	 d.findElement(By.id("user_password")).sendKeys("Sriram@5198");
	 d.findElement(By.xpath("//button[@id='sysverb_login']")).click();
	 Thread.sleep(2000);
	 Shadow sh=new Shadow(d);
	 sh.setImplicitWait(10);
	 sh.findElementByXPath("//div[contains(@class,'sn-polaris-navigation polaris-header-menu')]/div").click();
	 sh.findElementByXPath("//input[contains(@id,'filter')]").click();
	 sh.findElementByXPath("//input[contains(@id,'filter')]").sendKeys("Callers");
	 sh.findElementByXPath("//input[contains(@id,'filter')]").sendKeys(Keys.ENTER);
	
     }
	
	@AfterMethod
	public void postCondition() {
		d.close();
	}
}
