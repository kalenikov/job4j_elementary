package ru.job4j.array;

//String[] prizes = {"car", "ticket", "flat", "house"};
//assertEquals("car", RandomDream.random(prizes, 1));
//assertEquals("ticket", RandomDream.random(prizes, 2));
//assertEquals("flat", RandomDream.random(prizes, 3));
//assertEquals("house", RandomDream.random(prizes, 4));
//
//assertEquals("car", RandomDream.random(prizes, 5));
//assertEquals("ticket", RandomDream.random(prizes, 6));
//assertEquals("flat", RandomDream.random(prizes, 7));
//assertEquals("house", RandomDream.random(prizes, 8));

public class RandomDream {

    public static String random(String[] prizes, int num) {
        System.out.println(num % 4);
        return prizes[(num - 1) % prizes.length];
//        return prizes[num - (num - 1) / prizes.length * prizes.length - 1];
    }


}
