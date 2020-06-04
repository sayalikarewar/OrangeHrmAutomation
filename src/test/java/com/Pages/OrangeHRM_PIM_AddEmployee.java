package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SeleniumReusableFunctions.SeleniumUtility;
/**
 * 
 * @author Sayali Karewar
 * 
 *
 */

public class OrangeHRM_PIM_AddEmployee<Create> {
	 WebDriver driver;
	    SeleniumUtility selut = new SeleniumUtility();
	    
	    public OrangeHRM_PIM_AddEmployee(WebDriver driver)
	    {
	    	PageFactory.initElements(driver,this);
	    }
	     @FindBy(id = "menu_pim_viewPimModule")
	     WebElement PIMclick;
	     
	     @FindBy(id = "menu_pim_addEmployee")
	     WebElement PIM_AddEmployee;
	     
	     
	     @FindBy(id = "firstName")
	     WebElement PIM_AddEmployee_firstName;

	     @FindBy(id = "middleName")
	     WebElement PIM_AddEmployee_middleName;
	     
	     @FindBy(id = "lastName")
	     WebElement PIM_AddEmployee_lastName;
	     
	     @FindBy (id = "employeeId")
	     WebElement PIM_AddEmployee_employeeId;
	     
	     @FindBy (id = "photofile")
	     WebElement PIM_AddEmployee_Photograph;
	     
	     @FindBy (id ="chkLogin")
	     WebElement PIM_AddEmployee_CreateLoginDetails;
	     
	     @FindBy (id = "btnSave")
	    WebElement PIM_AddEmployee_save;
	     
	     // Click on PIM
	     public void PIM_Click() {
	    	 PIMclick.click();
	    	 
	    	  }
	     // Click on AddEmployee
	     public void PIM_AddEmployee() {
	    	 PIM_AddEmployee.click();
	    	 
	     }
	     //Enter the First Name
	     public void PIM_AddEmployee_firstName(String fname) {
	    	 PIM_AddEmployee_firstName.sendKeys();
	     }
	     //Enter the Middle Name
	    	 public void PIM_AddEmployee_middleName(String mname) {
	    		 PIM_AddEmployee_middleName.sendKeys();
	    	 }
	    	 //Enter the Last Name
	    	 public void PIM_AddEmployee_lastName(String lname) {
	    		 PIM_AddEmployee_lastName.sendKeys();
	    		 
	    	 }
	    	 //For Entering the Employee ID
	    	 public void PIM_AddEmployee_employeeId(CharSequence id) {
	    		 PIM_AddEmployee_employeeId.sendKeys();
	    	 }
	    	 //Selection of photograph
	    	 public void PIM_AddEmployee_Photograph() {
	    		 PIM_AddEmployee_Photograph.click();
	    	 }
	    	 // for the Click on the Checkbox
	    	 public void PIM_AddEmployee_CreateLoginDetails() {
	    		 PIM_AddEmployee_CreateLoginDetails.isSelected();
	    	 }
	    	 //for the Save Button
	    	 public void PIM_AddEmployee_save() {
	    		 PIM_AddEmployee_save.click();
	    	 }
	     }
	     

