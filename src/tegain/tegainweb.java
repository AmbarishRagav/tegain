package tegain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tegainweb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ambar\\Desktop\\FILES\\SOFTWARES\\AUTOMATION\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize(); 
        driver.get("https://tegain.com/");
        Thread.sleep(3000);
        
        WebElement workwithus = driver.findElement(By.xpath("//a[contains (text(),\"Work With us\") ]"));
        workwithus.click();
        Thread.sleep(2000);
        
        WebElement username = driver.findElement(By.xpath("//input[@name='name']"));
        username.click();
        Thread.sleep(2000);
        username.sendKeys("Testing");
        
        WebElement designation = driver.findElement(By.xpath("//select[@name='designation']"));
        designation.click();
        Thread.sleep(2000);
        
        WebElement devoptions = driver.findElement(By.xpath("//option[@value='Website Developers']"));
        devoptions.click();
        Thread.sleep(2000);
        
        WebElement useremail = driver.findElement(By.xpath("//input[@name='email']"));
        useremail.click();
        Thread.sleep(2000);
        useremail.sendKeys("tesing@gmail.com");
        
        WebElement number = driver.findElement(By.xpath("//input[@name='phone' and @xpath='1'] "));
        number.click();
        Thread.sleep(2000);
        number.sendKeys("8568758954");
        
        WebElement experience= driver.findElement(By.xpath("//select[@name='work_experience']"));
        experience.click();
        Thread.sleep(2000);
        
        WebElement experienceoption= driver.findElement(By.xpath("//option[@value='1']"));
        experienceoption.click();
        Thread.sleep(2000);
        
        WebElement place= driver.findElement(By.xpath("//input[@name='place']"));
        place.click();
        Thread.sleep(2000);
        place.sendKeys("Kochin");
        
        WebElement text= driver.findElement(By.xpath("//textarea[@name='why_suitable']"));
        text.click();
        Thread.sleep(2000);
        text.sendKeys("Software is a set of instructions, data or programs that you can use to operate a computer and perform the particular tasks that they are looking for. The software actually is the opposite of hardware. In software, there is a set of data, programs, and information that you need inside your computer in order to operate your computer efficiently and perform the specific tasks that you are looking for.");
        
        WebElement upload= driver.findElement(By.xpath("//span[@class='browse-button']"));
        upload.click();
        Thread.sleep(2000);
        
        WebElement Apply= driver.findElement(By.xpath("//button[@class='form-apply']"));
        Apply.click();
        Thread.sleep(2000);
	}

}
