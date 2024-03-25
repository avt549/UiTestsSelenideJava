package com.example.onlinestoreuitests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class PlaceOrder extends BasePage{

    public SelenideElement name = $("#name");
    public SelenideElement country = $("#country");
    public SelenideElement city = $("#city");
    public SelenideElement creditCard = $("#card");
    public SelenideElement month = $("#month");
    public SelenideElement year = $("#year");
    public SelenideElement purchase = findElementByName("Purchase");

    @Step("заполнить поле Name")
    public PlaceOrder inputName(String text) {
        inputText(name, text);
        return this;
    }
    @Step("заполнить поле Country")
    public PlaceOrder inputCountry(String text) {
        inputText(country, text);
        return this;
    }
    @Step("заполнить поле City")
    public PlaceOrder inputCity(String text) {
        inputText(city, text);
        return this;
    }
    @Step("заполнить поле Credit card")
    public PlaceOrder inputCreditCard(String text) {
        inputText(creditCard, text);
        return this;
    }
    @Step("заполнить поле Month")
    public PlaceOrder inputMonth(String text) {
        inputText(creditCard, text);
        return this;
    }
    @Step("заполнить поле Year")
    public PlaceOrder inputYear(String text) {
        inputText(year, text);
        return this;
    }

    @Step("нажать на кнопку Purchase")
    public PlaceOrder clickBtnPurchase() {
        clickByElement(purchase);
        return this;
    }
}
