package com.drag_and;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class dragAndDropTests {

    @BeforeAll
    static void setup() {
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://the-internet.herokuapp.com";
        Configuration.startMaximized = true;
    }

    @Test
    void dragAndDropTest() {
        // Step 1: Open a page "https://github.com/"
        open("/drag_and_drop");
        // Step 2: Grab and drag an element "A" into an element "B"
        $("#column-a").dragAndDropTo("#column-b");
        // Step 3: Check result.
        $("#column-a").shouldHave(text("B"));
    }
}
