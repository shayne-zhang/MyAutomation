import java.util.List;

import javax.print.DocFlavor.INPUT_STREAM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import test.DataReader;
import test.Drivers;

public class Search {

	String HomePage = "https://cn.bing.com";

	WebDriver driver;

	@Test()
	public void test() throws InterruptedException {
		// import data from file
		DataReader dataReader = new DataReader();
		List<String> data = dataReader.getData("src/test/resources/Data.case");
		System.out.println(String.join(",", data));

		// get default driver and homepage
		String targetDriver = "chrome";
		new Drivers(targetDriver, HomePage);
		System.out.println(data.get(0));
		WebElement searchbox = driver.findElement(By.id("sb_form_q"));
		searchbox.sendKeys(data.get(0));
		driver.findElement(By.cssSelector("#sb_form_go")).submit();
		driver.findElement(By.xpath("//a[contains(@href, ‘images’)]")).click();
		driver.quit();
	}

}
