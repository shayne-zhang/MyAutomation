package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {

	// String HomePage = "https://www.baidu.com";
	
	public Drivers(String targetDriver, String HomePage) {
		if (targetDriver.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(setChromeOptions());
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(HomePage);
			driver.manage().window().maximize();
		} else if (targetDriver.equals("gecko")) {
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(HomePage);
			driver.manage().window().maximize();
		}
	}

	public static ChromeOptions setChromeOptions() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-web-security");
		return options;
	}

}