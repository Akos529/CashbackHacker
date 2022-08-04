package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerTest {

    @Test
    public void shouldCalculateAmount() {
        CashbackHacker amount = new CashbackHacker();
        int purchase = 1500;
        int expected = 500;
        int actual = amount.remain(purchase);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotCalculateAmountWhen1000() {
        CashbackHacker amount = new CashbackHacker();
        int purchase = 1000;
        int expected = 0;
        int actual = amount.remain(purchase);
        assertEquals(actual, expected);


    }
}