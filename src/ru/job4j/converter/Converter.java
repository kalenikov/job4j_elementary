package ru.job4j.converter;

//5. Конвертер валюты [#461887]

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int usd = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + usd + " usd.");
    }
}
