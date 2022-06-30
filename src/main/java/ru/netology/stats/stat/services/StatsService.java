package ru.netology.stats.stat.services;

public class StatsService {
    public long amountOfAll(int[] stat) {
        int amount = 0;
        for (int i = 0; i < stat.length; i++) {
            amount += stat[i];
        }
        return amount;

    }

    public long amountAverage(int[] stat) {
        int amount = 0;
        for (int i = 0; i < stat.length; i++) {
            amount += stat[i];
        }
        return amount / stat.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int amountDownAverage(int[] sales) {

        StatsService service = new StatsService();
        long average = service.amountAverage(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int amountUpAverage(int[] sales) {

        StatsService service = new StatsService();
        long average = service.amountAverage(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }
}
