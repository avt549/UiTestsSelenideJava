package com.example.onlinestoreuitests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$;

public class MainPage extends BasePage {

    SelenideElement signIn = $("#signin2");
    SelenideElement logIn = $("#login2");
    SelenideElement btnPhones = findElementByName("Phones");
    SelenideElement btnLaptops = findElementByName("Laptops");
    SelenideElement btnMonitors = findElementByName("Monitors");

    @Step("Нажать на кнопку signIn")
    public MainPage clickByButtonSignIn(){
        clickByElement(signIn);
        return this;
    }
    @Step("Нажать на кнопку logIn")
    public LoginPage clickByButtonLogIn(){
        clickByElement(logIn);
        return new LoginPage();
    }

    @Step("нажать нв кнопку Phones")
    public MainPage clickBuBtnPhones() {
        clickByElement(btnPhones);
        return this;
    }
    @Step("нажать на картинку {text}")
    public CardPage clickByCard(String text) {
        clickByElement(findElementByName(text));
        return new CardPage();
    }
}
