package pl.javastart.euler2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Euler2Test {

    private Euler2 euler2 = new Euler2();

    @ParameterizedTest
    @CsvSource(value = {"9, 10 ","10, 10","11, 10" ,"34, 44", "4000000, 4613732" })
    void shouldReturn10ForLimit10(int limit, int expected) {

        //when
        int result = euler2.countFibonacci(limit);

        //then
        assertEquals(expected, result );
    }
}