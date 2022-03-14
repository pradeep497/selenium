package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chrome\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// Sibling - Child to parent traverse

		//header/div/button[1]/following-sibling::button[1]

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println("git demo");
		System.out.println("changes");
		System.out.println("gitdemo");
		System.out.println("git demo1");
		System.out.println("changes2");
		System.out.println("gitdemo3");


		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		//assert.assertEquals(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]"), false);



	}

}
