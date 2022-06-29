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

public class DateFieldTest {

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
    void checkFormOfInsuranceFieldDataZeros() {
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
        formOfInsurance.getFieldSum().setValue("9_000_000");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String data = "00.00.0000";
        formOfInsurance.getFieldDate().setValue(data);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorDateZero().shouldBe(visible);
    }

    @Test
    void checkFormOfInsuranceFieldDataNines() {
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
        formOfInsurance.getFieldSum().setValue("9_000_000");
        formOfInsurance.getFieldDate().shouldBe(visible);
        String data = "99.99.9999";
        formOfInsurance.getFieldDate().setValue(data);
        formOfInsurance.getButtonSeeOffers().shouldBe(visible);
        formOfInsurance.getButtonSeeOffers().click();
        formOfInsurance.getErrorDateZero().shouldBe(visible);
    }
}
