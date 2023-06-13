package at.technikum.abschlussarbeit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcControllerTest {
    @Test
    void getSumTest(){
        int number = 1111;
        assertEquals(4,CalcController.getSum(number));
    }

    @Test
    void getUsage() {
        CalcController.getSum(1111);
        CalcController.getSum(1234);
        int expected = 2;
        assertEquals(expected, CalcController.getUsage());
    }

}