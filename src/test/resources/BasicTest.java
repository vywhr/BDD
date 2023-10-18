import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicTest {

	public static void main(String[] args) {
		
		
	 //WebDriverManager.chromedriver().setup();
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\shind\\eclipse-workspace\\BehaviourDrivenD.Cucumber\\Driver\\chromedriver.exe")
		
		WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://demo.nopcommerce.com/");
	 System.out.println(driver.getTitle());

	}

}
