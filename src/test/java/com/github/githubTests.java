package com.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class githubTests {

    @BeforeAll
    static void setup() {
        Configuration.browser = "firefox";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }
    @Test
    void searchSelenideTest(){
        // Step 1: Open a page "https://github.com/"
        // Step 2: Enter "selenide" in the search field
        // Step 3: Press Enter
        // Step 4: Open the repository "selenide/selenide"
        // Step 5: Navigate to Wiki of project
        // Step 6: Check: on the list of pages have a page "SoftAssertion"
        // Step 7: Open the page "SoftAssertion"
        // Step 8: Check that page contains example the code for Junit5
    }
}
