package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class githubTests {

    @BeforeAll
    static void setup() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
    }

    @Test
    void searchSelenideTest() {
        // Step 1: Open a page "https://github.com/"
        open("https://github.com/");
        // Step 2: Enter "selenide" in the search field and Press Enter
        $("input[data-test-selector='nav-search-input']").setValue("selenide").pressEnter();
        // Step 3: Open the repository "selenide/selenide"
        $("ul.repo-list li a").click();
        // Step 4: Navigate to Wiki of project
        $("#wiki-tab").click();
        // Step 5: Check: on the list "Page" have a page "Soft assertions"
        $(".wiki-pages-box button").shouldHave(text("more pages")).scrollIntoView(true).click();             // open the list
        // Step 6: Open the page "Soft assertion"
        $$(".wiki-pages-box li").find(text("SoftAssertions")).click();
        // Step 7: Check that page contains example the code for Junit5
        $$(".markdown-body ol li").findBy(exactText("Using JUnit5 extend test class:")).shouldBe(visible);
    }
}
