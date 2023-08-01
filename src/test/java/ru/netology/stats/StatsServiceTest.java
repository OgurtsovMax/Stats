package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test

    public void shouldAllSales() {

        StatsSevice service = new StatsSevice();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.allSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test

    public void shouldMiddleSalesInMonth() {

        StatsSevice service = new StatsSevice();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMiddle = 15;
        int actualMiddle = service.middleSales(sales);

        Assertions.assertEquals(expectedMiddle, actualMiddle);
    }


@Test

    public void shouldMaxSalesInMonth(){

        StatsSevice service = new StatsSevice();

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    int expectedMaxmonth = 8;
    int actualMaxmonth = service.maxSales(sales);

    Assertions.assertEquals(expectedMaxmonth, actualMaxmonth);

}

    @Test

    public void shouldMinMonthSales() {

        StatsSevice service = new StatsSevice();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


@Test
    public void shouldSalesMonthUnderMiddle(){

    StatsSevice service = new StatsSevice();

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    int expectedundermonth = 5;
    int actualundermonth = service.salesundermiddle(sales);

    Assertions.assertEquals(expectedundermonth, actualundermonth);


}

@Test
    public void shouldSalesMonthOverMiddle(){

        StatsSevice service = new StatsSevice();

    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    int expectedovermonth = 5;
    int actualovermonth = service.salesovermiddle(sales);

    Assertions.assertEquals(expectedovermonth,actualovermonth);


}
}





















