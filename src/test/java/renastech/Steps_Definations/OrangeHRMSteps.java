package renastech.Steps_Definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import renastech.utils.CommenUtils;
import renastech.utils.ConfigurationReader;
import renastech.utils.Driver;
import java.util.Map;





public class OrangeHRMSteps {


    @Given("The user want to orangeHRM application")
    public void the_user_want_to_orange_hrm_application() {
        System.out.println("This is login step");
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        CommenUtils.hardWait(2000);
    }


    @When("The user want to enter username and password")
    public void the_user_want_to_enter_username_and_password() {
        System.out.println("Enter your username and password");

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));

        username.sendKeys("Admin");
        password.sendKeys("admin123");

    }

    @Then("The user wants to click login")
    public void the_user_wants_to_click_login() {
        WebElement login=Driver.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
        login.click();

    }


    @Then("The user should be able to navigate dashboard")
    public void the_user_should_be_able_to_navigate_dashboard() {
        System.out.println("The user should be able to see dashboard");
        CommenUtils.hardWait(3000);
        WebElement dashboard = Driver.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a/span"));
        Assert.assertTrue(dashboard.isDisplayed());
       // Driver.getDriver().close();

    }

    @When("The user wants to enter username as {string} and the password as {string}")
    public void theUserWantsToEnterUsernameAsAndThePasswordAs(String username, String password) {

        System.out.println("This is a username: "+ username);
        System.out.println("This is a username: "+ password);

        CommenUtils.hardWait(3000);
        WebElement userName = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        WebElement passWord = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));

        userName.sendKeys(username);
        passWord.sendKeys(password);

    }

    @Then("The user id number should be {int}")
    public void the_user_id_should_be(Integer employeerID) {
    }


    @Then("The user id should be {double}")
    public void the_user_id_should_be(Double id) {
    }


    @Then("The user wants to go to PIM")
    public void the_user_wants_to_go_to_pim() {
        WebElement PIM = Driver.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
        PIM.click();
        CommenUtils.hardWait(3000);
    }

    @Then("The user wants to see add employe page")
    public void the_user_wants_to_see_add_employe_page() {
        WebElement addEmployee = Driver.getDriver().findElement(By.xpath("//button [@class='oxd-button oxd-button--medium oxd-button--secondary']"));
        addEmployee.click();
        CommenUtils.hardWait(3000);

    }

    @Then("The user wants to add user name as {string}")
    public void the_user_wants_to_add_user_name_as(String name) {
        WebElement usernamebox = Driver.getDriver().findElement(By.xpath("//input [@class='oxd-input oxd-input--active orangehrm-firstname']"));
      usernamebox.sendKeys(name);
        CommenUtils.hardWait(3000);

    }


        @Then("The user wants to add last name as {string}")
        public void the_user_wants_to_add_last_name_as (String lastname){

            WebElement lastName = Driver.getDriver().findElement(By.xpath("//input [@class='oxd-input oxd-input--active orangehrm-lastname']"));
            lastName.sendKeys(lastname);
            CommenUtils.hardWait(3000);
        }

    @Then("The user wants to save the information")
    public void the_user_wants_to_save_the_information() {

        WebElement save = Driver.getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        save.click();
        CommenUtils.hardWait(3000);
    }



    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String headerText) {
        WebElement personalDetails = Driver.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[1]/a"));

        CommenUtils.hardWait(4000);
        Assert.assertTrue(personalDetails.isDisplayed());
        CommenUtils.hardWait(3000);
        Driver.getDriver().close();
    }

    @Given("The user want to go to login")
    public void the_user_want_to_go_to_login() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        CommenUtils.hardWait(5000);

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));

        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));

    }

    @Then("The user wants to navigate recruitment")
    public void the_user_wants_to_navigate_recruitment() {

        WebElement Recruitment = Driver.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a"));
        //Recruitment.click();
        CommenUtils.clickWithWait(Recruitment);
    }

    @Then("The user wants to see candidates")
    public void the_user_wants_to_see_candidates() {
        WebElement Candidates = Driver.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
      CommenUtils.clickWithWait(Candidates);


    }

    @Then("The user wants to add a candidate")
    public void the_user_wants_to_add_a_candidate() {
        WebElement addcandidate = Driver.getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
        CommenUtils.clickWithWait(addcandidate);
    }

    @Then("The user wants to enter first name as {string}, last name as {string}")
    public void theUserWantsToEnterFirstNameAsLastNameAs(String firstName, String lastName) {
        WebElement name = Driver.getDriver().findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
        name.sendKeys(firstName);
        CommenUtils.hardWait(1000);

        WebElement lName= Driver.getDriver().findElement(By.xpath("//input[ @class='oxd-input oxd-input--active orangehrm-lastname']"));
        lName.sendKeys(lastName);
        CommenUtils.hardWait(1000);

    }

    @Then("The user wants to enter email adress as\"sanemk95@gmail.com\"")
    public void the_user_wants_to_enter_email_adress_as_sanemk95_gmail_com( String email) {
        WebElement emailBox=Driver.getDriver().findElement(By.xpath(""));
        emailBox.sendKeys(email);
        CommenUtils.hardWait(1000);
    }

    @Then("The user wants to Consent to keep data")
    public void the_user_wants_to_consent_to_keep_data() {
        WebElement consentBox=Driver.getDriver().findElement(By.xpath(""));
        CommenUtils.clickWithWait(consentBox);

    }

    @Then("The user wants to save")
    public void the_user_wants_to_save() {
      WebElement saveBox=Driver.getDriver().findElement(By.xpath(""));
      CommenUtils.clickWithWait(saveBox);
    }

    @Then("The user wants to verify that the user is created")
    public void the_user_wants_to_verify_that_the_user_is_created() {
        CommenUtils.hardWait(2000);
        WebElement expected=Driver.getDriver().findElement(By.xpath(""));
        Assert.assertTrue(expected.isDisplayed());
        Driver.getDriver().close();
    }


    @When("The user wants to login HRM")
    public void the_user_wants_to_login_hrm(Map<String, String> dataTable) {

        System.out.println("This is Username :"+dataTable.get("Username"));
        System.out.println("This is Password :"+dataTable.get("Password"));
        CommenUtils.hardWait(3000);

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        CommenUtils.hardWait(3000);

        username.sendKeys(dataTable.get("Username"));
        password.sendKeys(dataTable.get("Password"));

    }



    @Then("The user wants to see add employee")
    public void the_user_wants_to_see_add_employee(Map<String, String> dataTable) {
        System.out.println("The First Name is :"+ dataTable.get("FirstName"));
        System.out.println("The Lirst Name is :"+ dataTable.get("LastName"));

        CommenUtils.hardWait(5000);
        WebElement usernameBox = Driver.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input"));
        CommenUtils.hardWait(3000);
        usernameBox.sendKeys(dataTable.get("FirstName"));

        WebElement lastName = Driver.getDriver().findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input"));
        lastName.sendKeys(dataTable.get("LastName"));



    }


}


