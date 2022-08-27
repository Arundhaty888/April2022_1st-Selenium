package launchbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
	
	public static void main(String[] args) {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\apr22-selenium\\1st selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

}
