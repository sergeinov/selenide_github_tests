package com.github;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class githubTests {

    @BeforeAll
    static void setup() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void searchSelenideTest() {
        // Step 1: Open a page "https://github.com/"
        open("https://github.com/");
        // Step 2: Enter "selenide" in the search field
        $("input[data-test-selector='nav-search-input']").setValue("selenide");
        // Step 3: Press Enter
        $("input[data-test-selector='nav-search-input']").pressEnter();
        // Step 4: Open the repository "selenide/selenide"
        $$("ul.repo-list li").first().$("a").click();
        // Step 5: Navigate to Wiki of project
        $("#wiki-tab").click();
        // Step 6: Check: on the list "Page" have a page "Soft assertions"
        $(".wiki-pages-box button").shouldHave(text("more pages")).scrollIntoView(true).click();             // open the list
        // Step 7: Open the page "Soft assertion"
        $$(".wiki-pages-box ul li").findBy(text("SoftAssertions")).click();
        // Step 8: Check that page contains example the code for Junit5
        $$(".markdown-body ol li").findBy(exactText("Using JUnit5 extend test class:")).shouldBe(visible).scrollIntoView(true);
    }
}
