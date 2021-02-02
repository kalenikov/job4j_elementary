package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        Assert.assertEquals(92, Fit.manWeight((short) 180), 0.01);
    }

    @Test
    public void whenWoman180Then92() {
        Assert.assertEquals(80.5, Fit.womanWeight((short) 180), 0.01);
    }
}