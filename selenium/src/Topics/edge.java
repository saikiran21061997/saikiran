package Topics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class edge {

	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
   System.setProperty("webdriver.edge.driver", "C:\\Users\\pc\\Desktop\\msedgedriver.exe");
   WebDriver driver= new EdgeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.manage().window().maximize();
   driver.get("https://www.facebook.com/");
	  WebElement caccout= driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
	// Thread.sleep (5000);
	  caccout.click();
	 // Thread.sleep(3000);
	  WebElement firstname=driver.findElement(By.name("firstname"));
	  firstname.sendKeys("saikiran");
	  WebElement surname=driver.findElement(By.name("lastname"));
	  surname.sendKeys("Akirala");
	  WebElement email=driver.findElement(By.name("reg_email__"));
	  email.sendKeys("akiralasaikiran04@gmail.com");
	  
	  
	  
	  Thread.sleep(5000);
	  
	  
	  driver.close();
	}

}
