package Topics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_inspect {

	public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub
   //System.setProperty("webdriver.edge.driver", "C:\\Users\\pc\\Desktop\\msedgedriver.exe");
   WebDriver driver= new ChromeDriver();
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
	  WebElement Newpassword=driver.findElement(By.name("reg_passwd__"));
	  
	  Newpassword.sendKeys("Saikiran21");
	  WebElement reemail=driver.findElement(By.name("reg_email_confirmation__"));
	  reemail.sendKeys("akiralasaikiran04@gmail.com");
	  
	  WebElement Datenumber=driver.findElement(By.name("birthday_day"));
	  //Dateofbirth.sendKeys("21");
	  //convert list into select 
	  Select datenumber= new Select(Datenumber);
	  //datenumber.selectByIndex(21);
	 // datenumber.selectByValue("25");
	  datenumber.selectByVisibleText("21"
	  		+ "");
	  
	  
	  
	  WebElement Month=driver.findElement(By.name("birthday_month"));
	 // Month.sendKeys("june");
	  Select month= new Select(Month);
	  month.selectByVisibleText("Jan");
	  
	  
	  WebElement Year=driver.findElement(By.name("birthday_year"));
	  //Year.sendKeys("1997");
	  Select year= new Select(Year);
	  year.selectByVisibleText("1997");
	  WebElement Gender=driver.findElement(By.xpath("//input[@value='2']"));
	  Gender.click();
	//  WebElement Signup=driver.findElement(By.name("websubmit"));
	  
	  
	  
	  
	  
	  
	  Thread.sleep(5000);
	  
	  
	  //driver.close();
	}

}
