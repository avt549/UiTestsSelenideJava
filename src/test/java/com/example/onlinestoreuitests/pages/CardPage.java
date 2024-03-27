package com.example.onlinestoreuitests.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

public class CardPage extends BasePage{
    public SelenideElement btnAddToCar = findElementByName("Add to cart");
    public SelenideElement btnHome = findElementByName("Home");

    @Step("нажать на кнопку \"Add to cart\"")
    public CardPage clickBtnAddToCart() {
        clickByElement(btnAddToCar);
        return this;
    }
    @Step("нажать на кнопку \"Add to cart\"")
    public MainPage clickBtHome() {
        clickByElement(btnHome);
        return new MainPage();
    }
}
