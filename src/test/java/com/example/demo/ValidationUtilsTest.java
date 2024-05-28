package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ValidationUtilsTest {

    @Test
    public void givenNonEmptyString_whenIsNotNullOrEmpty_thenTrue() {
        assertTrue(ValidationUtils.isNotNullOrEmpty("Hello"));
    }

    @Test
    public void givenNullString_whenIsNotNullOrEmpty_thenFalse() {
        assertFalse(ValidationUtils.isNotNullOrEmpty(null));
    }

    @Test
    public void givenEmptyString_whenIsNotNullOrEmpty_thenFalse() {
        assertFalse(ValidationUtils.isNotNullOrEmpty(""));
    }

    @Test
    public void givenWhitespaceString_whenIsNotNullOrEmpty_thenFalse() {
        assertFalse(ValidationUtils.isNotNullOrEmpty("   "));
    }

    @Test
    public void givenNumericString_whenIsNumeric_thenTrue() {
        assertTrue(ValidationUtils.isNumeric("123"));
    }

    @Test
    public void givenNonNumericString_whenIsNumeric_thenFalse() {
        assertFalse(ValidationUtils.isNumeric("abc"));
    }

    @Test
    public void givenNullString_whenIsNumeric_thenFalse() {
        assertFalse(ValidationUtils.isNumeric(null));
    }

    @Test
    public void givenMixedString_whenIsNumeric_thenFalse() {
        assertFalse(ValidationUtils.isNumeric("123abc"));
    }

    @Test
    public void givenPositiveNumber_whenIsPositive_thenTrue() {
        assertTrue(ValidationUtils.isPositive(5));
    }

    @Test
    public void givenNegativeNumber_whenIsPositive_thenFalse() {
        assertFalse(ValidationUtils.isPositive(-5));
    }

    @Test
    public void givenZero_whenIsPositive_thenFalse() {
        assertFalse(ValidationUtils.isPositive(0));
    }

    @Test
    public void givenNumberInRange_whenIsInRange_thenTrue() {
        assertTrue(ValidationUtils.isInRange(5, 1, 10));
    }

    @Test
    public void givenNumberBelowRange_whenIsInRange_thenFalse() {
        assertFalse(ValidationUtils.isInRange(0, 1, 10));
    }

    @Test
    public void givenNumberAtUpperBound_whenIsInRange_thenTrue() {
        assertTrue(ValidationUtils.isInRange(10, 1, 10));
    }

    @Test
    public void givenNumberAboveRange_whenIsInRange_thenFalse() {
        assertFalse(ValidationUtils.isInRange(11, 1, 10));
    }
}
