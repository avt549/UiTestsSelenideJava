package com.example.onlinestoreuitests.tests;


import org.junit.jupiter.api.*;


public class MainPageTest extends BaseTest {

    @Test
    @DisplayName("Покупка товара")
    public void search() {
        //нажать на кнопку "LogIn"
        mainPage.clickByButtonLogIn()
        //ввести логин
                .inputLogin()
        //ввести пароль
                .inputPass()
        //Нажать на кнопку LogIn
                .clickByBtnLogin()
        //нажать нв кнопку Phones
                .clickBuBtnPhones()
        //нажать на картинку Samsung galaxy s6
                .clickByCard("Samsung galaxy s6")
        //нажать на кнопку "Add to cart"
                .clickBtnAddToCart()
        //в диалоговом окне нажать на кнопку ОК
                .clickBtnOk()
        //нажать на кнопку Cart
                .clickBtnCart()
        //нажать на кнопку Place Order
                .clickBtnPlaceOrder()
        //заполнить поле Name
                .inputName("Andrey")
        //заполнить поле Country
                .inputCountry("Russia")
        //заполнить поле City
                .inputCity("Spb")

        //заполнить поле Credit card
                .inputCreditCard("1231 1231 1213 1231")
        //заполнить поле Month
                .inputMonth("month")
        //заполнить поле Year
                .inputYear("2022")
        //нажать на кнопку Purchase
                .clickBtnPurchase();
        //проверить содержание окна с благодарностью за заказ






    }

}
