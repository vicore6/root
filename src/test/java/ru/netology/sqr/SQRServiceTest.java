package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'number of numbers', 10,0,3", "'number of numbers', 100,0,3"})
    void runner10(String name, int i, int counter, int expected) {
        SQRService service = new SQRService();

        long actual = service.runner(i, counter);

        assertEquals(expected, actual);

    }
}
