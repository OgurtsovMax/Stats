package ru.netology.stats;

public class StatsSevice {

    public int allSales(int[] sales) {

        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public int middleSales(int[] sales) {

        int average = 0;
        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        average = sum / 12;

        return average;
    }


    public int maxSales(int[] sales) {

        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {

            if (sales[i] >= sales[maxMonth]) {

                maxMonth = i;
            }

        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int salesundermiddle(int[] sales) {

        int underaverage = 0;

        for (int sale : sales) {
            if (sale < middleSales(sales)) {
                underaverage++;
            }
        }
        return underaverage;


    }

    public int salesovermiddle(int[] sales) {

        int overaverage = 0;

        for (int sale : sales) {
            if (sale > middleSales(sales)) {
                overaverage++;
            }
        }
        return overaverage;
    }
}






