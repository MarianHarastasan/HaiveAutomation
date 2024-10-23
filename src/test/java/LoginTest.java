import com.aventstack.extentreports.Status;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

// This annotation is used to specify that the ExtentTestNGITestListener class should be used to listen to the test events.
// The listener will generate reports based on the test results using the ExtentReports library.
@Listeners(ExtentTestNGITestListener.class)

// Declaring the CheckoutTest class, which extends the Hooks class.
// By extending Hooks, CheckoutTest inherits the setup and teardown methods for WebDriver.
public class LoginTest extends Hooks {

    private static final Logger log = LoggerFactory.getLogger(LoginTest.class);
    // Declaring a public variable of type CheckoutPage named 'checkoutPage'.
    // This will be used to interact with the CheckoutPage object during the tests.
    public LoginPage loginPage;

    public SoftAssert softAssert;
    // Declaring a public variable of type WebDriverWait named 'wait'.
    // WebDriverWait is used to explicitly wait for certain conditions or elements during test execution.
    public WebDriverWait wait;

    // Method annotated with @BeforeMethod, indicating that it will run before each test method.
    // This method is used to set up the page objects and other necessary components before each test.
    @BeforeMethod
    public void SetupPageObject() {

        // Initializing the checkoutPage object with the current WebDriver instance.
        // This allows the test methods to interact with elements on the checkout page.
        loginPage = new LoginPage(driver);

        // Initializing the WebDriverWait object with the current WebDriver instance and a timeout of 30 seconds.
        // This wait will be used to pause the execution until certain conditions are met or elements are found.
        wait = new WebDriverWait(driver, 30);
        softAssert = new SoftAssert();
    }

//    @Test(description = "Login Test")
//    public void loginTest() throws InterruptedException {
//        loginPage.clickLoginButton();
//        loginPage.setUsername("dino");
//        loginPage.setPassword("choochoo");
//        loginPage.clickLogButton();
//        Thread.sleep(5000);
//        assertEquals(loginPage.getDino().getText(), "dino");
//    }

//    @Test(description = "Sorting Test")
//    public void sortTest() throws InterruptedException {
//        loginPage.selecOption(loginPage.getSortBar(), "Sort by name (Z to A)");
//        Thread.sleep(5000);
////        assertEquals();
//    }

    @Test(description = "login test")
    public void loginTest() throws InterruptedException {
        loginPage.loginUser();
        Thread.sleep(5000);
    }




    @Test(description = "Calendar Button")
    public void calendarButton() throws InterruptedException {
        loginPage.loginUser();
        Thread.sleep(5000);
        loginPage.clickCalendarButton();
        Thread.sleep(5000);
    }

    @Test(description = "Log in to interact")
    public void logInToInteract(){
        loginPage.clickToolbarButton();
    }

    @Test(description = "Locatii")
    public void locatii() throws InterruptedException {
        loginPage.loginUser();
        loginPage.clickWhenReady(loginPage.getLocatii());
        loginPage.clickWhenReady(loginPage.getCreateLocation());
        loginPage.sendKeysWhenReady(loginPage.getLocationName(), "Test Name");
//        loginPage.setLocationName();
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(580, 2800);");
        Thread.sleep(2000);
        loginPage.clickCreateLocationButton();
        wait.until(ExpectedConditions.visibilityOf(loginPage.getNameOfLocation()));
        Thread.sleep(5000);
        assertEquals(loginPage.getNameOfLocation().getText(), "Test Name", "The location is not found");
        assertEquals(loginPage.getNameOfLocation().getText(), "Test Name", "The location is not found");
    }

    @Test(description = "Logout")
    public void logout() throws InterruptedException {
        loginPage.loginUser();
        Thread.sleep(5000);
        loginPage.clickUserAvatar();
        Thread.sleep(5000);
        loginPage.clickLogoutButton();
        Thread.sleep(5000);
//        assertEquals(loginPage.clickLogoutButton().getText);
    }

    @Test(description = "negative login test")
    public void negativeLoginTest() throws InterruptedException {
        loginPage.loginUser();
//        wait.until(ExpectedConditions.visibilityOf(loginPage.date()));
//        loginPage.clickDatePicker();
        loginPage.clickWhenReady(loginPage.date());
        loginPage.clickPrevMonth();
        loginPage.clickDay1();
        loginPage.clickDay3();
        Thread.sleep(5000);

    }

    @Test(description = "Create Menu")
    public void meniu() throws InterruptedException {
        loginPage.loginUser();
        Thread.sleep(5000);
//        loginPage.clickMeniu();
//        Thread.sleep(5000);
//        loginPage.clickMenuButton();
//        Thread.sleep(5000);
        loginPage.clickWhenReady(loginPage.meniu());
//        loginPage.clickWhenReady(loginPage.menuButton());
//        loginPage.setMenuName();
//        Thread.sleep(5000);
//        loginPage.setDescription();
//        Thread.sleep(5000);
//        loginPage.clickWhenReady(loginPage.menuName());
//        loginPage.clickWhenReady(loginPage.description());
//        loginPage.clickWhenReady(loginPage.creatiMeniu());
        loginPage.clickSummerMenu();
        Thread.sleep(5000);

    }
}
