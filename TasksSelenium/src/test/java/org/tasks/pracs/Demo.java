package org.tasks.pracs;

import org.abstracts.CommonAbstracts;
import org.interfaces.InterfaceOne;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo extends CommonAbstracts {

	public static WebDriver driver;
	@Override
	public void launch(WebDriver driver) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.launch(driver);
		demo.message();
	
	}

	

}
