package ru.netology.stats;

public class StatsService {

    //Расчёт общей суммы продаж за все месяцы

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }


    //Нахождение месяца с максимальной суммой продаж

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[maxMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }


    //Нахождение месяца с минимальной суммой продаж

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    //Нахождение среднего значения в месяц

    public int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }


    //Кол-во месяцев, в которых продажи были ниже среднего

    public int calculateUnder(int[] sales) {
        int month = 0;
        int average = calculateAverage(sales);
        for (int sale : sales) {
            if (sale < average) {
                month = month + 1;
            }
        }
        return month;
    }


    //Кол-во месяцев, в которых продажи были выше среднего
    public int calculateOver(int[] sales) {
        int month = 0;
        int average = calculateAverage(sales);
        for (int sale : sales) {
            if (sale > average) {
                month = month + 1;
            }
        }
        return month;
    }


}
