package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            count += CheckPrimeNumber.check(number) ? 1 : 0;
        }
        return count;
    }
}