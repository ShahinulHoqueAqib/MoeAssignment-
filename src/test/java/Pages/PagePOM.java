package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class PagePOM extends PageObject {
	
	public void verifyTitle() {
		String title = getDriver().getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("Amazon.com."));
	}
	
	public void clickSignUpButton() {
		$(By.id("nav-link-accountList")).click();
		
	}
	
	public void enterEmailAddress() {
		$(By.name("email")).sendKeys("tteesstt112233@gmail.com");
		
	}
	
	public void continueWithEmail() {
		$(By.id("continue")).click();
	
	}

	public void errorMessage() {
		WebElement errorIcon = $(By.xpath("//*[@id=\"auth-error-message-box\"]/div/i"));
		Assert.assertEquals(true, errorIcon.isDisplayed());
	}
}
