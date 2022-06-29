package ru.insdev.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import ru.insdev.button.Button;
import ru.insdev.data.DataGenerator;
import ru.insdev.formOfInsurance.FormOfInsurance;
import ru.insdev.page.HomePage;
import ru.insdev.promotion.Promotion;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class OthersTest {

    HomePage homePage = new HomePage();
    Button button = new Button();
    Promotion promotion = new Promotion();
    FormOfInsurance formOfInsurance = new FormOfInsurance();
    DataGenerator dataGenerator = new DataGenerator();

    @BeforeEach
    void setup() {
        open("https://widgets.insdev.ru/contract/mortgage/?appId=cd458d6b-08ae-5324-a477-a3cdb5023d51&secret=1844a563-9b8f-5346-a61e-89282ba4eb0a");
    }

    @Test
    void checkAllVisiblePage() {
        homePage.InssmartIcon();
        homePage.TypoGraphy();
        homePage.ImgMortgageMobile();
        homePage.Container();
        homePage.FormInsurance();
        homePage.Boby1();
        homePage.WhatInsurance();
        homePage.IconFlat();
        homePage.TextFlat();

        homePage.IconFlatPlusLife();
        homePage.TextFlatPlusLife();
    }

    @Test
    void checkButtonLife() {
        button.getButtonLifeColor().shouldNotBe(visible);
        button.getButtonLife().click();
        button.getButtonLifeColor().shouldBe(visible);
        button.getButtonFlatPlusLife().click();
        button.getButtonFlatPlusLifeColor().shouldBe(visible);
        button.getButtonLifeColor().shouldNotBe(visible);
    }

    @Test
    void checkButtonFlat() {
        button.getButtonFlatColor().shouldBe(visible);
        button.getButtonLife().click();
        button.getButtonLifeColor().shouldBe(visible);
        button.getButtonFlatColor().shouldNotBe(visible);
        button.getButtonFlat().click();
        button.getButtonFlatColor().shouldBe(visible);
    }

    @Test
    void checkButtonFlatPlusLife() {
        button.getButtonFlatPlusLifeColor().shouldNotBe(visible);
        button.getButtonFlatPlusLife().click();
        button.getButtonFlatPlusLifeColor().shouldBe(visible);
        button.getButtonFlat().click();
        button.getButtonFlatColor().shouldBe(visible);
        button.getButtonFlatPlusLifeColor().shouldNotBe(visible);
    }

    @Test
    void checkAdvertisingPromotion() {
        promotion.getContainerPromotion().shouldBe(visible);
        promotion.getPrecalculation().shouldBe(visible);
        promotion.getImagePrecalculator().shouldBe(visible);
        promotion.getSuitableForDomclick().shouldBe(visible);
        promotion.getImageSuitableForDomclick().shouldBe(visible);
        promotion.getSaving().shouldBe(visible);
        promotion.getImageSaving().shouldBe(visible);
        promotion.getPolisMail().shouldBe(visible);
        promotion.getImagePolisMail().shouldBe(visible);
    }

    @Test
    void checkFormOfInsurance() {
        formOfInsurance.getBankSber().shouldBe(visible);
        formOfInsurance.getBankSber().click();
        formOfInsurance.getBankRaiffeisen().shouldBe(visible);
        formOfInsurance.getBankPrimsoc().click();
        formOfInsurance.getBankPrimsoc().shouldBe(visible);
        formOfInsurance.getGenderFemale().shouldBe(visible);
        formOfInsurance.getFieldSum().shouldBe(visible);
        formOfInsurance.getCheckFieldSum1().shouldBe(visible);
        formOfInsurance.getFieldSum().doubleClick().sendKeys(Keys.DELETE);
        formOfInsurance.getFieldSum().doubleClick().sendKeys(Keys.DELETE);
        formOfInsurance.getFieldSum().doubleClick().sendKeys(Keys.DELETE);
        formOfInsurance.getFieldSum().setValue("9 999 999");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getInsuranceOffers().shouldBe(visible);
    }
}
