package ru.netology.sqr;

public class SQRService {
    public int runner(int counter, int i) {
        counter = 0;
        for (i = 10; i < 99; i++)
            if (i * i >= 100 && i * i <= 250) {
                counter++;
            }
        return counter;
    }
}


