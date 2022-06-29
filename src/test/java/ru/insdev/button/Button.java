package ru.insdev.button;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Button {

    private SelenideElement buttonLifeColor = $$("[class$='MuiButtonBase-root MuiChip-root jss49 MuiChip-colorPrimary MuiChip-clickableColorPrimary MuiChip-outlined MuiChip-outlinedPrimary MuiChip-clickable']")
            .find(exactText("Жизнь"));
    private SelenideElement buttonLife = $$("[class$='MuiChip-label']")
            .find(exactText("Жизнь"));
    private SelenideElement buttonFlatColor = $$("[class$='MuiButtonBase-root MuiChip-root jss49 MuiChip-colorPrimary MuiChip-clickableColorPrimary MuiChip-outlined MuiChip-outlinedPrimary MuiChip-clickable']")
            .find(exactText("Квартира"));
    private SelenideElement buttonFlat = $$("[class$='MuiChip-label']")
            .find(exactText("Квартира"));
    private SelenideElement buttonFlatPlusLifeColor = $$("[class$='MuiButtonBase-root MuiChip-root jss49 MuiChip-colorPrimary MuiChip-clickableColorPrimary MuiChip-outlined MuiChip-outlinedPrimary MuiChip-clickable']")
            .find(exactText("Квартира+Жизнь"));
    private SelenideElement buttonFlatPlusLife = $$("[class$='MuiChip-label']")
            .find(exactText("Квартира+Жизнь"));

    public SelenideElement getButtonFlatColor() {
        return buttonFlatColor;
    }

    public SelenideElement getButtonFlat() {
        return buttonFlat;
    }

    public SelenideElement getButtonLife() {
        return buttonLife;
    }

    public SelenideElement getButtonLifeColor() {
        return buttonLifeColor;
    }

    public SelenideElement getButtonFlatPlusLifeColor() {
        return buttonFlatPlusLifeColor;
    }

    public SelenideElement getButtonFlatPlusLife() {
        return buttonFlatPlusLife;
    }
}
