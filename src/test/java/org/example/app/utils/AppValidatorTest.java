package org.example.app.utils;

import org.example.app.App;
import org.example.app.exception.TemperatureException;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AppValidatorTest {

    AppValidator appValidator;
    private final int MINIMUM_TEMPERATURE = -10;
    private final int MAXIMUM_TEMPERATURE = 35;

    @BeforeEach
    void setUp() {
        appValidator = new AppValidator();
    }

    @Test
    @Order(1)
    @DisplayName("Test, valid temperature.")
    void test_Valid_Temperature() {
        int temperatureTest = 10;
        assertDoesNotThrow(() -> appValidator.validateTemperature(temperatureTest));
    }

    @Test
    @Order(2)
    @DisplayName("Test, validity to minimum temperature.")
    void test_Valid_Minimum_Temperature() {
        assertDoesNotThrow(() ->
                appValidator.validateTemperature(MINIMUM_TEMPERATURE));
    }

    @Test
    @Order(3)
    @DisplayName("Test, validity to maximum temperature.")
    void test_Valid_Maximum_Temperature() {
        assertDoesNotThrow(() ->
                appValidator.validateTemperature(MAXIMUM_TEMPERATURE));
    }

    @Test
    @Order(4)
    @DisplayName("Test, equals to minimum temperature.")
    void test_Equals_Minimum_Temperature() {
        int testMINTemp = MINIMUM_TEMPERATURE;
        assertEquals(testMINTemp, MINIMUM_TEMPERATURE);
    }

    @Test
    @Order(5)
    @DisplayName("Test, equals to maximum temperature.")
    void test_Equals_Maximum_Temperature() {
        int testMaxTemp = MAXIMUM_TEMPERATURE;
        assertEquals(testMaxTemp, MAXIMUM_TEMPERATURE);
    }

    @Test
    @Order(6)
    @DisplayName("Test, invalid temperature.")
    void test_Invalid_Temperature() {
        int temperatureTest = 100;
        String temperatureError = "Invalid temperature";
        assertThrows(TemperatureException.class, () ->
                appValidator.validateTemperature(temperatureTest),temperatureError);
    }

    @AfterEach
    void tearDown() {
        appValidator = null;
    }
}