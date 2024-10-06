package Base;

import java.awt.Window;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Base {

	@BeforeTest
	public void beforetest() {
		System.setProperty("webdriver.chrome.driver",
				"E:\\selenium\\BitHubTech\\Resources\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		driver.get("https://omayo.blogspot.com/");
		
		}
	public void seldropdown(String name,WebElement element) {
		Select s=new Select(element);
		s.selectByVisibleText(name);
		
	}
}
