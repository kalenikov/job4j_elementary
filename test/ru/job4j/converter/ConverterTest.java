package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        Assert.assertEquals(2, Converter.rubleToEuro(140));
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        Assert.assertEquals(3, Converter.rubleToDollar(180));
    }
}