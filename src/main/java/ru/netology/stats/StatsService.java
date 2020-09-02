package ru.netology.stats;

import java.util.ArrayList;
import java.util.List;

public class StatsService {

    public long findSum(long[] purchases) {

        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long findMax(long[] purchases) {

        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public long findMin(long[] purchases) {

        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }

    public long findMiddle(long[] purchases) {
        long result = 0;
        long sum = findSum(purchases);
        result = sum / purchases.length;
        return result;
    }

    public ArrayList<Integer> findMinPurchasesMonth(long[] purchases) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        long min = findMin(purchases);
        for (Integer i = 0; i < purchases.length; i++) {
            long currentMonthPurchases = purchases[i];
            if (currentMonthPurchases == min) {
                result.add(i);
            }
        }
        return result;
    }

    public ArrayList<Integer> findMaxPurchasesMonth(long[] purchases) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        long max = findMax(purchases);
        for (Integer i = 0; i < purchases.length; i++) {
            long currentMonthPurchases = purchases[i];
            if (currentMonthPurchases == max) {
                result.add(i);
            }
        }
        return result;
    }

   public int findLowerMiddleMonthCount(long[] purchases) {
        int result = 0;
        long mid = findMiddle(purchases);
        for (long purchase : purchases) {
            if (purchase < mid ) {
                result = result + 1;
            }
        }
        return result;
    }
    public int findHigherMiddleMonthCount(long[] purchases) {
        int result = 0;
        long mid = findMiddle(purchases);
        for (long purchase : purchases) {
            if (purchase > mid ) {
                result = result + 1;
            }
        }
        return result;
    }
}
