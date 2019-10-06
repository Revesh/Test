	package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.selenium.api.base.SeleniumBase;

public class ViewLeadPage extends SeleniumBase {

	
	public CreateLead  VerifyFirstName () {
		
		
		
			
		 getElementText((locateElement("id", "viewLead_firstName_sp")));
		 return new CreateLead();
		
		
		
	}

	
	
	
}
