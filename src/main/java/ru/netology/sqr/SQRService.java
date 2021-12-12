package ru.netology.sqr;

public class SQRService {
    public long runner(int counter, int x, int y) {
        counter = 0;
        for (int i = x; i >= 10; i++) {
            for (int j = y; j <= 99; j++)
                if (i * i >= 100 && i * i <= 250)
                    if (j * j >= 100 && j * j <= 250) {
                        counter++;
                    }
                return counter;
        }
        return counter;
    }
}