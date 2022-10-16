package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_submission;

public class D02_submissionStepDef extends P02_submission {

//    @Given("user signed in to twitter")
//    public void user_signed_in_to_twitter() {
//
//    }

    @And("user Write new post less than \"280\" characters")
    public void userWriteNewPostLessThanCharacters() {
        writePost();

    }

    @And("click on Tweet button")
    public void click_on_tweet_button() {
        clickOnTweetButton();

    }
    @Then("Validate that user post successfully.")
    public void validate_that_user_post_successfully() {
//        validatePostSuccessfully();

    }

    @And("user Write new post more than 280 characters")
    public void userWriteNewPostMoreThanCharacters()  {
        writePostOutOfLimit();
}

    @And("user Write new post contains GIF")
    public void userWriteNewPostContainsGIF() {
        writeNewPostContainsGIF();
    }
}
