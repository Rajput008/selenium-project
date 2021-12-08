package maven1.maven1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class elearningautomate {
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		//get url
		driver.get("http://elearningm1.upskills.in/");
		//maximize window
		driver.manage().window().maximize();

		/*	
		//sign up
		driver.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a")).click();
		
		//register as student
		driver.findElement(By.xpath("//*[@id=\"registration_firstname\"]")).sendKeys("roy");
		driver.findElement(By.xpath("//*[@id=\"registration_lastname\"]")).sendKeys("s");
		driver.findElement(By.xpath("//*[@id=\"registration_email\"]")).sendKeys("roy@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("roy");
		driver.findElement(By.id("pass1")).sendKeys("roy123");
		driver.findElement(By.id("pass2")).sendKeys("roy123");
		driver.findElement(By.xpath("//*[@id=\"registration_phone\"]")).sendKeys("8553464226");
		driver.findElement(By.id("registration_submit")).click();
		System.out.println("Registered sucessfully"); 
		
	
		//logout
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		driver.findElement(By.id("logout_button")).click();
		System.out.println("Student logged out");		
				*/
		//login
		driver.findElement(By.id("login")).sendKeys("roy");
		driver.findElement(By.id("password")).sendKeys("roy123");
		driver.findElement(By.id("form-login_submitAuth")).click();
		System.out.println("Logged in sucessfully");
					
		//my courses
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[2]/a")).click();
		 
		//browse course
		driver.findElement(By.xpath("//*[@id=\"coursesCollapse\"]/div/ul/li[3]/a")).click();
		System.out.println("Navigating the courses"); 
		//Java script executor for scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;    
		js.executeScript("window.scrollBy(0,3000)");
			
		//navigate to page 2
		driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[4]/nav/ul/li[2]/a")).click();
			  	
	  	//subscribe to course
	 	js.executeScript("window.scrollBy(0,500)");
//		driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[3]/div[4]/div/div[2]/div[4]/div/a")).click();
		System.out.println("Course subscribed sucessfully");
	//	System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-info']")).getText());
		
		//post on social network
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
		driver.findElement(By.id("social_wall_main_social_wall_new_msg_main")).sendKeys("Hello Everyone, How's the day ?");
		driver.findElement(By.id("social_wall_main_wall_post_button")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-info']")).getText());
		System.out.println("Posted on social wall");  
		 	
	  	//check progress
	  	driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[4]/a")).click();
	  	System.out.println("Progress checked");
	  	
  		//personal agenda
	  	driver.findElement(By.xpath("//*[@title='Personal agenda']")).click();
	  	driver.findElement(By.xpath("//*[@data-date='2021-12-09']")).click();
	  	driver.findElement(By.id("title")).sendKeys("Meeting");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[11]/div/button/span")).click();
		System.out.println("Agenda has been set");		

		//check certificates
		
		//drop down
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[4]/a")).click();		
		System.out.println("Checking certificates");
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-warning']")).getText());

			
		//social network
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
		
		//find friends
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[5]/a")).click();
		//search
		driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
		driver.findElement(By.id("q")).sendKeys("rosy");
		driver.findElement(By.id("search_user_submit")).click();
		
		//send invitation
		driver.findElement(By.xpath("//*[@class='btn btn-default btn-sm btn-to-send-invitation']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content_invitation_id\"]")).sendKeys("Hi, accept my invitation");
		driver.findElement(By.id("btn-send-invitation")).click();
		System.out.println("Invitation sent sucessfully");
		
	//	driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Thread.sleep(1000);		
		//change password
		driver.findElement(By.xpath("//*[@class='btn btn-default btn-sm btn-block']")).click();
		//scroll  
	    js.executeScript("window.scrollBy(0,700)");
		
	    driver.findElement(By.id("profile_password0")).sendKeys("roy123");
		driver.findElement(By.id("password1")).sendKeys("roy123");	    
		driver.findElement(By.id("profile_password2")).sendKeys("roy123");
		driver.findElement(By.id("profile_apply_change")).click();		
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-info']")).getText());
		System.out.println("Password changed sucessfully");
		
		//social network - messaging (inbox)
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/div[1]/a[1]/img")).click();
		
//		driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("rosy");
		Thread.sleep(1000);
		List<WebElement> listOfElements=driver.findElements(By.xpath("//*[@id=\"select2-compose_message_users-results\"]/li"));
		for (WebElement webElement : listOfElements) {
		if(webElement.getText().trim().equals("rosy m (rosy)")){
		webElement.click();
		break;
			}
		}
		driver.findElement(By.id("compose_message_title")).sendKeys("Meeting");
		driver.findElement(By.id("file-descrtiption")).sendKeys("Hi, there is a meeting tommarow at 11 am. Make yourself available at that time");
		driver.findElement(By.id("compose_message_compose")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div[1]")).getText());
		
		//logout
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		driver.findElement(By.id("logout_button")).click();
		System.out.println("Student logged out");
	    	
		//login with incorrect password
		driver.findElement(By.id("login")).sendKeys("roy");
		driver.findElement(By.id("password")).sendKeys("roy1234");
		driver.findElement(By.id("form-login_submitAuth")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-danger']")).getText());

		//lost password
		driver.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[2]/a")).click();
		driver.findElement(By.id("lost_password_user")).sendKeys("roy@gmail.com");
		driver.findElement(By.id("lost_password_submit")).click();
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-info']")).getText());
		
		driver.close();
	}
}
