package ru.insdev.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    private SelenideElement textLife = $$("[class$='MuiChip-label']")
            .find(exactText("Жизнь"));
    private SelenideElement inssmartIcon = $("[class$='MuiSvgIcon-root jss41']");
    private SelenideElement typoGraphy = $$("[class$='MuiTypography-root MuiTypography-h2']")
            .find(exactText("Страхование ипотеки"));
    private SelenideElement imgMortgageMobile = $("[class$='MuiGrid-root jss43 MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-6']");
    private SelenideElement container = $("[class$='MuiGrid-root flex-center MuiGrid-container']");
    private SelenideElement formInsurance = $("[class$='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-6']");
    private SelenideElement body1 = $$("[class$='MuiTypography-root MuiTypography-body1']")
            .find(exactText("Сравните цены страховки квартиры и жизни при ипотеке для СБЕР и 28 ТОП-банков."));
    private SelenideElement whatInsurance = $("[class$='MuiBox-root jss54']");
    private SelenideElement iconFlat = $$("[class$='MuiSvgIcon-root MuiChip-icon']")
            .first();
    private SelenideElement textFlat = $$("[class$='MuiChip-label']")
            .find(exactText("Квартира"));
    private SelenideElement iconLife = $("[class$='MuiSvgIcon-root MuiChip-icon MuiChip-iconColorPrimary']");

    private SelenideElement iconFlatPlusLife = $("[class$='MuiSvgIcon-root MuiChip-icon']");
    private SelenideElement textFlatPlusLife = $$("[class$='MuiChip-label']")
            .find(exactText("Квартира+Жизнь"));


    public SelenideElement InssmartIcon() {
        return inssmartIcon.shouldBe(visible);
    }

    public SelenideElement TypoGraphy() {
        return typoGraphy.shouldBe(visible);
    }

    public SelenideElement ImgMortgageMobile() {
        return imgMortgageMobile.shouldBe(visible);
    }

    public SelenideElement Container() {
        return container.shouldBe(visible);
    }

    public SelenideElement FormInsurance() {
        return formInsurance.shouldBe(visible);
    }

    public SelenideElement Boby1() {
        return body1.shouldBe(visible);
    }

    public SelenideElement WhatInsurance() {
        return whatInsurance.shouldBe(visible);
    }

    public SelenideElement IconFlat() {
        return iconFlat.shouldBe(visible);
    }

    public SelenideElement TextFlat() {
        return textFlat.shouldBe(visible);
    }

    public SelenideElement IconLife() {
        return iconLife.shouldBe(visible);
    }

    public SelenideElement TextLife() {
        return textLife.shouldBe(visible);
    }

    public SelenideElement IconFlatPlusLife() {
        return iconFlatPlusLife.shouldBe(visible);
    }

    public SelenideElement TextFlatPlusLife() {
        return textFlatPlusLife.shouldBe(visible);
    }


}
