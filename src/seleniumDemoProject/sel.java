package seleniumDemoProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel {

	public static void main(String[] args) throws AWTException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		Robot r = new Robot();
		WebElement e1 = driver.findElement(By.id("APjFqb"));
		e1.sendKeys("cognizant headquarters");
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
//		e1.sendKeys(Keys.ENTER);
//		driver.navigate().back();
//		WebElement e2 = driver.findElement(By.className("gb_X"));
//		e2.click();
//		WebElement e3 = driver.findElement(By.cssSelector("body > header > div > div > div > a.button.button--medium.button--mobile-before-hero-only"));
//		e3.click();
//		WebElement e4 = driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.UXFQgc > div > div > div.AcKKx > form"));
//		e4.sendKeys("casvaish2001@gmail.com");
//		e4.sendKeys(Keys.ENTER);
//		//		driver.close();
//		List<WebElement> list = driver.findElements(By.tagName("img"));
//		System.out.println(list.size());
//		String url = "C:/Users/2332901/Downloads/LNACADEMY.HTML";
//		driver.get(url);
//		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Vaish");
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Vaish@123");
//		driver.findElement(By.cssSelector("textarea[name='comments']")).sendKeys("Hello Selenium!");
//		driver.findElement(By.cssSelector("input[name='filename']")).sendKeys("C://Users/2332901/Downloads/India- Holiday Calendar-2024.pdf");
//		driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[5]/td/input[1]")).click();
//		driver.findElement(By.cssSelector("input[value='rd3']")).click();
//		WebElement sel1 = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[7]/td/select"));
//		Select s1 = new Select(sel1);
//		s1.selectByIndex(3);
//		WebElement sel2 = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[7]/td/select"));
//		Select s2 = new Select(sel2);
//		s2.selectByIndex(0);
//		
//		WebElement drop = driver.findElement(By.xpath("/html/body/div/div[3]/form/table/tbody/tr[8]/td/select"));
//		Select d = new Select(drop);
//		d.selectByIndex(5);
//		driver.findElement(By.cssSelector("input[value='submit']")).click();
		
		
		
	}

}
