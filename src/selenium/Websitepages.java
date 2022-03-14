package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Websitepages {

	public static void main(String[] args) throws InterruptedException {
		System.out.print("hi");
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chrome\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

driver.get("https://facebook.com");
driver.manage().window().maximize();
//driver.findElement(By.id("email")).sendKeys("pradeepdeepu497@gmail.com");
//driver.findElement(By.id("pass")).sendKeys("Pradeep@50");
//for css = tagname.id or tagname.classname 
driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("pradeepdeepu497@gmail.com");
//driver.findElement(By.cssSelector(id.email).sendKeys("pradeepdeepu497@gmail.com");
driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("Pradeep@50");


//driver.findElement(By.name("login")).click();
//Thread.sleep(5000);
//driver.quit();
//driver.close();
	}

}
