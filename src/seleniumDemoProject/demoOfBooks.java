package seleniumDemoProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoOfBooks {

	public static void main(String[] args) {
		//Driver setup
		WebDriver driver = new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Actions actions = new Actions(driver);
//		WebDriver driver = new EdgeDriver();
		//Opening Open Library 
		driver.get("https://openlibrary.org/");
		//Maximizing window
		driver.manage().window().maximize();
		//Checking title
		String actualTitle = driver.getTitle();
		if(actualTitle.equals("Welcome to Open Library | Open Library"))
		{
			System.out.println("Title Check is passed!");
		}
		else
		{
			System.out.println("Title Check failed because of mismatch");
		}
		
//		//Main Page Screenshot
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				File source = ts.getScreenshotAs(OutputType.FILE);
//				File destination = new File("C:/TakesScreenshot/mainpagess.png");
//				try 
//				{
//				FileHandler.copy(source, destination);
//				}
//				catch(Exception e)
//				{
//					System.out.println(e);
//				}
////		//Clicking Sign Up button
////		driver.findElement(By.xpath("/html/body/header[1]/ul[2]/li[2]/a")).click();
////		//Entering Email field in Sign Up
////		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/form/div[1]/div[3]/input")).sendKeys("casvaishu2001@gmail.com");
////		//Entering Screen name field Sign Up
////		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/form/div[2]/div[3]/input")).sendKeys("VaishCAS");
////		//Entering Password field Sign Up
////		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/form/div[3]/div[3]/input")).sendKeys("casvaishu@7");
////		//Clicking Submit button Sign Up
////		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/form/div[5]/button")).click();
////		//Going back to Sign in 
////		driver.navigate().back();
//		//Going to Login from Sign Up
//		//driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/form/div[5]/p/a")).click();
//		
//		//Clicking Login
//		driver.findElement(By.xpath("/html/body/header[1]/ul[2]/li[1]/a")).click();
//		//Entering Email in Login 
//		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/form/div[1]/div[2]/input")).sendKeys("casvaishu2001@gmail.com");
//		//Entering Password in Login
//		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/form/div[2]/div[2]/input")).sendKeys("casvaishu@7");
//		//Checking Remember me in Login
//		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/form/div[3]/input")).click();
//		//Clicking Login button
//		driver.findElement(By.cssSelector("#register > div.formElement.bottom > button")).click();
//		//Going to Home Page after Login
//		driver.findElement(By.cssSelector("header div a")).click();
//		
//		
//		//WebElement status = driver.findElement(By.xpath("/html/body/header[2]/ul/li[2]/div/details/div/ul/li[1]/a"));
//		System.out.println("Status of Browse dropdown: "+status.isDisplayed());
			//Clicking Hamburger icon
			driver.findElement(By.xpath("//img[@class='hamburger__icon']")).click();
			//Clicking Subject
			driver.findElement(By.xpath("/html/body/header[1]/div[3]/details/div[2]/ul/li[4]/a")).click();
			//Clicking See more
			driver.findElement(By.xpath("/html/body/div[4]/div[3]/div[1]/ul[13]/li[9]/a")).click();
			//Locating Tamil books
			String text = driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[40]/span/b")).getText();
			String[] parts = text.split(" ");
			int count = Integer.parseInt(parts[0].replace(",", ""));
			if(count>1000)
			{
				System.out.println("Tamil Books are more than 1000");
			}
			else
			{
				System.out.println("Tamil Books are less than 1000");
			}
	}

}
