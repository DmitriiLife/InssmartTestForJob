package ru.insdev.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataGenerator {

    public static String getDate(int minusYears) {
        return LocalDate.now().minusYears(minusYears).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}
