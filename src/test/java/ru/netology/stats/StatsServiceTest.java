package ru.netology.stats;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void findSum() {
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService service = new StatsService();

        System.out.println(service.findSum(purchases));
    }

    @Test
    void findMax() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;
        long actual = service.findMax(purchases);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void findMin() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 7;
        long actual = service.findMin(purchases);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void findMiddle() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.findMiddle(purchases);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void findMinPurchasesMonth() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        Integer[] expected = {8};
        ArrayList<Integer> actual = service.findMinPurchasesMonth(purchases);

        assertArrayEquals(expected, actual.toArray(new Integer[actual.size()]));
        System.out.println(actual);
    }

    @Test
    void findMaxPurchasesMonth() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        Integer[] expected = {5, 7};
        ArrayList<Integer> actual = service.findMaxPurchasesMonth(purchases);

        assertArrayEquals(expected, actual.toArray(new Integer[actual.size()]));
        System.out.println(actual);
    }

    @Test
    void findLowerMiddleMonthCount() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.findLowerMiddleMonthCount(purchases);

        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void findHigherMiddleMonthCount() {
        StatsService service = new StatsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.findHigherMiddleMonthCount(purchases);

        assertEquals(expected, actual);
        System.out.println(actual);
    }
}


