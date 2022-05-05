package Pages;

import net.thucydides.core.annotations.Step;

public class Page {
	
	PagePOM objOfHomePage;

	@Step
	public void goToAmazonWebsite() {
		objOfHomePage.open();
	}
	
	@Step
	public void clickOnSignUpButton() {
		objOfHomePage.clickSignUpButton();
	}
	
	@Step
	public void enterWrongEmailAddress() {
		objOfHomePage.enterEmailAddress();
	}
	
	@Step
	public void continueWithEmail() {
		objOfHomePage.continueWithEmail();
	}
	
	@Step
	public void errorMessage() {
		objOfHomePage.errorMessage();
	}
}
