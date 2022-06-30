package ru.netology.stats.stat.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {
    @Test
    public void shouldCalculateAll() {
        StatsService service = new StatsService();
        int[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 180;
        long actual = service.amountOfAll(stat);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 15;
        long actual = service.amountAverage(stat);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        int[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 8;
        long actual = service.maxSales(stat);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        int[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 9;
        long actual = service.minSales(stat);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalculateDownAverage() {
        StatsService service = new StatsService();
        int[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 5;
        long actual = service.amountDownAverage(stat);
        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCalculateUpAverage() {
        StatsService service = new StatsService();
        int[] stat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expect = 5;
        long actual = service.amountUpAverage(stat);
        Assertions.assertEquals(expect, actual);
    }
}
