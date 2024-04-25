package Topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.firefox.driver", "C:\\Users\\pc\\Desktop\\geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.manage().window().maximize();
driver.get("https://www.abhibus.com/");



	}

}
