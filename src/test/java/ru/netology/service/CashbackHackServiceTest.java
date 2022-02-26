package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBelowLimit() {

        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);
    }

    @Test
    public void Limit() {

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldAboveLimit() {

        int amount = 1600;
        int actual = service.remain(amount);
        int expected = 400;

        assertEquals(actual, expected);
    }
}