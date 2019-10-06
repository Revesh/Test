package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class CreateLead  extends SeleniumBase{
    
	public CreateLead enterCompanyName(String Cname) {
		
		driver.findElementById("createLeadForm_companyName").sendKeys(Cname);
		
		clearAndType(locateElement("id", "createLeadForm_companyName"), Cname);
		return this;
		
		
	}

	
	
public CreateLead enterFirstName(String Fname) {
		

	clearAndType(locateElement("id", "createLeadForm_firstName"), Fname);
		
		return this;
		
		
	}
	
	

public CreateLead enterLastName(String Lname) {
	
	
	
	
	clearAndType(locateElement("id", "createLeadForm_lastName"), Lname);
	
	return this;
	
	
}



public ViewLeadPage clickSubmit() {
	
	click(locateElement("name","submitButton"));
	
	return new ViewLeadPage();
	
	
}



		
		
	}	


