package com.example.onlinestoreuitests.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

public class CardPage extends BasePage{
    public SelenideElement btnAddToCar = findElementByName("Add to cart");

    @Step("нажать на кнопку \"Add to cart\"")
    public CardPage clickBtnAddToCart() {
        clickByElement(btnAddToCar);
        return this;
    }
    @Step("в диалоговом окне нажать на кнопку ОК")
    public CardPage clickBtnOk() {
        WebDriverRunner.getWebDriver().switchTo().activeElement().sendKeys("enter");
        return this;
    }
}
