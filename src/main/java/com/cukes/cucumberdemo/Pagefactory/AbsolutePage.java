package com.cukes.cucumberdemo.Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbsolutePage {

    public WebDriver driver;

    public AbsolutePage(WebDriver driver){
        this.driver=driver;
    }

    public LoginPage landOnLogin(){
        return PageFactory.initElements(driver,LoginPage.class);
    }

}
