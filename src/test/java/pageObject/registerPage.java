package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import util.driverFactory;

public class registerPage extends driverFactory{

    public registerPage(WebDriver driver){
        super(driver);
    }

    //locator 
    By firtstNameField = By.id("customer.firstName");
    By lastNameField = By.id("customer.lastName");
    By registrationPage = By.xpath("//*[@id=\"rightPanel\"]/h1");
    By streetField = By.xpath("//*[@id=\"customer.address.street\"]");
    By cityField = By.name("customer.address.city");
    By stateField = By.cssSelector("#customer\\.address\\.state");
    By zipCodeField = By.id("customer.address.zipCode");
    By phoneField = By.name("customer.phoneNumber");
    By ssnField = By.name("customer.ssn");
    By usernameField = By.name("customer.username");
    By passwordField = By.name("customer.password");
    By passConfirmFIeld = By.id("repeatedPassword");
    By successRegistIndicator = By.xpath("//*[@id=\"leftPanel\"]/h2");
    By failedRegistIndicator = By.xpath("//*[@id=\"repeatedPassword.errors\"]");
    By registerButton = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");



    // method
    public void inputNameData(String firsName, String lastName){
        driver.findElement(firtstNameField).sendKeys(firsName);
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void openRegistrationPage(){
        wait.until(
            ExpectedConditions.visibilityOfElementLocated((registrationPage))
        );
    }

    public void inputAddressDetail(String street, String city, String state, String zipCode, String phone, String ssn){
        driver.findElement(streetField).sendKeys(street);
        driver.findElement(cityField).sendKeys(city);
        driver.findElement(stateField).sendKeys(state);
        driver.findElement(zipCodeField).sendKeys(zipCode);
        driver.findElement(phoneField).sendKeys(phone);
        driver.findElement(ssnField).sendKeys(ssn);
    }
    
    public void inputCredentialRegist(String username, String password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void confirmPassword(String confirmPassword){
        driver.findElement(passConfirmFIeld).sendKeys(confirmPassword);
    }

    public void clickRegistButton(){
        driver.findElement(registerButton).click();
    }

    public void successRegist(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(successRegistIndicator));
    }    

    public void failedRegist(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(failedRegistIndicator));
    }    
}
