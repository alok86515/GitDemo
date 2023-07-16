import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\alok\\Chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getCurrentUrl());
		
		System.out.println("First Program ");
		
		driver.close();
	}
	
	public void sAbc() {
		System.out.println("Hello1");
	}

}
