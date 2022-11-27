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
        WebElement username=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        CommenUtils.hardWait(3000);

    }








    @Then("The user wants to click")
    public void the_user_wants_to_click() {
        System.out.println("Click login Button");
        WebElement login =Driver.getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        login.click();


    }


    @Then("The user should be able to navigate dashboard")
    public void the_user_should_be_able_to_navigate_dashboard() {
        CommenUtils.hardWait(2000);
        System.out.println("The user should be able to see dashboard");
        WebElement dashboard=Driver.getDriver().findElement(By.cssSelector("i[class='oxd-icon bi-clock-fill orangehrm-dashboard-widget-icon']~p"));
        Assert.assertTrue("it is not displayed" ,dashboard.isDisplayed());

       // Driver.getDriver().close();

    }





    @Then("The user id number should be {int}")
    public void the_user_id_should_be(Integer employeerID) {
        System.out.println("employer id is " +employeerID);


    }

    @Then("The user id should be {double}")
    public void the_user_id_should_be(Double id) {
        System.out.println("user id is "+ id);

    }



    @Then("The user wants to go to PIM")
    public void the_user_wants_to_go_to_pim() {
        WebElement PIM=Driver.getDriver().findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));
        PIM.click();
        CommenUtils.hardWait(3000);
    }
    @Then("The user wants to see add employe page")
    public void the_user_wants_to_see_add_employe_page() {
        WebElement addEmployee=Driver.getDriver().findElement(By.xpath("//button [@class='oxd-button oxd-button--medium oxd-button--secondary']"));
        addEmployee.click();
        CommenUtils.hardWait(3000);
    }
    @Then("The user wants to add user name as {string}")
    public void the_user_wants_to_add_user_name_as(String name) {
        WebElement addusername=Driver.getDriver().findElement(By.xpath("//input [@class='oxd-input oxd-input--active orangehrm-firstname']"));
        addusername.sendKeys(name);
        CommenUtils.hardWait(3000);

    }
    @Then("The user wants to add last name as {string}")
    public void the_user_wants_to_add_last_name_as(String lastname) {

        WebElement addlastname=Driver.getDriver().findElement(By.xpath("//input [@class='oxd-input oxd-input--active orangehrm-lastname']"));
        addlastname.sendKeys(lastname);
        CommenUtils.hardWait(3000);
    }
    @Then("The user wants to save the information")
    public void the_user_wants_to_save_the_information() {

        WebElement save=Driver.getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
        save.click();
        CommenUtils.hardWait(3000);

    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String headerText) {

        CommenUtils.hardWait(10000);
        WebElement personalDetails=Driver.getDriver().findElement(By.xpath("//h6[.='Personal Details']"));
        Assert.assertEquals(personalDetails.getText(),headerText);
        CommenUtils.hardWait(3000);

        Driver.getDriver().close();

    }

    @Given("The user want to go to login")

    public void the_user_want_to_go_to_login() {

        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        CommenUtils.hardWait(4000);
        WebElement username=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));

        username.sendKeys(ConfigurationReader.getProperty("username"));
        password.sendKeys(ConfigurationReader.getProperty("password"));



        CommenUtils.hardWait(3000);


    }


    @When("The user wants to enter username as {string} and the password as {string}")
    public void theUserWantsToEnterUsernameAsAndThePasswordAs(String username1, String pasword1) {
        WebElement username=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));

        username.sendKeys(username1);
        password.sendKeys(pasword1);

    }

    @Then("The user wants to navigate recruitment")
    public void the_user_wants_to_navigate_recruitment() {
        CommenUtils.hardWait(4000);
      WebElement Recruitment=Driver.getDriver().findElement(By.cssSelector("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
      //Recruitment.click();
      CommenUtils.clickWithWait(Recruitment);
    }
    @Then("The user wants to see candidates")
    public void the_user_wants_to_see_candidates() {
        WebElement Candidates=Driver.getDriver().findElement(By.xpath("//a[@href='#']"));
        Candidates.click();


    }
    @Then("The user wants to add a candidate")
    public void the_user_wants_to_add_a_candidate() {
      WebElement addbutton=Driver.getDriver().findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
      addbutton.click();
    }
    @Then("The user wants to enter first name as {string} , last name as\"korkmaz\"")
    public void the_user_wants_to_enter_first_name_as_last_name_as_korkmaz(String sanem , String korkmaz) {
        WebElement firstnaem=Driver.getDriver().findElement(By.xpath("//input[@class='oxd-input oxd-input--active']"));
        WebElement lastname=Driver.getDriver().findElement(By.xpath("" ));

    }
    @Then("The user wants to enter email adress as\"sanemk95@gmail.com\"")
    public void the_user_wants_to_enter_email_adress_as_sanemk95_gmail_com() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user wants to Consent to keep data")
    public void the_user_wants_to_consent_to_keep_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user wants to save")
    public void the_user_wants_to_save() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The user wants to verify that the user is created")
    public void the_user_wants_to_verify_that_the_user_is_created() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }




































}

