package org.tasks.pracs;

import org.interfaces.InterfaceOne;
import org.interfaces.InterfaceTwo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTwo implements InterfaceOne,InterfaceTwo {

	public DemoTwo(WebDriver driver) {
		this.driver=driver;
	}
	public static WebDriver driver;
	@Override
	public void launch(WebDriver driver) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	public static void main(String[] args) {
		DemoTwo demoTwo = new DemoTwo(driver);
		demoTwo.launch(driver);
		
	}
	
	


}
