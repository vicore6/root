package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldRangeBoundariesValid() {
        SQRService sqrService = new SQRService();
        int expected = 3;
        int actual = sqrService.rangeBoundaries(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRangeBoundariesInvalid() {
        SQRService sqrService = new SQRService();
        int expected = 0;
        int actual = sqrService.rangeBoundaries(0, 0);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRangeBoundariesMax() {
        SQRService sqrService = new SQRService();
        int expected = 90;
        int actual = sqrService.rangeBoundaries(100, 1_000_000);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldRangeBoundariesMin() {
        SQRService sqrService = new SQRService();
        int expected = 1;
        int actual = sqrService.rangeBoundaries(100, 100);
        assertEquals(expected, actual);
    }
}
