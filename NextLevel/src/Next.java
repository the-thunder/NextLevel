
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Next {

	public static void main(String[] args) throws InterruptedException {
		
		//Open the browser and maximize it
		System.setProperty("webdriver.chrome.driver", "E:\\DRIVE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//open the website and wait for it
		driver.get("http://104.131.87.172:800/#/");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Test navbar links
		int count = driver.findElements(By.xpath("//li[@class='nav-item']")).size();
		for (int i=count-1 ; i>=0 ; i--)
		{
			driver.findElements(By.xpath("//li[@class='nav-item']")).get(i).click();
			Thread.sleep(1000);
		}
		
		
		//Elements config
		WebElement element = driver.findElement(By.xpath("//body"));
		WebElement element2 = driver.findElement(By.xpath("//body"));
		Actions actions = new Actions(driver);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		
		
		//Test change language
		element = driver.findElement(By.xpath("//a[@class='nav-link _iteam _iteamLang']"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		for (int i=count-1 ; i>=0 ; i--)
		{
			driver.findElements(By.xpath("//li[@class='nav-item']")).get(i).click();
			Thread.sleep(1000);
		}
		
		element = driver.findElement(By.xpath("//a[@class='nav-link _iteam _iteamLang']"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		

		
		//Test About us
		element = driver.findElement(By.xpath("//div[@class='col-lg-6 secondDiv']/div[2]/button"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		
		element2 = driver.findElement(By.xpath("//app-aboutus/div/div/div/div[4]"));
		je.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(2000);
		
		element2 = driver.findElement(By.xpath("//app-aboutus/div/div/div/div[7]"));
		je.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(2000);
		
		element =driver.findElement(By.xpath("//body/app-root/div/app-aboutus/app-nav-bar/div/div/nav/img[1]"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);

		
		//Test all services 
		driver.findElement(By.xpath("//div[@id='navbarNav']/ul/li[2]")).click();
		Thread.sleep(1000);
		
		element = driver.findElement(By.xpath("//div[@id='f2']/app-services/div/div/div/div[3]/div[1]/div/div[2]/div[2]/span"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		element2 = driver.findElement(By.xpath("//h1[@class='serviceName']"));
		je.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(2000);
		
		element =driver.findElement(By.xpath("//body/app-root/div/app-services-profile/app-nav-bar/div/div/nav/img[1]"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='navbarNav']/ul/li[2]")).click();
		Thread.sleep(1000);
		
		element = driver.findElement(By.xpath("//div[@id='f2']/app-services/div/div/div/div[4]/button"));
		actions.moveToElement(element).click().perform();
		element2 = driver.findElement(By.xpath("//div[@class='col-lg-8']/div[1]"));
		je.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//nav[@aria-label='Page navigation example']/ul/li[3]"));
		actions.moveToElement(element).click().perform();
		element2 = driver.findElement(By.xpath("//div[@class='col-lg-8']/div[1]"));
		je.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(2000);
		
		
		element =driver.findElement(By.xpath("//body/app-root/div/app-services-all/app-nav-bar/div/div/nav/img[1]"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		
		
		//Test all products 
		driver.findElement(By.xpath("//div[@id='navbarNav']/ul/li[3]")).click();
		Thread.sleep(2000);
		
		element = driver.findElement(By.xpath("//div[@id='f3']/app-proudect/div/div/div/div[3]/div[1]/div/div[2]/div[2]/span"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		element2 = driver.findElement(By.xpath("//h1[@class='serviceName']"));
		je.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(2000);
		
		element =driver.findElement(By.xpath("//body/app-root/div/app-prodect-profile/app-nav-bar/div/div/nav/img[1]"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='navbarNav']/ul/li[3]")).click();
		Thread.sleep(2000);
		
		element = driver.findElement(By.xpath("//div[@id='f3']/app-proudect/div/div/div/div[4]/button"));
		actions.moveToElement(element).click().perform();
		element2 = driver.findElement(By.xpath("//div[@class='col-lg-8']/div[1]"));
		je.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(2000);
		//element = driver.findElement(By.xpath("//nav[@aria-label='Page navigation example']/ul/li[3]"));
		//actions.moveToElement(element).click().perform();
		//element2 = driver.findElement(By.xpath("//div[@class='col-lg-8']/div[1]"));
		//je.executeScript("arguments[0].scrollIntoView(true);",element2);
		//Thread.sleep(2000);
		element =driver.findElement(By.xpath("//body/app-root/div/app-proudects-all/app-nav-bar/div/div/nav/img[1]"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		
		
		//Test clients scroll
		driver.findElement(By.xpath("//div[@id='navbarNav']/ul/li[5]")).click();
		Thread.sleep(1000);
		//Next
		element = driver.findElement(By.xpath("//a[@class='carousel-control-next']/span[1]"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		//previous
		element =driver.findElement(By.xpath("//a[@class='carousel-control-prev']/span[1]"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(1000);
		
		
		//Go to footer
		element =driver.findElement(By.xpath("//div[@class='lastBlack']"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);
		
		//Test contact us 
		element =driver.findElement(By.xpath("//div[@id='navbarNav']/span[2]/button"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		element2 = driver.findElement(By.xpath("//div[@class='row servicesTag']"));
		je.executeScript("arguments[0].scrollIntoView(true);",element2);
		Thread.sleep(1000);
		element =driver.findElement(By.id("name"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		element =driver.findElement(By.id("email"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		element =driver.findElement(By.id("title"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		element =driver.findElement(By.id("message"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		element =driver.findElement(By.xpath("//button[@type='submit']"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		/////////////////////////////////////////////////////////////////////////////////
		element =driver.findElement(By.id("name"));
		actions.moveToElement(element).click().sendKeys("mostafa").perform();
		Thread.sleep(2000);
		element =driver.findElement(By.id("email"));
		actions.moveToElement(element).click().sendKeys("mostafa@gmail.com").perform();
		Thread.sleep(2000);
		element =driver.findElement(By.id("title"));
		actions.moveToElement(element).click().sendKeys("mostafa rep").perform();
		Thread.sleep(2000);
		element =driver.findElement(By.id("message"));
		actions.moveToElement(element).click().sendKeys("mostafa rep").perform();
		Thread.sleep(2000);
		element =driver.findElement(By.xpath("//button[@type='submit']"));
		actions.moveToElement(element).click().perform();
		Thread.sleep(2000);
		
		//contact us from footer
		//element =driver.findElement(By.xpath("//body/app-root/div/app-land-page/app-footer/div/div/div/div[2]/div/div[1]"));
		//actions.moveToElement(element).click().perform();
		//Thread.sleep(1000);
	}

}
