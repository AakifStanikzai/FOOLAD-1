package com.syntax.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

import cucumber.api.java.en.Given;

public class AddCuRepPage extends BaseClass{
	
	@FindBy(id="txtUsername")
	public WebElement userName;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[@id=\"menu_time_viewTimeModule\"]/b")
	public WebElement Time;
	
	@FindBy(xpath="//*[@id=\"menu_admin_ProjectInfo\"]")
	public WebElement ProjectInfo;
	
	@FindBy(xpath="//*//a[contains(text(), 'Customers')]")
	public WebElement Customer;
	
	@FindBy(id="btnAdd")
	public WebElement Addbutton;
	
	@FindBy(id="addCustomer_customerName")
	public WebElement Customername;
	
	@FindBy(id="addCustomer_description")
	public WebElement Description;
	
	@FindBy(id="btnSave")
	public WebElement Save1;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr")
	  public List<WebElement> verify;
	
	@FindBy(xpath="//a[@id='menu_admin_viewProjects']")
	public WebElement selestproject;
	
	@FindBy(id="searchProject_customer")
	public WebElement AddEmplayee;
	
	@FindBy(id="searchProject_project")
	public WebElement AddprojectNam;
	
	@FindBy(id="searchProject_projectAdmin")
	public WebElement AddproAdm;
	
	@FindBy(id="btnAdd")
	public WebElement Addbutt;
	
	@FindBy(id="menu_time_Reports")
	public WebElement Clickreport;
	
	@FindBy(xpath="//a[@id='menu_time_displayProjectReportCriteria']")
	public WebElement projectReport;
	
	@FindBy(id="time_project_name")
	public WebElement proName;
	
	
	@FindBy(id="viewbutton")
	public WebElement clickonviewbutton;
	

	public AddCuRepPage() {
		PageFactory.initElements(driver, this);
	}
	
	
}
