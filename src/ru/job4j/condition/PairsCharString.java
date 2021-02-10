package ru.job4j.condition;

//1. Если обе строки пустые - метод должен вернуть true.

//2. Если первая буква первой строки равна последней букве второй строки
// И последняя буква первой строки равна первой букве второй строки - метод должен вернуть true.

//3. Во всех остальных случаях метод должен вернуть false.

public class PairsCharString {

    public static boolean check(String l, String r) {
        if (l.isEmpty() && r.isEmpty()) {
            return true;
        }
        if (r.endsWith(l.substring(0,1)) && l.endsWith(r.substring(0,1))) {
            return true;
        }
        return false;
    }
}
