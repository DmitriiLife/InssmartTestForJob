package ru.insdev.test;

import com.codeborne.selenide.logevents.SelenideLogger;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import ru.insdev.data.DataGenerator;
import ru.insdev.formOfInsurance.FormOfInsurance;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class SumFieldTest {

    FormOfInsurance formOfInsurance = new FormOfInsurance();

    @BeforeEach
    void setup() {
        open("https://widgets.insdev.ru/contract/mortgage/?appId=cd458d6b-08ae-5324-a477-a3cdb5023d51&secret=1844a563-9b8f-5346-a61e-89282ba4eb0a");
    }

    @Test
    void checkFormOfInsuranceMaxSumFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("30_000_000");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getInsuranceOffers().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceOverMaxSumFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("30_000_001");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumMax().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceLessMinSumFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("99_999");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumMin().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceLessingMinSumFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("-1");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumMin().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceSymbolsFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("!@#!#!#!#)(*&^%$#$%^&");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumZero().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceBooleanFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("TRUE");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumZero().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceStringFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("Сто тысяч");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumZero().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceNullFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("Null");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumZero().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceEmptyFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumZero().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceSpaceFieldSum() {
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
        formOfInsurance.getFieldSum().setValue(" ");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumZero().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceFractionFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("0.1");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumMin().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceZeroFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("0");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumMin().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceOneFieldSum() {
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
        formOfInsurance.getFieldSum().setValue("1");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String date = DataGenerator.getDate(18);
        formOfInsurance.getFieldDate().setValue(date);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorSumMin().shouldBe(visible);
    }
}
