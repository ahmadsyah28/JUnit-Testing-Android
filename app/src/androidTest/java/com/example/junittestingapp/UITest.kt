package com.example.junittestingapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class UITest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    /**
     * Test Case 1: Pengujian visibilitas komponen UI
     *
     * Tujuan: Memastikan bahwa semua komponen UI yang diperlukan
     * terlihat dan dapat diakses pengguna
     *
     * Skenario:
     * - Memeriksa apakah EditText untuk angka pertama terlihat
     * - Memeriksa apakah EditText untuk angka kedua terlihat
     * - Memeriksa apakah tombol "Hitung" terlihat
     * - Memeriksa apakah TextView hasil terlihat dan menampilkan teks default
     *
     * Expected result: Semua komponen UI terlihat dan TextView hasil
     * menampilkan teks default
     */
    @Test
    fun testUIComponentsVisibility() {
        // Memeriksa apakah EditText untuk angka pertama terlihat
        onView(withId(R.id.etFirstNumber))
            .check(matches(isDisplayed()))

        // Memeriksa apakah EditText untuk angka kedua terlihat
        onView(withId(R.id.etSecondNumber))
            .check(matches(isDisplayed()))

        // Memeriksa apakah tombol "Hitung" terlihat
        onView(withId(R.id.btnCalculate))
            .check(matches(isDisplayed()))
            .check(matches(withText("Hitung")))

        // Memeriksa apakah TextView hasil terlihat dan menampilkan teks default
        onView(withId(R.id.tvResult))
            .check(matches(isDisplayed()))
            .check(matches(withText("Hasil akan ditampilkan di sini")))
    }

    /**
     * Test Case 2: Pengujian interaksi UI dengan input negatif
     *
     * Tujuan: Memastikan bahwa aplikasi dapat menangani input angka negatif
     * dan melakukan perhitungan dengan benar
     *
     * Skenario:
     * 1. Memasukkan angka negatif "-10" pada kolom angka pertama
     * 2. Memasukkan angka negatif "-5" pada kolom angka kedua
     * 3. Menekan tombol "Hitung"
     * 4. Memeriksa apakah hasil yang ditampilkan adalah "Hasil: -15"
     *    (karena -10 + (-5) = -15)
     *
     * Expected result: TextView hasil menampilkan teks "Hasil: -15" setelah
     * tombol "Hitung" ditekan
     */
    @Test
    fun testNegativeNumbersInput() {
        // Memasukkan angka negatif pada kolom pertama
        onView(withId(R.id.etFirstNumber))
            .perform(typeText("-10"), closeSoftKeyboard())

        // Memasukkan angka negatif pada kolom kedua
        onView(withId(R.id.etSecondNumber))
            .perform(typeText("-5"), closeSoftKeyboard())

        // Menekan tombol hitung
        onView(withId(R.id.btnCalculate))
            .perform(click())

        // Memeriksa hasil yang ditampilkan
        onView(withId(R.id.tvResult))
            .check(matches(withText("Hasil: -15")))
    }
}