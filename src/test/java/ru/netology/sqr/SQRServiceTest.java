package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'number of numbers that works', 10,15,0,6", "'number of numbers that not works', 9,16,0,0"})
    void runner10(String name, int x, int y, int counter, int expected) {
        SQRService service = new SQRService();

        long actual = service.runner(x,y,counter);


        assertEquals(expected, actual);

    }
}
