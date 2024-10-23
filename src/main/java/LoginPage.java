import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


// Declaring the CheckoutPage class, which extends the BasePage class.
// By extending BasePage, CheckoutPage inherits the WebDriver instance and the PageFactory initialization.
public class LoginPage extends BasePage {

    // Declaring a public WebDriverWait variable named 'wait'.
    // WebDriverWait is used for implementing explicit waits during interactions with web elements.
    public WebDriverWait wait;

    // Constructor for the CheckoutPage class that takes a WebDriver object as an argument.
    // This constructor calls the parent class (BasePage) constructor to initialize the WebDriver instance
    // and sets up the PageFactory to initialize the web elements on this page.
    public LoginPage(WebDriver driver) {
        // Calling the parent class (BasePage) constructor using 'super' to initialize the WebDriver.
        super(driver);

        // Initializing the WebDriverWait object with a 10-second timeout.
        // This will be used to wait for certain conditions or elements during test execution.
        wait = new WebDriverWait(driver, 10);
    }

    // Locating the search bar element using the @FindBy annotation.
    // @FindBy is a Selenium annotation that helps locate elements on the web page.
    // Here, the element is being located by its 'id' attribute with the value "input-search".
    // Declare the WebElement as private to enforce encapsulation
    // This ensures that 'searchBar' cannot be accessed directly from outside this class
    @FindBy(linkText = "Autentificare")
    private WebElement loginIcon;

    public void clickLoginIcon() {
        loginIcon.click();
    }

    @FindBy(name = "email")
    private WebElement username;

    public void setUsername(String user) {
        username.sendKeys(user);
    }


    @FindBy(name = "password")
    private WebElement password;

    public void setPassword(String pass) {
        password.sendKeys(pass);
    }

    @FindBy(xpath = "//button[text()='Autentificare']")
    private WebElement getLoginButton;

    public void clickLogButton() {
        getLoginButton.click();
    }

    @FindBy(linkText = "dino")
    private WebElement dino;

    public WebElement getDino() {
        return dino;
    }

    @FindBy(css = ".sort-products-select.form-control.form-control-sm")
    private WebElement sortBar;

    public WebElement getSortBar() {
        return sortBar;
    }

    public void selecOption(WebElement element, String option) {
        Select optionSelect = new Select(element);
        optionSelect.selectByVisibleText(option);
    }

    @FindBy(css = ".svg-inline--fa.fa-undo.fa-w-16 ")
    private WebElement resetBtn;

    public void clickResetButton() {
        resetBtn.click();
    }

    public void clickWhenReady(WebElement locator){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.click();
    }

    public void loginUser() throws InterruptedException {
        clickLoginIcon();
        wait.until(ExpectedConditions.visibilityOf(username));
        setUsername("harastasan.marian@yahoo.com");
        setPassword("Fasttrackit");
        clickLogButton();
    }


    @FindBy(xpath = "//button[text()='Sep 16, 2024']")
    private WebElement getCalendarButon;

    public void clickCalendarButton() {
        getCalendarButon.click();
    }

    @FindBy(linkText = "Locații")
    private WebElement locatii;

    public WebElement getLocatii(){
        return locatii;

    }
    public void clickLocatii() {
        locatii.click();
    }

    @FindBy(linkText = "Creați locație")
    private WebElement createLocation;

    public WebElement getCreateLocation(){
        return createLocation;
    }

    public void clickCreateLocation() {
        createLocation.click();
    }

    @FindBy(name = "name")
    private WebElement locationName;

    public WebElement getLocationName(){
        return locationName;
    }

    public void setLocationName(){
        locationName.sendKeys("Restaurant - Fast Track IT");

    }

    @FindBy(xpath = "//button[contains(text(), 'Creați locația')]")
    private WebElement createLocationButton;

    public void clickCreateLocationButton(){
        createLocationButton.click();
    }

    @FindBy(xpath = "//button[@class='minimal-toolbar_iconButton__hBqdp']")
    private WebElement toolbarButton;

    public void clickToolbarButton(){
        toolbarButton.click();
    }



    @FindBy(css = ".text-xl.font-semibold.leading-none.tracking-tight")
    private WebElement nameOfLocation;

    public WebElement getNameOfLocation(){
        return nameOfLocation;
    }



    @FindBy(css = ".relative.flex.shrink-0.overflow-hidden.rounded-full.size-8")
    private WebElement userAvatar;

    public void clickUserAvatar(){
        userAvatar.click();
    }
    @FindBy(xpath = "//div[text()='Ieşi din cont']")
    private WebElement logoutButton;

    public void clickLogoutButton(){
        logoutButton.click();
    }

    @FindBy(id = "date")
    private WebElement datePicker;

    public void clickDatePicker(){
        datePicker.click();
    }

    public WebElement date(){
        return datePicker;
    }

    @FindBy(xpath = "//button[@name='day' and text()='1'][1]")
    private WebElement day1;

    public void clickDay1(){
        day1.click();
    }
    @FindBy(xpath = "//button[@name='day' and text()='3'][1]")
    private WebElement day3;

    public void clickDay3(){
        day3.click();
    }

    @FindBy(xpath = "//button[@name='previous-month']")
    private WebElement prevMonth;

    public void clickPrevMonth(){
        prevMonth.click();
    }

    @FindBy(css = ".lucide.lucide-book-open.mr-2.size-4")
    private WebElement meniu;
    public void clickMeniu(){
        meniu.click();
    }
    public WebElement meniu(){
        return meniu;
    }

    @FindBy(xpath = "//button[text()='Creați meniu']")
    private WebElement menuButton;

    public void clickMenuButton(){
        menuButton.click();
    }

    public WebElement menuButton(){
        return menuButton;
    }

    @FindBy(id = "name")
    private WebElement menuName;

    public void setMenuName(){
        menuName.sendKeys("Summer menu");
    }

    public WebElement menuName(){
        return menuName;
    }

    @FindBy(id = "description")
    private WebElement description;

    public void setDescription(){
        description.sendKeys("Best of summer menu");
    }

    public WebElement description(){
        return description;
    }

    @FindBy(xpath = "//button[text()='Creați meniu' and @type='submit'] ")
    private   WebElement creatiMeniu;

    public void clickCreatiMeniu(){
        creatiMeniu.click();
    }

    public WebElement creatiMeniu(){
        return creatiMeniu;
    }

    @FindBy(css = ".text-lg")
    private WebElement summerMenu;

    public void clickSummerMenu(){
        summerMenu.click();
    }

//    public void clickWhenReady(WebElement locator){
//        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
//        element.click();
//    }

    public void sendKeysWhenReady(WebElement locator, String text){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        element.sendKeys(text);
    }



}