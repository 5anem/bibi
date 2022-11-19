package renastech.Steps_Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renastech.utils.Driver;

public class OrangeHRMSteps {


    @Given("The user want to orangeHRM application")
    public void the_user_want_to_orange_hrm_application() {
        System.out.println("this is login step ");
    }
    @When("The user want to enter username and password")
    public void the_user_want_to_enter_username_and_password() {
        System.out.println("enter your password and username");

    }
    @Then("The user wants to click")
    public void the_user_wants_to_click() {
        System.out.println("click to button");
    }

        @And(" The user should be able to navigate dashboard")
    public void the_user_should_be_able_to_navigate_dashboard(){
            System.out.println("user should able to be see dashboard");


    }


    @When("The user wants to enter username as {string} and the password as {string}")
    public void the_user_wants_to_enter_username_as_and_the_password_as(String username, String password) {

        System.out.println("this is a username "+ username);
        System.out.println("this is a password "+ password);
    }

    @Then("The user id number should be {int}")
    public void the_user_id_should_be(Integer employeerID) {

    }

    @Then("The user id should be {double}")
    public void the_user_id_should_be(Double id) {

    }

































}
