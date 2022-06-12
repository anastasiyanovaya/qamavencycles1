package ru.netology.sqr;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void shouldCount() {
        SQRService service = new SQRService();
        int actual = service.countSqr(200, 300);
        int excpected = 3;

        assertEquals(excpected, actual);
    }

    @Test
    public void shouldCountUp() {
        SQRService service = new SQRService();
        int actual = service.countSqr(300, 200);
        int excpected = 0;

        assertEquals(excpected, actual);
    }

    @Test
    public void shouldCountDown() {
        SQRService service = new SQRService();
        int actual = service.countSqr(300, 300);
        int excpected = 0;

        assertEquals(excpected, actual);
    }

    @Test
    public void shouldCountValues() {
        SQRService service = new SQRService();
        int actual = service.countSqr(300, 1_000);
        int excpected = 14;

        assertEquals(excpected, actual);
    }
}
