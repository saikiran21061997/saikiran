package Topics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\pc\\Desktop\\msedgedriver.exe");
		   WebDriver driver= new EdgeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.amazon.in/");
		   //convert list into select
		   Select drop = new Select(driver.findElement(By.id("searchDropdownBox")));
		   drop.selectByIndex(7);
		   
	}

}   
