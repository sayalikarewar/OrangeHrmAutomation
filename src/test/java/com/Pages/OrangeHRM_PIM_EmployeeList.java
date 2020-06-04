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
 */

public class OrangeHRM_PIM_EmployeeList {
    WebDriver driver;
    SeleniumUtility selut = new SeleniumUtility();
    
    public OrangeHRM_PIM_EmployeeList(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
     @FindBy(id = "menu_pim_viewPimModule")
     WebElement PIMclick;
     
     @FindBy(id = "menu_pim_viewEmployeeList")
     WebElement PIM_EmployeeList;
     
     @FindBy(id = "empsearch_employee_name_empName")
     WebElement PIM_EmployeeList_EmployeeName;
     
     @FindBy(id = "empsearch_id")
     WebElement PIM_EmployeeList_Id;
     
     @FindBy(id = "empsearch_employee_status")
     WebElement PIM_EmployeeList_EmployeeStatus;
     
     @FindBy(id = "empsearch_termination")
     WebElement PIM_EmployeeList_include;
     
     @FindBy(id = "empsearch_supervisor_name")
     WebElement PIM_EmployeeList_SupervisorName;
     
     @FindBy(id = "empsearch_job_title")
     WebElement PIM_EmployeeList_JobTitle;
     
     @FindBy(id = "empsearch_sub_unit")
     WebElement PIM_EmployeeList_SubUnit;
     
     @FindBy(id = "searchBtn")
     WebElement PIM_EmployeeList_SearchButton;
     
     @FindBy(id = "resetBtn")
     WebElement PIM_EmployeeList_ResetButton;
     
     @FindBy(id = "btnAdd")
     WebElement PIM_EmployeeList_AddButton;
     
     @FindBy(id = "btnDelete")
     WebElement PIM_EmployeeList_DeleteButton;
     
     @FindBy(id = "ohrmList_chkSelectAll")
     WebElement PIM_EmployeeList_CheckBox;
     
     
     // Click on the PIM
     public void PIM_Click() {
    	 PIMclick.click();
    	 
    	 
     }
     //Click on the Employee List
     public void PIM_EmployeeList() {
    	 PIM_EmployeeList.click();
    	 
     }
     // for Entering the Employee Name
     public void PIM_EmployeeName (String Ename) {
    	 PIM_EmployeeList_EmployeeName.sendKeys(Ename);
     }
  // for Entering the Employee ID
     public void PIM_EmployeeList_Id(CharSequence id) {
    	 PIM_EmployeeList_Id.sendKeys();
     }
  // for Selecting the Employee Status
     public void PIM_EmployeeList_EmployeeStatus(String value) {
    	 selut.Dropselect(PIM_EmployeeList_EmployeeStatus, value);
     }
  // for Selecting the include
     public void PIM_EmployeeList_include(String value)
     {
    	 selut.Dropselect(PIM_EmployeeList_include, value); 
    	 
     }
  // for Entering the Supervisor Name Name
     public void PIM_EmployeeList_SupervisorName(String Sname) {
    	 PIM_EmployeeList_SupervisorName.sendKeys(Sname);
     }
     //For Selecting Job Title
     public void PIM_EmployeeList_JobTitle(String value) {
    	 selut.Dropselect(PIM_EmployeeList_JobTitle, value);
     }
  // for Selecting SubUnit
     public void PIM_EmployeeList_SubUnit(String value) {
    	 selut.Dropselect(PIM_EmployeeList_SubUnit, value);
     }
     // Click on Search Button
     public void PIM_EmployeeList_SearchButton() {
    	 PIM_EmployeeList_SearchButton .click();
    	 
     }
     // Click on the Reset Button
     public void PIM_EmployeeList_ResetButton() {
    	 PIM_EmployeeList_ResetButton.click();
     }
     //Click on the Add Button
     public void PIM_EmployeeList_AddButton() {
    	 PIM_EmployeeList_AddButton.click();
     }
     // Click on the Delete Button
     public void PIM_EmployeeList_DeleteButton() {
    	 PIM_EmployeeList_DeleteButton.click();
    	 }
     
     //To Click on the CheckBox
     public void PIM_EmployeeList_CheckBox() {
    	 PIM_EmployeeList_CheckBox.isSelected();
     }
}

