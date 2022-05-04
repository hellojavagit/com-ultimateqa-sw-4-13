package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyTheErrorMessage(){
        HomePage homePage = new HomePage();
        homePage.clickOnSignInLink();
        String expectedErrorMessage = "Welcome Back!";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Invalid messages");
        loginPage.enterEmailID("prime123@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage1 = "Invalid email or password.";
        String actualErrorMessage1 = loginPage.getInvalidMessage();
        Assert.assertEquals(actualErrorMessage1,expectedErrorMessage1,"Invalid email or Password");
    }
}