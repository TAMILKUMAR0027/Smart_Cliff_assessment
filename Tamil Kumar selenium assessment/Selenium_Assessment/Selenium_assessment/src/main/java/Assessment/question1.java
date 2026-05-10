package Assessment;

import java.rmi.server.ExportException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class question1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		//question 1 done by me
		d.get("https://demoblaze.com/");
		WebDriverWait wait=new WebDriverWait(d,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Log in']"))).click();
		WebElement username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='loginusername']")));
		username.sendKeys("TamilKumar");
		WebElement password=d.findElement(By.xpath("//input[@id='loginpassword']"));
		password.sendKeys("Kiot1234");
		d.findElement(By.xpath("//button[text()='Log in']")).click();
		
		String actual ="Welcome TamilKumar";
		String expected=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Welcome TamilKumar']"))).getText();
		if(actual.equals(expected))
			System.out.println("Login Sucessfull");
		//question 2 in this question only i not inlude the perform 
		Actions act = new Actions(d);
		 JavascriptExecutor js = (JavascriptExecutor) d;
	        js.executeScript("window.scrollBy(0,500)");
        WebElement lap = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Laptops']")));
        act.moveToElement(lap).click().perform();
        
        WebElement scroll = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='MacBook Pro']")));
        act.moveToElement(scroll).perform();
        List<WebElement> all = d.findElements(By.xpath("//a[@class='hrefch']"));
        List<String>laps=new ArrayList<String>();
        for(WebElement e:all)
        	laps.add(e.getText());
        laps.sort(null);
        System.out.println(laps);
        WebElement mac = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("MacBook Pro")));
        js.executeScript("arguments[0].scrollIntoView(true);", mac);
        //question 3 in question see what need to be done
        mac.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Add to cart"))).click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = d.switchTo().alert();
        alert.accept();
        System.out.println("Product added to cart");
        System.out.println("Alert handled successfully.");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("cartur"))).click();
        String productName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[2]"))).getText();
        String price = d.findElement(By.xpath("//td[3]")).getText();
        String already="1100";
        System.out.println(productName + " added to cart.");
        if(price.equals(already))
        System.out.println("price is verified");
        //question 4 in question used ai
        d.findElement(By.xpath("//button[text()='Place Order']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name"))).sendKeys("Tamil");
        d.findElement(By.id("country")).sendKeys("India");
        d.findElement(By.id("city")).sendKeys("Salem");
        d.findElement(By.id("card")).sendKeys("123456789");
        d.findElement(By.id("month")).sendKeys("04");
        d.findElement(By.id("year")).sendKeys("2026");
        d.findElement(By.xpath("//button[text()='Purchase']")).click();
        String purchase = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'sweet-alert')]"))).getText();
        if (purchase.contains("Order Id")) {
            System.out.println("Purchase done Successfully");
        } else {
            System.out.println("Order is Unsuccessful");
        }
        System.out.println("Alert is done successfully");
		d.quit();
				
		
		
	}

}
