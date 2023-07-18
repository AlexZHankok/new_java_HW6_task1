package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test //Сумма продаж за год
    public void shouldSum() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sum(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test //Средняя сумма продаж в месяц
    public void shouldAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.average(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxSales() { //Номер месяца с пиком продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinSales() { //Номер месяца с миниммум продаж
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinAverage() { //Количество месяцев, в которых продажи были ниже среднего
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 5;
        long actual = service.amountMonthUnderAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxAverage() { //Количество месяцев, в которых продажи были ниже среднего
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        int expected = 5;
        long actual = service.amountMonthUppAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}
