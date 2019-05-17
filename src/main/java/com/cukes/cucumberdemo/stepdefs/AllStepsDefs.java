package com.cukes.cucumberdemo.stepdefs;

import com.cukes.cucumberdemo.Pagefactory.AbsolutePage;
import com.cukes.cucumberdemo.Pagefactory.LoginPage;
import com.cukes.cucumberdemo.Pagefactory.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class AllStepsDefs {

    //public BaseUtil base;

    public LoginPage loginPage;
    public RegisterPage registerPage;
    public AbsolutePage absolutePage;
    public WebDriver driver;

    public void init(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ File.separator+"src"+ File.separator+"main"
                +File.separator+"resources"+ File.separator+"drivers"+ File.separator+"chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://newtours.demoaut.com");
    }

    @Given("That I Click on Register link")
    public void that_I_Click_on_Register_link() {
        init();
        absolutePage=new AbsolutePage(driver);
        loginPage=absolutePage.landOnLogin();
        registerPage=loginPage.clickRegister();
    }

    @Then("I fill username and password")
    public void i_fill_username_and_password() {
        registerPage.registerUser("user","password","password");
    }

    @Then("when I click on submit")
    public void when_I_click_on_submit() {
        loginPage=registerPage.clickRegister();
    }

    @Then("Registration should be successful")
    public void registration_should_be_successful() {
        System.out.println("Done");
        driver.quit();
    }





}
