import com.microsoft.playwright.*;

public class JavaPlaywrightSmokeTest {

    public static void main(String[] args) {

        try (Playwright playwright = Playwright.create()) {

            Browser browser = playwright.chromium().launch(
                    new BrowserType.LaunchOptions()
                            .setHeadless(true));

            System.out.println("Playwright Browser Launch Successful");

            browser.close();
        }
    }
}