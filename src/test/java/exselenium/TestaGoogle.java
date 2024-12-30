package exselenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaGoogle {
	
	protected WebDriver driver;
	
	@BeforeAll
	public static void configuraDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Everson\\Documents\\GitHub\\exerc-cio-selenium-sonzr\\chromedriver.exe");
	}
	
    @BeforeEach
    public void createDriver() {  
    
		driver = new ChromeDriver();
        driver.get("https://www.google.com.br");
    }	
    
    @Test
    public void test() {
		fail("Not yet implemented");
	}
	
    @AfterEach
    public void quitDriver() {
    	driver.quit();
    }
}
