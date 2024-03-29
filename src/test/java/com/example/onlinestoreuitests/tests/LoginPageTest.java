package com.example.onlinestoreuitests.tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.github.javafaker.Faker;

public class LoginPageTest extends BaseTest{

    @Test
    @DisplayName("Регистрация и авторизация под ранее зарегистрированным пользователем")
    public void registrationTest(){
        Faker faker = new Faker();
        String userName = faker.name().username()+"1234";
        System.out.println(userName);
        mainPage.clickByButtonSignIn()
                .inputSignLogin(userName)
                .inputSignPass("qwerty")
                .clickByBtnSignUp();
        mainPage.clickByButtonLogIn()
                .clickByButtonLogIn()
                .inputLogin(userName)
                .inputPass("qwerty")
                .clickByBtnLogin()
                .elementIsVisible(userName);
    }
}
