package googleTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleTest {

	public static void main(String[] args) throws IOException{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\pravee\\Chromedriver\\Chromedriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Parithi\\workspace\\SeleniumGitHubConceptOct13\\Screenshot\\gittest.jpg"));
		
	}

}
