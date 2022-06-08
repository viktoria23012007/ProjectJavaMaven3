package ru.netology.sqr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @DisplayName("Should count squares quantity")
    @ParameterizedTest(name = "#{index} - {0} [{1} - {2}]")
    @CsvSource(
            value = {
                    "middle range, 200, 300, 3",
                    "full range , 0, 10000, 90",
                    "null range, 401, 440, 0",
                    "under limit, 0, 99, 0",
                    "over limit, 9802, 10000, 0",
                    "lower limit, 100, 100, 1",
                    "upper limit, 9801, 9801, 1"
            }
    )

    void shouldCountSquares(String name, int lowerLimit, int upperLimit, int expected) {
        SQRService sqr = new SQRService();

        int actual = sqr.countSquares(lowerLimit, upperLimit);

        assertEquals(expected, actual);
    }
}


