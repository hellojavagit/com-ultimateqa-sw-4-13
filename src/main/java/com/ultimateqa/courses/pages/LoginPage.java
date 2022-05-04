package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


    By welcomeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By loginButton = By.xpath("//input[@type='submit']");
    By errorMessage = By.xpath("//li[@class='form-error__list-item']");
    By invalidMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }
    public void enterEmailID(String email){
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }
   // public void clickOnSignInButton(){
      //  clickOnElement(signInButton);
    //}
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getInvalidMessage(){
        return getTextFromElement(invalidMessage);
    }





}
