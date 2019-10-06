package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class MyHomePage extends SeleniumBase {
	
	

		
	
	public MyLead clickLead() {
		click(locateElement("link","Leads"));
		return new MyLead();
	}
	
	
		
			
		
	
	

}



