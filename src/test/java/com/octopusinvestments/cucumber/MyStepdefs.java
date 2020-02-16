package com.octopusinvestments.cucumber;

import com.octopusinvestments.pageobject.HomePage;
import com.octopusinvestments.pageobject.PersonProfilePage;
import com.octopusinvestments.pageobject.SortByPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Kavita Shah on 14/02/2020
 */
public class MyStepdefs {
    @Given("^user is on the main page$")
    public void userIsOnTheMainPage() {
        new HomePage().handlePopup();
    }

    @When("^user click on the search bar$")
    public void userClickOnTheSearchBar() {
        new HomePage().clickOnSearchBar();//
    }

    @And("^user enter \"([^\"]*)\" in search field$")
    public void userEnterInSearchField(String name) {
        new HomePage().enterTextInSearchBar(name);
    }

    @Then("^user should able to see name \"([^\"]*)\" at result$")
    public void userShouldAbleToObserveCorrectPerson(String name) {
        new HomePage().validateTheSearchName(name);
    }

    @When("^user click on the person image\"([^\"]*)\"$")
    public void userClickOnThePersonImage(String name) {
        new HomePage().clickOnPersonImage(name);

    }

    @Then("^user should able to see the profile of \"([^\"]*)\"$")
    public void userShouldAbleToSeeTheProfileOf(String name) {
        new PersonProfilePage().verifyPersonName(name);


    }

    @When("^user click on sort by A to Z$")
    public void userClickOnSortByAToZ() {
        new SortByPage().clickOnTrigger();
        new SortByPage().selectAtoZ();

    }

    @Then("^user should see the list in ascending order$")
    public void userShouldSeeTheListInAscendingOrder() {
        new SortByPage().verifyAscOrder();
    }

    @When("^user click on sort by Z to A$")
    public void userClickOnSortByZToA() {
        new SortByPage().clickOnTrigger();
        new SortByPage().selectTextZtoA();
    }

    @Then("^user shoule see the list in descending order$")
    public void userShouleSeeTheListInDescendingOrder() {
        new SortByPage().verifyDesOrder();
    }
}
