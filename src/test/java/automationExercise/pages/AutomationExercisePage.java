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

    @FindBy(partialLinkText= "Cart")
    public WebElement cartButton;

    @FindBy(xpath= "//a[@data-product-id='1']")
    public WebElement firstProduct;

    @FindBy(xpath= "//button[.='Continue Shopping']")
    public WebElement continueShoppingButton;

    @FindBy(xpath= "//a[@data-product-id='2']")
    public WebElement secondProduct;

    @FindBy(xpath= "//u[.='View Cart']")
    public WebElement viewCartButton;

    @FindBy(xpath= "(//td[@class='cart_price']/p)[1]")
    public WebElement firstPrice;

    @FindBy(xpath= "(//td[@class='cart_price']/p)[2]")
    public WebElement secondPrice;

    @FindBy(xpath= "(//button[@class='disabled'])[1]")
    public WebElement firstQuantity;

    @FindBy(xpath= "(//button[@class='disabled'])[2]")
    public WebElement secondQuantity;

    @FindBy(xpath= "(//p[@class='cart_total_price'])[1]")
    public WebElement firstPriceTotal;

    @FindBy(xpath= "(//p[@class='cart_total_price'])[2]")
    public WebElement secondPriceTotal;

    @FindBy(xpath= "//input[@id='quantity']")
    public WebElement quantity;

    @FindBy(xpath= "//button[@type='button']")
    public WebElement addToCartButton;

    @FindBy(xpath= "//button[@class='disabled']")
    public WebElement exactQuantity;

    @FindBy(partialLinkText= "Add to cart")
    public WebElement addToCart;

    @FindBy(partialLinkText= "Proceed To Checkout")
    public WebElement proceedToCheckout;

    @FindBy(xpath= "//*[.='Address Details']")
    public WebElement addressDetails;

    @FindBy(xpath= "//*[.='Review Your Order']")
    public WebElement reviewYourOrder;

    @FindBy(name= "message")
    public WebElement textArea;

    @FindBy(partialLinkText= "Place Order")
    public WebElement placeOrder;


    @FindBy(name= "name_on_card")
    public WebElement nameOnCard;

    @FindBy(xpath= "//b[.='Account Created!']")
    public WebElement accountCreated;

    @FindBy(xpath= "//*[.='Shopping Cart']")
    public WebElement cartPage;

    @FindBy(partialLinkText= "Register / Login")
    public WebElement registerLogin;

    @FindBy(xpath= "//b[.='Account Deleted!']")
    public WebElement accountDeleted;

    @FindBy(id= "submit")
    public WebElement confirmOrderButton;

    @FindBy(xpath= "(//form[1])/div[4]")
    public WebElement successMessage;

    @FindBy(xpath= "//tbody/tr/td/a/i")
    public WebElement xButton;

    @FindBy(tagName= "tbody")
    public List<WebElement> productsList;

    @FindBy(xpath= "//h2[.='Category']")
    public WebElement categories;

    @FindBy(css= "a[href='#Women']")
    public WebElement womenCategory;

    @FindBy(xpath= "//a[.='Dress '][1]")
    public WebElement dressCategory;

    @FindBy(xpath= "//h2[.='Women - Dress Products']")
    public WebElement womenDressProducts;

    @FindBy(css= "a[href='#Men']")
    public WebElement menCategory;

    @FindBy(xpath= "(//a[.='Tshirts '])[1]")
    public WebElement tshirtsCategory;

    @FindBy(xpath= "//*[.='Brands']")
    public WebElement brands;

    @FindBy(xpath= "//a[@href='/brand_products/Polo']")
    public WebElement brandName;

    @FindBy(xpath= "//div[@class='productinfo text-center']/img")
    public List<WebElement> allBrandProducts;

    @FindBy(xpath= "//a[@href='/brand_products/H&M']")
    public WebElement brandLink;

    @FindBy(xpath= "//div[@class='productinfo text-center']/img")
    public List<WebElement> allProductsOtherPage;

    @FindBy(xpath= "//div[@class='productinfo text-center']/a")
    public List<WebElement> addProductsToCart;

    @FindBy(xpath= "//a[.='Write Your Review']")
    public WebElement writeYourReview;

    @FindBy(id= "name")
    public WebElement reviewName;

    @FindBy(xpath= "//span[.='Thank you for your review.']")
    public WebElement successMessageThankYouForYourReview;

    @FindBy(xpath= "//form/button[@id='button-review']")
    public WebElement submitButtonRewiew;

    @FindBy(xpath= "//*[.='recommended items']")
    public WebElement scrollToBottomOfPage;

    @FindBy(xpath= "(//a[@data-product-id='4'])[1]")
    public WebElement product;

    @FindBy(id= "address_delivery")
    public List<WebElement> deliveryAddress;

    @FindBy(id= "address_invoice")
    public List<WebElement> billingAddress;

    @FindBy(partialLinkText= "Download Invoice")
    public WebElement downloadInvoice;

    @FindBy(id= "scrollUp")
    public WebElement scrollUp;

    @FindBy(xpath= "//*[.='Full-Fledged practice website for Automation Engineers']")
    public WebElement fullFledgedText;

    @FindBy(css= "a[style='position: fixed; z-index: 2147483647; display: none;']")
    public WebElement style;














}
