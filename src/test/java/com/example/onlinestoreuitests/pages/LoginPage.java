package com.example.onlinestoreuitests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends MainPage {
    SelenideElement inputUserName = $("#loginusername");
    SelenideElement inputPass = $("#loginpassword");
    SelenideElement buttonLogIn = $x("//button[contains(text(),'Log in')]");
    SelenideElement buttonSignUp = $x("//button[contains(text(),'Sign up')]");
    SelenideElement inputSignUserName = $("#sign-username");
    SelenideElement inputSignPass = $("#sign-password");
    SelenideElement buttonClose = $("//div[@class='modal fade show']//button[contains(text(),'Close')]");


    @Step("Ввести логин")
    public LoginPage inputLogin(String login){
        inputText(inputUserName,login);
        return this;
    }
    @Step("Ввести пароль")
    public LoginPage inputPass(String pass){
        inputText(inputPass,pass);
        return this;
    }
    @Step("Ввести логин")
    public LoginPage inputSignLogin(String login){
        inputText(inputSignUserName,login);
        return this;
    }
    @Step("Ввести пароль")
    public LoginPage inputSignPass(String pass){
        inputText(inputSignPass,pass);
        return this;
    }
    @Step("Нажать на кнопку LogIn")
    public MainPage clickByBtnLogin(){
        clickByElement(buttonLogIn);
        return new MainPage();
    }
    @Step("Нажать на кнопку SignUp")
    public MainPage clickByBtnSignUp(){
        clickByElement(buttonSignUp);
        return new MainPage();
    }
}
