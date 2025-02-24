package org.abstracts;

import org.openqa.selenium.WebDriver;

public abstract class CommonAbstracts{
	public abstract void launch(WebDriver driver);
	public void message() {
		System.out.println("Hello");
	}
	

}
