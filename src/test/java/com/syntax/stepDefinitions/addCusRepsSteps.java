package com.syntax.stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.pages.AddCuRepPage;
import com.syntax.utils.CommonMethods;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class addCusRepsSteps {

	AddCuRepPage obj;

	@Given("^I logged into OrangeHRM with \"([^\"]*)\" and \"([^\"]*)\" and click login$")
	public void i_logged_into_OrangeHRM_with_and_and_click_login(String userName, String pass) throws Throwable {
		obj = new AddCuRepPage();
		CommonMethods.enterValue(obj.userName, userName);
		CommonMethods.enterValue(obj.password, pass);
		CommonMethods.click(obj.loginButton);
	}

	@Given("^I am on Time Module$")
	public void i_am_on_Time_Module() throws Throwable {
		CommonMethods.click(obj.Time);
	}

	@When("^I click Project info$")
	public void i_click_Project_info() throws Throwable {
		CommonMethods.click(obj.ProjectInfo);
	}

	@When("^I select Customers$")
	public void i_select_Customers() throws InterruptedException {
		CommonMethods.click(obj.Customer);
		Thread.sleep(3000);
	}

	@When("^I click on Add button$")
	public void i_click_on_Add_button() {
		CommonMethods.click(obj.Addbutton);
	}

	@When("^Customer Name \"([^\"]*)\" and Description \"([^\"]*)\"$")
	public void customer_Name_and_Description(String Name, String Description) {
		CommonMethods.enterValue(obj.Customername, Name);
		CommonMethods.enterValue(obj.Customername, Description);

	}

	@When("^I click Save$")
	public void i_click_Save() throws Throwable {
		CommonMethods.click(obj.Save1);
		Thread.sleep(3000);
	}

	@Then("^I see that the customer is displayed in the Customers table$")
	public void i_see_that_the_customer_is_displayed_in_the_Customers_table() throws Throwable {
		List<WebElement> rows = obj.verify;
		for (int i = 0; i < rows.size(); i++) {
			rows.get(i).getText();
			if (rows.contains("Mama")) {
				System.out.println("username was added successfully");
			}
		}
	}

	@Given("^I select Projects$")
	public void i_select_Projects() throws Throwable {
		CommonMethods.click(obj.ProjectInfo);
		CommonMethods.click(obj.selestproject);
	}

	@Given("^AddEmplayeeName \"([^\"]*)\"$")
	public void addemplayeename(String Emp) throws Throwable {
		CommonMethods.enterValue(obj.AddEmplayee, Emp);

	}

	@Given("^AddprojectName \"([^\"]*)\"$")
	public void addprojectname(String pronam) throws Throwable {
		CommonMethods.enterValue(obj.AddprojectNam, pronam);

	}

	@Given("^AddprojectAdminName \"([^\"]*)\"$")
	public void addprojectadminname(String Addpro) throws Throwable {
		CommonMethods.enterValue(obj.AddproAdm, Addpro);

	}

	@Then("^click Addbutton$")
	public void click_Addbutton() throws Throwable {
	}

	@When("^I click Report$")
	public void i_click_Report() throws Throwable {
		CommonMethods.click(obj.Clickreport);

	}
	@When("^I click on Project Report$")
	public void i_click_on_Project_Report() throws Throwable {
		CommonMethods.click(obj.projectReport);
		
	   
	}
	@When("^AddEmplayees Name \"([^\"]*)\"$")
	public void addemplayees_Name(String John) throws Throwable {
	 // CommonMethods.click(obj.proName);
	  CommonMethods.selectValue(obj.proName, John);
	 
	}
	@When("^click on View$")
	public void click_on_View() throws Throwable {
	  CommonMethods.click(obj.clickonviewbutton);
	  
	}

	

}
