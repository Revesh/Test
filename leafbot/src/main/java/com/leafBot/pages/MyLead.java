package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;


public class MyLead extends SeleniumBase {

	
	
public CreateLead  clickCreateLead () {
		
	
	click(locateElement("link","Create Lead"));
	return new CreateLead();
		
		
		
	
	
}
	
}
