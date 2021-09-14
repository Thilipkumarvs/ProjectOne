package org.samp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.debugger.model.Location;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Adactin {
	WebDriver driver;
	Select select;

	@BeforeClass
	private void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@Parameters({ "username" })
	@Test
	private void tc1(String s) {

		WebElement findElement = driver.findElement(By.id("username"));
		findElement.sendKeys(s);

	}

	@Parameters({ "pass" })
	@Test(priority = 1)
	private void tc2(String s) {
		WebElement findElement2 = driver.findElement(By.id("password"));
		findElement2.sendKeys(s);

	}

	@Test(priority = 2)
	private void tc3() {
		WebElement findElement = driver.findElement(By.id("login"));
		findElement.click();

	}

	@Test(priority = 3)
	private void Location() {
		WebElement findElement = driver.findElement(By.id("location"));
		// findElement.click();
		select = new Select(findElement);
		select.selectByIndex(2);

	}

	@Test(priority = 4)
	private void hotel() {

		WebElement findElement = driver.findElement(By.id("hotels"));
		select = new Select(findElement);
		select.selectByIndex(2);

	}

	@Test(priority = 5)
	private void roomtype() {

		WebElement findElement = driver.findElement(By.id("room_type"));
		select = new Select(findElement);
		select.selectByIndex(1);
	}

	@Test(priority = 6)
	private void roomnos() {

		WebElement findElement = driver.findElement(By.id("room_nos"));
		select = new Select(findElement);
		select.selectByIndex(3);
	}

	@Test(priority = 7)

	private void adultroom() {

		WebElement findElement = driver.findElement(By.id("adult_room"));
		select = new Select(findElement);
		select.selectByIndex(1);
	}

	@Test(priority = 8)
	private void childroom() {

		WebElement findElement = driver.findElement(By.id("child_room"));
		select = new Select(findElement);
		select.selectByIndex(3);
	}

	@Test(priority = 9)
	private void search() {
		driver.findElement(By.id("Submit")).click();
	}

}