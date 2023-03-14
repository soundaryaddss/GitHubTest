package a2_bingTest;



import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A1_BingTest {

	@Test
	public void validateGoogle(){

		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		
		File src=((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\vcentry\\Batch255\\H1_GitTest\\screenshot\\bing.png"));
	}
}
