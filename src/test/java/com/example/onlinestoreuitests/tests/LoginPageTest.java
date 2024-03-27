package com.example.onlinestoreuitests.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;


import java.sql.SQLOutput;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

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
