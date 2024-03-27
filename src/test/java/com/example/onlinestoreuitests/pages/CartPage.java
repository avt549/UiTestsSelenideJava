package com.example.onlinestoreuitests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

public class CartPage extends BasePage{

   public SelenideElement placeOrder =  findElementByName("Place Order");
   public ElementsCollection btnsDelete = findElementsByName("Delete");
    @Step("нажать на кнопку Place Order")
    public PlaceOrder clickBtnPlaceOrder() {
        clickByElement(placeOrder);
        return new PlaceOrder();
    }
    @Step("Нажать на кнопку удалить у продукта по индексу: {index}")
    public CartPage clickBtnDeleted(Integer index){
        clickByElement(btnsDelete.get(index));
        return this;
    }


}
