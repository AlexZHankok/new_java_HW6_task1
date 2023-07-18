package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) { //Сумма продаж за год
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long average(long[] sales) { //Средняя сумма продаж в месяц
        return sum(sales) / 12;
    }

    public int maxSales(long[] sales) { //Номер месяца с пиком продаж
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

    public int minSales(long[] sales) { //Номер месяца с миниммум продаж
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int amountMonthUnderAverage(long[] sales) { //Количество месяцев, в которых продажи были ниже среднего
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    public int amountMonthUppAverage(long[] sales) { //Количество месяцев, в которых продажи были выше среднего
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }

}

