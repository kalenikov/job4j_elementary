package ru.job4j.array;

public class Initials {
    public static String convert(String[] fio) {
        return fio[0] + " " + fio[1].substring(0,1)  + "."+ fio[2].substring(0,1) + ".";

    }
}