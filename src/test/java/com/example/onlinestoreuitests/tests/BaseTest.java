package com.example.onlinestoreuitests.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.onlinestoreuitests.pages.MainPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.manager.SeleniumManager;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    MainPage mainPage = new MainPage();

    @BeforeAll
    public static void setUpAll() {
        SeleniumManager.getInstance();
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
       open("https://www.demoblaze.com/");
    }

}
