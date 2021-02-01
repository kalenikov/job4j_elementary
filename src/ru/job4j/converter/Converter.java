package ru.job4j.converter;

//5. Конвертер валюты [#461887]

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int inUsd = 180;
        int expectedUsd = 3;
        int outUsd = Converter.rubleToDollar(inUsd);
        boolean passedUsd = expectedUsd == outUsd;
        System.out.println("180 rubles are 3. Test result : " + passedUsd);
    }
}
