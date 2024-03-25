package com.example.onlinestoreuitests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage extends MainPage {
    SelenideElement inputUserName = $("#loginusername");
    SelenideElement inputPass = $("#loginpassword");
    SelenideElement buttonLogIn = $x("//button[contains(text(),'Log in')]");
    SelenideElement buttonClose = $("//div[@class='modal fade show']//button[contains(text(),'Close')]");

    @Step("Ввести логин")
    public LoginPage inputLogin(){
        inputText(inputUserName,"123");
        return this;
    }
    @Step("Ввести пароль")
    public LoginPage inputPass(){
        inputText(inputPass,"123");
        return this;
    }
    @Step("Нажать на кнопку LogIn")
    public MainPage clickByBtnLogin(){
        clickByElement(buttonLogIn);
        return new MainPage();
    }
}
