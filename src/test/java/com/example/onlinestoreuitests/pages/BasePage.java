package com.example.onlinestoreuitests.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;


import java.time.Duration;

import static com.codeborne.selenide.Condition.hidden;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    public SelenideElement cartBtn = findElementByName("Cart");



    public SelenideElement findElementByName(String text){
        SelenideElement element = $x("(//*[contains(text(),'"+text+"')])[1]");
        return element;
    }
    public ElementsCollection findElementsByName(String text){
        ElementsCollection element = $$x("(//*[contains(text(),'"+text+"')])");
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
    @Step("Проверка отображения элемента с текстом : {text}")
    public MainPage elementIsVisible(String text) {
        findElementByName(text).shouldBe(Condition.visible, Duration.ofSeconds(3));
        return new MainPage();
    }
    @Step("Проверка отсутствия элемента с текстом : {text}")
    public MainPage elementIsHidden(String text) {
        findElementByName(text).shouldBe(hidden, Duration.ofSeconds(3));
        return new MainPage();
    }


}
