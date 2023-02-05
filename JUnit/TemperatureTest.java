package Assignments.JUnit;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {

    Temperature myTemp = new Temperature();

    double celsius = 10;
    double fahrenheit = 50;

    double celsius2 = 20;
    double fahrenheit2 = 68;

    double marginError = 0.01;

    @org.junit.jupiter.api.Test
    void toFahrenheit() {

        assertEquals(fahrenheit,myTemp.toFahrenheit(celsius),marginError);
        assertEquals(fahrenheit2,myTemp.toFahrenheit(celsius2),marginError);

    }

    @org.junit.jupiter.api.Test
    void toCelsius() {

        assertEquals(celsius,myTemp.toCelsius(fahrenheit), marginError);
        assertEquals(celsius2,myTemp.toCelsius(fahrenheit2),marginError);

    }

}