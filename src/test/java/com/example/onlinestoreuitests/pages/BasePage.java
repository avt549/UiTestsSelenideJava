package com.example.onlinestoreuitests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import java.time.Duration;

import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    public SelenideElement cartBtn = findElementByName("Cart");



    public SelenideElement findElementByName(String text){
        SelenideElement element = $x("(//*[contains(text(),'"+text+"')])[1]");
        return element;
    }
    public void clickByElement(SelenideElement element){
        element.shouldBe(Condition.visible, Duration.ofSeconds(3)).scrollIntoView(true).click();
    }
    public void inputText(SelenideElement element, String text){
        element.shouldBe(Condition.visible, Duration.ofSeconds(3)).scrollIntoView(true).sendKeys(text);
    }

    @Step("нажать на кнопку Cart")
    public CartPage clickBtnCart() {
        clickByElement(cartBtn);
        return new CartPage();
    }
}
