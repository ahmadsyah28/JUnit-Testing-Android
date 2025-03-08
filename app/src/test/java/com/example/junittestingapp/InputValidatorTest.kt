package com.example.junittestingapp

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class InputValidatorTest {

    private val inputValidator = InputValidator()

    /**
     * Test Case 1: Pengujian validasi angka (isValidNumber)
     *
     * Tujuan: Memastikan bahwa fungsi isValidNumber() dapat menentukan dengan benar
     * apakah sebuah string merupakan angka yang valid
     *
     * Skenario:
     * - Menguji angka positif ("123") - seharusnya valid
     * - Menguji angka negatif ("-123") - seharusnya valid
     * - Menguji string kosong ("") - seharusnya tidak valid
     * - Menguji string yang berisi karakter non-angka ("123a") - seharusnya tidak valid
     * - Menguji string dengan format yang salah ("--123") - seharusnya tidak valid
     *
     * Expected result: Fungsi mengembalikan true untuk angka valid dan false untuk input tidak valid
     */
    @Test
    fun testIsValidNumber() {
        // Test case untuk angka positif
        assertTrue(inputValidator.isValidNumber("123"))

        // Test case untuk angka negatif
        assertTrue(inputValidator.isValidNumber("-123"))

        // Test case untuk string kosong
        assertFalse(inputValidator.isValidNumber(""))

        // Test case untuk string dengan karakter non-angka
        assertFalse(inputValidator.isValidNumber("123a"))

        // Test case untuk string dengan format yang salah
        assertFalse(inputValidator.isValidNumber("--123"))
    }

    /**
     * Test Case 2: Pengujian validasi email (isValidEmail)
     *
     * Tujuan: Memastikan bahwa fungsi isValidEmail() dapat menentukan dengan benar
     * apakah sebuah string merupakan format email yang valid
     *
     * Skenario:
     * - Menguji email dengan format valid ("user@example.com") - seharusnya valid
     * - Menguji email dengan subdomain ("user@sub.example.com") - seharusnya valid
     * - Menguji email tanpa nama domain ("user@") - seharusnya tidak valid
     * - Menguji email tanpa @ ("userexample.com") - seharusnya tidak valid
     * - Menguji string kosong ("") - seharusnya tidak valid
     *
     * Expected result: Fungsi mengembalikan true untuk email valid dan false untuk email tidak valid
     */
    @Test
    fun testIsValidEmail() {
        // Test case untuk email valid
        assertTrue(inputValidator.isValidEmail("user@example.com"))

        // Test case untuk email dengan subdomain
        assertTrue(inputValidator.isValidEmail("user@sub.example.com"))

        // Test case untuk email tanpa nama domain
        assertFalse(inputValidator.isValidEmail("user@"))

        // Test case untuk email tanpa @
        assertFalse(inputValidator.isValidEmail("userexample.com"))

        // Test case untuk string kosong
        assertFalse(inputValidator.isValidEmail(""))
    }
}