package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayGlue {
    @Given("I am on Ebay Home Page")
    public void i_am_on_ebay_home_page() {
        System.out.println("Andrei");
    }
    @When("I click on Advanced Link")
    public void i_click_on_advanced_link() {
        System.out.println("Marius");
    }
    @Then("I navigate to Advanced Search Page")
    public void i_navigate_to_advanced_search_page() {
        System.out.println("Petre");
    }

}
