package Functionality;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Object_repo.Elements;

public class Reg_InvalidClass {
	@Test
	public void Reg_InValid() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
	
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&prevRID=WHY7B8WF7JH09XP3WYA7&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			PageFactory.initElements(driver,Elements.class);
			
			Elements.Name.sendKeys("Pramod");
			Elements.Phone.sendKeys("9740299517");
			Elements.password.sendKeys("12345ABC@0");
			Elements.Cpassword.sendKeys("ABCDEF");
			Elements.ContinueBtn.click();
			Thread.sleep(10000);
			//Takes Screenshot
			File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Cpy the file to location and use try catch block to handle exception
			try {
				FileUtils.copyFile(screenshot, new File("C:\\Users\\ADMIN\\eclipse-workspace\\pramod_selenium\\Assignment\\Screenshots\\Reg_InValid.png"));
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			  driver.close();
	}
}
