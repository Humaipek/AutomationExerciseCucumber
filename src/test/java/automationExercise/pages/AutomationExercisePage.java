package automationExercise.pages;

import automationExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(partialLinkText = "Signup / Login")
    public WebElement signUpLogin;

    @FindBy(xpath = "//h2[.='New User Signup!']")
    public WebElement newUserSignup;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement signUpName;

    @FindBy(xpath= "//button[@data-qa='signup-button']")
    public WebElement signUpButton;

    @FindBy(xpath = "//b[.='Enter Account Information']")
    public WebElement enterAccount;

    @FindBy(id = "id_gender2")
    public WebElement gender;

    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "newsletter")
    public WebElement selectSignupForOurNewsletter;

    @FindBy(id = "optin")
    public WebElement selectReceiveSpecialOffersFromOurPartners;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(xpath = "//button[@data-qa='create-account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[.='Account Created!']")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;

    @FindBy(partialLinkText = "Delete Account")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//*[text()=' Logged in as ']")
    public WebElement logginInAs;

    @FindBy(xpath = "//b[.='Account Deleted!']")
    public WebElement deleteAccountText;

    @FindBy(xpath = "//p[.='Consent']")
    public WebElement cookieConsent;

    @FindBy(xpath = "//h2[.='Login to your account']")
    public WebElement loginToYourAccount;

    @FindBy(css = "input[data-qa='login-email']")
    public WebElement loginMail;

    @FindBy(css = "input[data-qa='login-password']")
    public WebElement loginPassword;

    @FindBy(css = "button[data-qa='login-button']")
    public WebElement loginButton;

    @FindBy(xpath = "//form/p[.='Your email or password is incorrect!']")
    public WebElement yourEmailOrPasswordIsIncorrect;

    @FindBy(partialLinkText = "Logout")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[.='Email Address already exist!']")
    public WebElement emailExist;

    @FindBy(partialLinkText = "Contact us")
    public WebElement contactUs;

    @FindBy(xpath = "(//h2)[2]")
    public WebElement getInTouch;

    @FindBy(css = "input[data-qa='name']")
    public WebElement contactName;

    @FindBy(css = "input[name='upload_file']")
    public WebElement fileInput;

    @FindBy(css = "input[value='Submit']")
    public WebElement submit;

    @FindBy(css = "div[style='display: block;']")
    public WebElement actualSuccess;

    @FindBy(xpath = "//a/span[.=' Home']")
    public WebElement homeButton;

    @FindBy(partialLinkText = "Test Cases")
    public WebElement testCasesButton;

    @FindBy(partialLinkText = "Products")
    public WebElement productsButton;

    @FindBy(xpath = "//*[.='All Products']")
    public WebElement allProductsText;

    @FindBy(xpath = "//div[@class='productinfo text-center']/img")
    public List<WebElement> allProducts;

    @FindBy(partialLinkText = "View Product")
    public WebElement viewProduct;

    @FindBy(xpath = "(//h2)[3]")
    public WebElement productName;

    @FindBy(xpath = "(//p)[3]")
    public WebElement productCategory;

    @FindBy(xpath = "(//span)[13]")
    public WebElement productPrice;

    @FindBy(xpath = "//*[.='Availability:']")
    public WebElement productAvailability;

    @FindBy(xpath = "//*[.='Condition:']")
    public WebElement productCondition;

    @FindBy(xpath = "//*[.='Brand:']")
    public WebElement productBrand;

    @FindBy(id = "search_product")
    public WebElement searchInput;

    @FindBy(id= "submit_search")
    public WebElement searchButton;

    @FindBy(xpath= "//h2[.='Searched Products']")
    public WebElement searchedProducts;

    @FindBy(xpath = "//div[@class='product-image-wrapper']")
    public List<WebElement> allProductsRelated;

    @FindBy(xpath= "//h2[.='Subscription']")
    public WebElement subscription;

    @FindBy(id= "susbscribe_email")
    public WebElement subscriptionEmail;

    @FindBy(id= "subscribe")
    public WebElement arrowButton;

    @FindBy(xpath= "//div[.='You have been successfully subscribed!']")
    public WebElement subscribedSuccessfully;












}
