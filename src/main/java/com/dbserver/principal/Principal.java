package com.dbserver.principal;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Principal {
	private WebDriver driver;
	public WebDriverWait espera;

	@Before
	public void setUp() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		this.driver = new FirefoxDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		this.driver.get("http://www.automationpractice.com");
		this.espera = new WebDriverWait(driver, 8);
	}

	@Test
	public void testMain() throws InterruptedException {
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	//treinando o git diff
	
}
