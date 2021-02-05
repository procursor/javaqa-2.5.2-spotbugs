package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {
    long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

    StatisticsService service = new StatisticsService();

    @Test
    void findMax() {
        long actual = service.findMax(incomesInBillions);

        assertEquals(12, actual);
    }
}