package automationExercise.pages;

import automationExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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










}
