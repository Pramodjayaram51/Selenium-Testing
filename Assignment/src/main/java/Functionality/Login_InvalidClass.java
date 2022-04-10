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

public class Login_InvalidClass {
	@Test
	public void Reg_Valid() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
	
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fhomepage.html%3F_encoding%3DUTF8%26ref_%3Dnavm_em_signin%26action%3Dsign-out%26path%3D%252Fgp%252Fhomepage.html%253F_encoding%253DUTF8%2526ref_%253Dnavm_em_signin%26signIn%3D1%26useRedirectOnSuccess%3D1%26ref_%3Dnav_em_signout_0_1_1_32&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			PageFactory.initElements(driver,Elements.class);
			
			Elements.Phone.sendKeys("9740299517");
			Elements.ContinueBtn.click();
			Elements.password.sendKeys("Welcome");
			Elements.SignInBtn.click();
			Thread.sleep(5000);
			//Takes Screenshot
			File screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			//Cpy the file to location and use try catch block to handle exception
			try {
				FileUtils.copyFile(screenshot, new File("C:\\Users\\ADMIN\\eclipse-workspace\\pramod_selenium\\Assignment\\Screenshots\\Login_InValid.png"));
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
			  driver.close();
	}
}
