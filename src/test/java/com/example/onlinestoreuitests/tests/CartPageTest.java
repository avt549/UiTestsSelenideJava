package com.example.onlinestoreuitests.tests;

import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CartPageTest extends BaseTest{

    @Test
    @DisplayName("Проверка отображения добавленных товаров в корзине")
    public void productsDisplayedInCart(){
       mainPage. clickByCard("Samsung galaxy s6")
               .clickBtnAddToCart()
               .clickBtHome()
               . clickByCard("Nokia lumia 1520")
               .clickBtnAddToCart()
               .clickBtHome(). clickByCard("Nexus 6")
               .clickBtnAddToCart()
               .clickBtHome()
               .clickBtnCart()
               .elementIsVisible("Samsung galaxy s6")
               .elementIsVisible("Nokia lumia 1520")
               .elementIsVisible("Nexus 6");
    }
    @Test
    @DisplayName("Проверка отображения добавленных товаров в корзине")
    public void deletedProductsFromCart(){
        mainPage. clickByCard("Samsung galaxy s6")
                .clickBtnAddToCart()
                .clickBtHome()
                . clickByCard("Nokia lumia 1520")
                .clickBtnAddToCart()
                .clickBtHome(). clickByCard("Nexus 6")
                .clickBtnAddToCart()
                .clickBtHome()
                .clickBtnCart()
                .clickBtnDeleted(0)
                .clickBtnDeleted(1)
                .clickBtnDeleted(2)
                .elementIsHidden("Samsung galaxy s6")
                .elementIsHidden("Nokia lumia 1520")
                .elementIsHidden("Nexus 6");
    }
}
