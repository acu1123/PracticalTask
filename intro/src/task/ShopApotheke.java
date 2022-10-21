package task;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopApotheke {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shop-apotheke.com/nx/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.id("loginForm-eMail")).sendKeys("anicupic@outlook.com");
		driver.findElement(By.id("loginForm-password")).sendKeys("zeleniZec!");

		var wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		var captchaCheckbox = wait.until(ExpectedConditions.elementToBeClickable((By.id("loginForm-frc-captcha"))));
		captchaCheckbox.click();

		// driver.findElement(By.id("login-submit-btn")).click();

		// driver.close();

	}

}
