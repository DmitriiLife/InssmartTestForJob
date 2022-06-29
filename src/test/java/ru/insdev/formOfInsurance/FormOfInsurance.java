package ru.insdev.formOfInsurance;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class FormOfInsurance {
    private SelenideElement bankSber = $$("[class$='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input']")
            .find(exactText("СБЕРБАНК РОССИИ"));
    private SelenideElement bankRaiffeisen = $$("[class$='MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock']")
            .find(exactText("АО \"РАЙФФАЙЗЕНБАНК\""));
    private SelenideElement bankPrimsoc = $$("[class$='MuiTypography-root MuiListItemText-primary MuiTypography-body1 MuiTypography-displayBlock']")
            .find(exactText("ПАО СКБ ПРИМОРЬЯ \"ПРИМСОЦБАНК\""));
    private SelenideElement genderFemale = $$("[class$='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input']")
            .find(exactText("Женский"));
    private SelenideElement genderMale = $$("[class$='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input']")
            .find(exactText("Мужской"));
    private SelenideElement fieldSum = $("[name$='creditValue']");
    private SelenideElement checkFieldSum1 = $("[value$='3000000']");
    private SelenideElement fieldDate = $("[placeholder$='dd.mm.yyyy']");
    private SelenideElement buttonSeeOffers = $$("[class$='MuiTypography-root MuiTypography-subtitle1']")
            .find(exactText("Посмотреть предложения"));
    private SelenideElement errorSumMax = $$("[class$='MuiTypography-root jss27 MuiTypography-body1']")
            .find(exactText("Значение поля \"Остаток долга по ипотеке\" не должно превышать 30000000"));
    private SelenideElement insuranceOffers = $$("[class$='MuiTypography-root jss73 MuiTypography-h3']")
            .find(exactText("Предложения страховых"));
    private SelenideElement errorSumMin = $$("[class$='MuiTypography-root jss27 MuiTypography-body1']")
            .find(exactText("Значение поля \"Остаток долга по ипотеке\" не должно быть меньше 100000"));
    private SelenideElement errorSumZero = $$("[class$='MuiTypography-root jss27 MuiTypography-body1']")
            .find(exactText("Поле \"Остаток долга по ипотеке\" обязательно для заполнения"));
    private SelenideElement errorDateZero = $$("[class$='MuiFormHelperText-root MuiFormHelperText-contained Mui-error MuiFormHelperText-filled']")
            .find(exactText("Поле \"Дата рождения страхователя\" обязательно для заполнения"));

    public SelenideElement getErrorDateZero() {
        return errorDateZero;
    }

    public SelenideElement getErrorSumZero() {
        return errorSumZero;
    }

    public SelenideElement getErrorSumMin() {
        return errorSumMin;
    }

    public SelenideElement getInsuranceOffers() {
        return insuranceOffers;
    }

    public SelenideElement getErrorSumMax() {
        return errorSumMax;
    }

    public SelenideElement getButtonSeeOffers() {
        return buttonSeeOffers;
    }

    public SelenideElement getFieldDate() {
        return fieldDate;
    }

    public SelenideElement getCheckFieldSum1() {
        return checkFieldSum1;
    }

    public SelenideElement getFieldSum() {
        return fieldSum;
    }


    public SelenideElement getGenderFemale() {
        return genderFemale;
    }

    public SelenideElement getGenderMale() {
        return genderMale;
    }

    public SelenideElement getBankPrimsoc() {
        return bankPrimsoc;
    }

    public SelenideElement getBankRaiffeisen() {
        return bankRaiffeisen;
    }

    public SelenideElement getBankSber() {
        return bankSber;
    }
}
