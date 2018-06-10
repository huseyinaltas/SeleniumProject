package test;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/huseyinaltas/Documents/selenium dependencies/drivers/chromedriver" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://cybertek-bnb.herokuapp.com/");
		String title = driver.getTitle();
		System.out.println("Title:" +title);
		String url= driver.getCurrentUrl();
		System.out.println("Url: "+ url);
		
		
		
		if (title.equals("Intro | cybertek-bnb")) {
			System.out.println("Title verification passed");
			
		}
		
		else {
			System.out.println("Title verification failed");
		}
		Random random=new Random();
		int r=random.nextInt(1000);
		String firsName="Huso";
		String lastName="Al";
		String email="alt"+r+"@hotmail.com";
		String password= "JW2018";
		
		driver.findElement(By.linkText("sign up")).click();
		
//		Thread.sleep(2000);
		
		driver.findElement(By.name("first-name")).sendKeys(firsName);
		driver.findElement(By.name("last-name")).sendKeys(lastName);
		Thread.sleep(2000);
		driver.findElement(By.name("last-name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.name("last-name")).sendKeys("GOGO");
		
		
		
		
		
		
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		
//		driver.findElement(By.className("button is-dark")).click();
		
		driver.findElement(By.xpath("//button[.='sign up']")).click();
		
		if (driver.getTitle().equals("Sing in | cybertek-bnb")) {
			System.out.println("sign up successfully");
			
		}
		else {
			System.out.println("sign up failed");
		}
		
		driver.findElement(By.name("email")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[.='sign in']")).click();
		
		String loggedInTitle = driver.getTitle();
		if(loggedInTitle.equals("Map | cybertek-bnb")) {
			System.out.println("User signed - in successfully");
		}
		else {
			System.out.println("user signed - in failed");
		}
	}

}
