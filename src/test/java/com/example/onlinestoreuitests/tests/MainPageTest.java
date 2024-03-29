package com.example.onlinestoreuitests.tests;
import org.junit.jupiter.api.*;

public class MainPageTest extends BaseTest {

    @Test
    @DisplayName("Покупка товара")
    public void search() {
        mainPage.clickBuBtnPhones()
                .clickByCard("Samsung galaxy s6")
                .clickBtnAddToCart();
                mainPage.clickBtnOk()
                .clickBtnCart()
                .clickBtnPlaceOrder()
                .inputName("Andrey")
                .inputCountry("Russia")
                .inputCity("Spb")
                .inputCreditCard("1231 1231 1213 1231")
                .inputMonth("month")
                .inputYear("2022")
                .clickBtnPurchase();
    }
}
