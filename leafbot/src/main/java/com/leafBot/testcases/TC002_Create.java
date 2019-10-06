package com.leafBot.testcases;






import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;


public class TC002_Create extends ProjectSpecificMethods {


	
	
	@BeforeTest
	public void setData() {
		excelFileName="createone";
		testcaseName="Create Lead";
		testcaseDec = "Create";
		author="Balaji";
		category="smoke";

	}
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String pass, String Cname , String Fname, String Lname) {
		new LoginPage()
		.enterUsername(userName)
		.enterPassword(pass)
		.clickLogin()
		.clickCRM()
		.clickLead()
		.clickCreateLead()
		.enterCompanyName(Cname)
		.enterFirstName(Fname)
		.enterLastName(Lname)
		.clickSubmit()
		.VerifyFirstName();
		
		
		
		
	
}}
