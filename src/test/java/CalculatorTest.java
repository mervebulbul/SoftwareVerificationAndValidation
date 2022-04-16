/*
StudentId       : b211202350
Name            : Merve
Surname         : Bülbül
Course Name     : Software verification and validation
Homework 2
GitHub address  : https://github.com/mervebulbul
Repository address:https://github.com/mervebulbul/SoftwareVerificationAndValidation
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

   @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"24, 12, 2", "4, 4, 1", "10, 2, 5", "8, 4, 2", "5, 2, 2.5"})
    void dataDrivenDivide(double a, double b, double expectedValue) {

        assertEquals(expectedValue, Calculator.divide(a, b),
                "The result of Calculator.divide method is incorrect.");

    }


    @Test
    void testDivision1(){
        assertEquals(2, Calculator.divide(24,12));
    }

    @Test
    void testDivision2(){
        assertEquals(1, Calculator.divide(4,4));

    }

    @Test
    void testDivision3(){
        assertEquals(5, Calculator.divide(10,2));

    }

    @Test
    void testDivision4(){
        assertEquals(2, Calculator.divide(8,4));

    }

    @Test
    void testDivision5(){
        assertEquals(2.5, Calculator.divide(5,2));

    }

    @Test
    void testDivision6(){
        Exception exception = assertThrows(
                IllegalArgumentException.class,
                () -> Calculator.divide(10, 0),
                "Should see IllegalArgumentException"
        );
    }

}