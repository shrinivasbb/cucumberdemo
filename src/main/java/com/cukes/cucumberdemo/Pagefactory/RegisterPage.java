package com.cukes.cucumberdemo.Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends AbsolutePage{

    @FindBy(id="email")
    @CacheLookup
    public WebElement txtEmail;

    @FindBy(name="password")
    @CacheLookup
    public WebElement txtPassword;

    @FindBy(name="confirmPassword")
    @CacheLookup
    public WebElement txtCPassword;

    @FindBy(name="register")
    @CacheLookup
    public WebElement btnRegister;


    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public RegisterPage registerUser(String user,String password,String cpassword){
        txtEmail.sendKeys(user);
        txtPassword.sendKeys(password);
        txtCPassword.sendKeys(cpassword);
        return PageFactory.initElements(driver,RegisterPage.class);
    }

    public LoginPage clickRegister(){
        btnRegister.click();
        return PageFactory.initElements(driver,LoginPage.class);
    }
}
