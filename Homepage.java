package com.leaftaps.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public SalesPage verifyHomePage() {
		verifyDisplayed(locateElement(Locators.CLASS_NAME, "uiOutputText"));
		reportStep("Homepage is loaded", "pass");
		return new SalesPage();
	}
}
