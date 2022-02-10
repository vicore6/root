package ru.netology.sqr;

public class SQRService {

    public int rangeBoundaries(int lowerRange, int upperRange) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerRange && i * i <= upperRange) {
                count++;
            }
        }
        return count;
    }
}