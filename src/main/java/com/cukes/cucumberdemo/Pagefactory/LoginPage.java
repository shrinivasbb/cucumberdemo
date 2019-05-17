package com.cukes.cucumberdemo.Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.rmi.runtime.Log;

public class LoginPage extends AbsolutePage {

    @FindBy(linkText = "REGISTER")
    @CacheLookup
    public WebElement lnkRegister;

    @FindBy(linkText = "sign-in")
    @CacheLookup
    public WebElement lnkSignin;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickSignIn(){
        lnkSignin.click();
        return PageFactory.initElements(driver,LoginPage.class);
    }

    public RegisterPage clickRegister(){
        lnkRegister.click();
        return PageFactory.initElements(driver,RegisterPage.class);
    }
}
