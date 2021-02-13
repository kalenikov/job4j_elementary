package ru.job4j.array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
      String text = String.valueOf(string);
      return text.toUpperCase().toCharArray();
    }
}