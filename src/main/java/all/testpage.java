package all;


import static org.testng.Assert.assertEquals;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class testpage {
	WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String joburl="https://omayo.blogspot.com/";
		driver.get(joburl);
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		Assert.assertEquals(URL, joburl);
		WebElement a=driver.findElement(By.xpath("//select[@id=\"drop1\"]"));
		Select s=new Select(a);
		s.selectByValue("ghi");
		WebElement abled= driver.findElement(By.xpath("//button[text()='Button2']"));
		if(abled.isEnabled()) {
			System.out.println("button is Enabled");
		}
		//handlE ALERT
		try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert text: " + alert.getText());
            alert.accept();  // or alert.dismiss();
        } catch (Exception e) {
            System.out.println("No alert present.");
        }
		
		//handle scroll
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement frame2=driver.findElement(By.xpath("//iframe[@id='iframe2']"));
		
		js.executeScript("arguments[0].scrollIntoView(true);",frame2 );
		System.out.println("scrolled to frame");
		
		//keyboard action
		Actions action=new Actions(driver);
		WebElement dbtn=driver.findElement(By.xpath("//button[@ondblclick='dblclickAlert()']"));
		js.executeScript("arguments[0].scrollIntoView(true);",dbtn );
		action.doubleClick(dbtn).perform();
		try {
            Alert alert = driver.switchTo().alert();
            System.out.println("Alert text: " + alert.getText());
            alert.accept();  // or alert.dismiss();
        } catch (Exception e) {
            System.out.println("No alert present.");
        }  
		action.sendKeys(Keys.ARROW_UP).perform();
		driver.quit();
	}

}
