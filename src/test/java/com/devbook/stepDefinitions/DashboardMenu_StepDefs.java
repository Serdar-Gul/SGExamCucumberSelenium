package com.devbook.stepDefinitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DashboardMenu_StepDefs {

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
    }
}
