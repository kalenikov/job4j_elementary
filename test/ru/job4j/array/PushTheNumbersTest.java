package ru.job4j.array;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class PushTheNumbersTest {

    @Test
    public void testWith51() {
        int[][] array = {
                {1,  2,  3,  4,  5},
                {6,  7,  8,  9,  10,},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        PushTheNumbers.push(array, 2, 3);
        int[][] expected = {
                {1,  2,  3,  9,  5},
                {6,  7,  8,  14,  10,},
                {12, 13, 14, 0,  14},
                {16, 17, 18, 14, 20},
                {21, 22, 23, 19, 25},
        };
        assertThat(array, is(expected));
    }


        @Test
    public void testWith52() {
        int[][] array = {
            {1,  2,  3,  4,  5},
            {6,  7,  8,  9,  10,},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25},
        };
        PushTheNumbers.push(array, 2, 2);
        int[][] expected = {
                {1,  2,  8,  4,  5},
                {6,  7,  13, 9,  10,},
                {12, 13,  0, 13, 14},
                {16, 17, 13, 19, 20},
                {21, 22, 18, 24, 25},
        };
        assertThat(array, is(expected));
    }

    @Test
    public void testWith3() {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        PushTheNumbers.push(array, 2, 1);
        int[][] expected = {
                {1, 6, 3, 4},
                {5, 10, 7, 8},
                {10, 0, 10, 11},
                {13, 10, 15, 16},
        };
        assertThat(array, is(expected));
    }

//    @Test
//    public void myTest() {
//        int[][] array = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16},
//
//        };
//        PushTheNumbers.push(array, 3, 1);
//        int[][] expected = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 0, 14, 15},
//
//        };
//        assertThat(array, is(expected));
//    }

    @Test
    public void testWithArray5To5() {
        int[][] array = {
                {62, 12, 86, 96, 2},
                {78, 98, 10, 45, 86},
                {82, 59, 47, 88, 79},
                {99, 10, 91, 73, 88},
                {32, 48, 8, 87, 55}
        };
        PushTheNumbers.push(array, 2, 2);
        int[][] expected = {
                {62, 12, 10, 96, 2},
                {78, 98, 47, 45, 86},
                {59, 47, 0, 47, 88},
                {99, 10, 47, 73, 88},
                {32, 48, 91, 87, 55}
        };
        assertThat(array, is(expected));
    }

    @Test
    public void testWithArray4To4() {
        int[][] array = {
                {29, 29, 48, 92},
                {90, 58, 7, 57},
                {87, 36, 21, 19},
                {93, 55, 60, 89}
        };
        PushTheNumbers.push(array, 3, 1);
        int[][] expected = {
                {29, 58, 48, 92},
                {90, 36, 7, 57},
                {87, 55, 21, 19},
                {55, 0, 55, 60}
        };
        assertThat(array, is(expected));
    }
}