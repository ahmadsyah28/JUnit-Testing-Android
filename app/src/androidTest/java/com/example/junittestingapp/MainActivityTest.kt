package com.example.junittestingapp

import android.view.View
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    /**
     * Test Case 1: Pengujian penambahan dua angka melalui UI
     *
     * Tujuan: Memastikan bahwa aplikasi dapat menerima input dari pengguna melalui UI,
     * melakukan perhitungan, dan menampilkan hasil dengan benar
     *
     * Skenario:
     * 1. Memasukkan angka 5 pada kolom angka pertama
     * 2. Memasukkan angka 3 pada kolom angka kedua
     * 3. Menekan tombol "Hitung"
     * 4. Memeriksa apakah hasil yang ditampilkan adalah "Hasil: 8"
     *
     * Expected result: TextView hasil menampilkan teks "Hasil: 8" setelah
     * tombol "Hitung" ditekan
     */
    @Test
    fun testAddTwoNumbersUI() {
        // Memasukkan angka pertama
        onView(withId(R.id.etFirstNumber))
            .perform(typeText("5"), closeSoftKeyboard())

        // Memasukkan angka kedua
        onView(withId(R.id.etSecondNumber))
            .perform(typeText("3"), closeSoftKeyboard())

        // Menekan tombol hitung
        onView(withId(R.id.btnCalculate))
            .perform(click())

        // Memeriksa hasil yang ditampilkan
        onView(withId(R.id.tvResult))
            .check(matches(withText("Hasil: 8")))
    }

    /**
     * Test Case 2: Pengujian validasi input tidak valid
     *
     * Tujuan: Memastikan bahwa aplikasi dapat menangani input yang tidak valid
     * dengan tetap mempertahankan tampilan hasil sebelumnya
     *
     * Skenario:
     * 1. Terlebih dahulu melakukan perhitungan valid (5 + 3 = 8)
     * 2. Menghapus input pada kolom angka pertama
     * 3. Memasukkan karakter non-angka "abc" pada kolom angka pertama
     * 4. Menekan tombol "Hitung"
     * 5. Memastikan hasil tetap menampilkan hasil perhitungan sebelumnya ("Hasil: 8")
     *
     * Expected result: TextView hasil tetap menampilkan teks "Hasil: 8" meskipun
     * input tidak valid diberikan
     */
    @Test
    fun testInvalidInput() {
        // Terlebih dahulu lakukan perhitungan yang valid
        onView(withId(R.id.etFirstNumber))
            .perform(typeText("5"), closeSoftKeyboard())

        onView(withId(R.id.etSecondNumber))
            .perform(typeText("3"), closeSoftKeyboard())

        onView(withId(R.id.btnCalculate))
            .perform(click())

        // Hapus input pada kolom angka pertama dan masukkan karakter non-angka
        onView(withId(R.id.etFirstNumber))
            .perform(clearText(), typeText("abc"), closeSoftKeyboard())

        // Tekan tombol hitung
        onView(withId(R.id.btnCalculate))
            .perform(click())

        // Pastikan hasil tetap menampilkan hasil perhitungan sebelumnya
        onView(withId(R.id.tvResult))
            .check(matches(withText("Hasil: 8")))
    }
}