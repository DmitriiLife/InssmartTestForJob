package ru.insdev.promotion;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Promotion {

    private SelenideElement containerPromotion = $("[class$='MuiGrid-root jss44 MuiGrid-container MuiGrid-spacing-xs-3']");
    private SelenideElement precalculation = $$("[class$='MuiTypography-root jss45 MuiTypography-body1']")
            .find(exactText("Предрасчет цены за 5 секунд"));
    private SelenideElement imagePrecalculator = $("[id$='clip0_4936_4100']");
    private SelenideElement suitableForDomclick = $$("[class$='MuiTypography-root jss45 MuiTypography-body1']")
            .find(exactText("Подходит для Домклик"));
    private SelenideElement imageSuitableForDomclick = $("[id$='clip0_4936_4107']");
    private SelenideElement saving = $$("[class$='MuiTypography-root jss45 MuiTypography-body1']")
            .find(exactText("Экономия до 30%"));
    private SelenideElement imageSaving = $("[class$='MuiSvgIcon-root']");
    private SelenideElement polisMail = $$("[class$='MuiTypography-root jss45 MuiTypography-body1']")
            .find(exactText("Полис придет на email после оплаты"));
    private SelenideElement imagePolisMail = $("[id$='clip0_4936_4110']");

    public SelenideElement getContainerPromotion() {
        return containerPromotion;
    }

    public SelenideElement getPrecalculation() {
        return precalculation;
    }

    public SelenideElement getImagePrecalculator() {
        return imagePrecalculator;
    }

    public SelenideElement getSuitableForDomclick() {
        return suitableForDomclick;
    }

    public SelenideElement getImageSuitableForDomclick() {
        return imageSuitableForDomclick;
    }

    public SelenideElement getSaving() {
        return saving;
    }

    public SelenideElement getImageSaving() {
        return imageSaving;
    }

    public SelenideElement getPolisMail() {
        return polisMail;
    }

    public SelenideElement getImagePolisMail() {
        return imagePolisMail;
    }
}
