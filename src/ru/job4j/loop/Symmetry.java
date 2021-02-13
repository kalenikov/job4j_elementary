package ru.job4j.loop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Symmetry {
    public static void main(String[] args) {
        boolean check = Symmetry.check(12301);
        assertThat(check, is(false));

        boolean check1 = Symmetry.check(1112111);
        assertThat(check1, is(true));
    }

    public static boolean check(int i) {
        StringBuilder sb = new StringBuilder(Integer.toString(i));
//        System.out.println(sb.toString());
//        System.out.println(sb.toString());
//        String rev = sb.reverse().toString();
//        System.out.println(rev.toString());

        return sb.reverse().toString().equals(sb.reverse().toString());
    }
}
