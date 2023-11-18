package ru.netology.data;


import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.lang.Math;

public class DataHelper {
    private static final Faker faker = new Faker(new Locale("en"));

    private DataHelper() {
    }

    public static String getApprovedCard() {
        return "4444 4444 4444 4441";
    }

    public static String getDeclinedCard() {
        return "4444 4444 4444 4442";
    }

    public static String getFakeNumber() {
        return faker.numerify("0000 0000 0000 0000");
    }

    public static String getDigitsThree() {
        return faker.numerify("###");
    }

    public static String getZeroTwo() {
        return "00";
    }

    public static String getZeroThree() {
        return "000";
    }

    public static String getShiftedYear(int yearCount) {
        return LocalDate.now().plusYears(yearCount).format(DateTimeFormatter.ofPattern("yy"));
    }

    public static String getMonth() {
        LocalDate currentData = LocalDate.now();
        return currentData.format(DateTimeFormatter.ofPattern("MM"));
    }

    public static String getMonthMoreTwelve() {
        int currentMonth = Integer.parseInt(getMonth());
        int moreMonth = currentMonth + 12;
        return String.format("%02d", moreMonth % 100);
    }

    public static String getHolder() {
        return faker.name().firstName() + faker.name().lastName();
    }

    public static String getHolderCyrillic() {
        Faker faker = new Faker(new Locale("ru"));
        return faker.name().firstName() + faker.name().lastName();
    }

    public static String getHolderWithNumbers() {
        return faker.name().firstName() + faker.numerify("#####");
    }

    public static String getHolderWithInvalidSymbol() {
        return faker.name().firstName() + ":*;!)";
    }


    public static String getHolderArabic() {
        return  "بتروف ياكوف";
    }

    public static String getHolderHieroglyph() {
        return  "彼得罗夫*雅科夫";

    }
}