import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;




public class GeneralTest {

    @Test
    void newTest() {
        com.codeborne.selenide.Configuration.holdBrowserOpen = true;

        open("https://www.google.com/");

    }


}
