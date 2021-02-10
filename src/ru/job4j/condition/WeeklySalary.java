package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int rsl = 0;
        for (int day = 0; day < hours.length; day++) {
            float daySalary = 0;
            for (int hour = 1; hour <= hours[day]; hour++) {
                if (hour <= 8) {
                    daySalary += 10;
                } else {
                    daySalary += 15;
                }
            }
            if (day >= 5) {
                daySalary *= 2;
            }
            rsl += daySalary;
        }
        return rsl;
    }
}
