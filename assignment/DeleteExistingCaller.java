package week5.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.github.sukgu.Shadow;

public class DeleteExistingCaller extends BaseClass1{
	
	@Test
	public void runDeleteExistingCaller() throws InterruptedException {
		
		Thread.sleep(2000);
		Shadow sh=new Shadow(d);
		WebElement fr = sh.findElementByXPath("//iframe[@id='gsft_main']");
		d.switchTo().frame(fr);
		d.findElement(By.xpath("(//input[contains(@class,'list_header_search ')])[2]")).click();
		d.findElement(By.xpath("(//div[contains(@class,'input-group-transparent')])[2]/input[@type='search']")).sendKeys("Sri Ram");
		d.findElement(By.xpath("(//div[contains(@class,'input-group-transparent')])[2]/input[@type='search']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[contains(@class,' list_div_parent')]/div/table/tbody/tr[1]/td[3]/a")).click();
	    Thread.sleep(2000);
	    d.findElement(By.xpath("(//button[contains(@class,'form_action_button  action_context btn btn-default')])[3]")).click();
	    d.findElement(By.xpath("(//button[contains(@class,'btn btn-destructive')])[2]")).click();
	    
	    Thread.sleep(2000);
	    WebElement DeletedCaller = d.findElement(By.xpath("//div[contains(@class,'list2_empty-state-list')]"));
	    String de = DeletedCaller.toString();
	    if (de.isEmpty()) {
			System.out.println("Caller is deleted");
		} else {
			System.out.println("Caller is not deleted");
		}
		
	}

}
