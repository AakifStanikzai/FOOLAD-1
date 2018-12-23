#Author: Omid@gmail.com
Feature: 

  Background: 
    Given I logged into OrangeHRM with "Admin" and "admin123" and click login
    And I am on Time Module

  Scenario: 
    When I click Project info
    And I select Customers
    And I click on Add button
    And Customer Name "Mama" and Description "Mewr"
    And I click Save
    Then I see that the customer is displayed in the Customers table

  Scenario: 
    And I select Projects
    And AddEmplayeeName "Make"
    And AddprojectName "asd-Jonh smith"
    And AddprojectAdminName "John Smith"
    Then click Addbutton

@tag
  Scenario: 
    When I click Report
    And I click on Project Report
    And AddEmplayees Name "Omid - sss"
    
    And click on View
