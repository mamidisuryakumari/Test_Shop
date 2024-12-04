package Practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	WebDriver driver;

	public static void main(String args[]) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.softwaretestingonline.com");
		ScreenShot screenShot = new ScreenShot();

	screenShot.screenshot(driver, "screenshot");
	}

	public void screenshot(WebDriver driver,String screenshot) throws IOException {
		String destination="./screenshots/"+screenshot+".png";
		File Sourse=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Sourse, new File(destination));
	}
}
