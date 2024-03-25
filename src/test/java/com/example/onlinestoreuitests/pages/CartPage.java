package com.example.onlinestoreuitests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class CartPage extends BasePage{

   public SelenideElement placeOrder =  findElementByName("Place Order");
    @Step("нажать на кнопку Place Order")
    public PlaceOrder clickBtnPlaceOrder() {
        clickByElement(placeOrder);
        return new PlaceOrder();
    }


}
