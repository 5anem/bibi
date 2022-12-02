Feature: We are creating this feature file to add Orange HRM Scenarios




 @LoginWithoutParametrs @Any
  Scenario: Login to Orange HRM
    Given The user want to orangeHRM application
    When The user want to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard

 @LoginWithParametrs @Any @ForFun
  Scenario: Login with credz

    Given The user want to orangeHRM application
    When The user wants to enter username as "Admin" and the password as "admin123"
    Then The user wants to click login
    And The user should be able to navigate dashboard
    And The user id number should be 1568
    And The user id should be 1568,5

@Forfun @Any
   Scenario:
    Given The user want to orangeHRM application
    When The user wants to enter username as "Admin" and the password as "admin123"
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM
    Then The user wants to see add employe page
    Then The user wants to add user name as "TOM"
    Then The user wants to add last name as "JERRY"
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"


  #Data Tables
  @Maping
  Scenario:
    Given The user want to orangeHRM application
    When The user wants to login HRM
    |Username|Admin|
    |Password|admin123|
    Then The user wants to click login
    Then The user should be able to navigate dashboard
    Then The user wants to go to PIM
    Then The user wants to see add employe page
    Then The user wants to see add employee
    |FirstName|Tom123|
    |LastName |Jerry123|
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"

 @Mapping_TC2
  Scenario:Verify that add new employee with login credentials
    Given The user want to orangeHRM application
    When The user wants to login HRM
      |Username|Admin|
      |Password|admin123|
    Then The user wants to click login
    Then The user should be able to navigate dashboard
    Then The user wants to go to PIM
    Then The user wants to see add employe page
    Then The user wants to see add employee
      |FirstName|Tom123123|
      |LastName |Jerry123123|
 Then The user wants to add the login details
      |User Name | sanems|
      |Password  |sanem123|
      |Status    |Disable|
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"































  @confiFileScenario
  Scenario: Login
    Given The user want to go to login
    Then The user wants to click
    And The user should be able to navigate dashboard

   #Parametrization
       # String
      # Integar
     # double
    # Blooen


  #Eclipse , NetBeans ,

    #Gherkin language keyword , it is case sensetive

    #Framework    //JAVA -- Maven -->z Selenium -- Cucumber -- POM



  ## user story by PO
  ##Groom the story  DEV- QA - BA ---> 3 Amigos
  ##     -DEV will start to devop their code
  ##    - QA will create  scenarios
  # -QA will start to test / create coding





  #BDD Framework
  #Maven Project
  #Added Cucumber and Gherkin Plugins
  #Cucumber and Selenium Dependency
       #Create Scenario
  #Create Step Definations
  # Create config Propperties
  #Configuration Reader
  #Runner Class
      #Runwith
      #CucumberOptions
              #Feature
              #Glue
              #Tags

  @Candidate
Scenario:
    Given The user want to go to login
    Then The user wants to click
    Then The user wants to navigate recruitment
    Then The user wants to see candidates
    Then The user wants to add a candidate
    Then The user wants to enter first name as "sanem", last name as "korkmaz"
    Then The user wants to enter email adress as"sanemk95@gmail.com"
    Then The user wants to Consent to keep data
    Then The user wants to save
    Then The user wants to verify that the user is created








































