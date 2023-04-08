package week5.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class CreateIncident extends BaseClass1 {
    
	@Test
	public void runCreateIncident() throws InterruptedException {
		
		Thread.sleep(2000);
		Shadow sh=new Shadow(d);
		WebElement fr = sh.findElementByXPath("//iframe[@id='gsft_main']");
		d.switchTo().frame(fr);
		
		d.findElement(By.xpath("//button[@id='sysverb_new']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[contains(@class,'col-xs-10 col-sm-9 col-md-6 col-lg-5 form-field input_controls')]/input")).sendKeys("Sri Ram");
		d.findElement(By.xpath("(//div[contains(@class,'col-xs-10 col-sm-9 col-md-6 col-lg-5 form-field input_controls')]/input)[2]")).sendKeys("R");
		Thread.sleep(2000);
		d.findElement(By.xpath("(//div[contains(@class,'col-xs-10 col-sm-9 col-md-6 col-lg-5 form-field input_controls')]/input)[5]")).sendKeys("Administrative Assistant");
		d.findElement(By.xpath("(//div[contains(@class,'col-xs-10 col-sm-9 col-md-6 col-lg-5 form-field input_controls')]/span/input)")).sendKeys("sriram02234@gmail.com");
		d.findElement(By.xpath("(//div[contains(@class,'col-xs-10 col-sm-9 col-md-6 col-lg-5 form-field input_controls')]/input)[6]")).sendKeys("9876567890");
		d.findElement(By.xpath("(//div[contains(@class,'col-xs-10 col-sm-9 col-md-6 col-lg-5 form-field input_controls')]/input)[7]")).sendKeys("9874567890");
		Thread.sleep(2000);
		d.findElement(By.xpath("(//button[contains(text(),'Submit')])[2]")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//input[contains(@type,'search')])[2]")).click();
		d.findElement(By.xpath("(//input[contains(@type,'search')])[2]")).sendKeys("Sri Ram");
		d.findElement(By.xpath("(//input[contains(@type,'search')])[2]")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		String nm = d.findElement(By.xpath("//div[contains(@class,'list_div_parent')]/div/table/tbody/tr/td[4]")).getText();
		if (nm.contains("Sri Ram")) {
			System.out.println("Newly created Caller is verified ");
		}else {
			System.out.println("Newly created Caller is not verified ");
		}
	}

}
