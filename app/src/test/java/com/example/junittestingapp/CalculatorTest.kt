package com.example.junittestingapp

import org.junit.Assert.assertEquals
import org.junit.Assert.assertThrows
import org.junit.Test

class CalculatorTest {

    private val calculator = Calculator()

    /**
     * Test Case 1: Pengujian fungsi penjumlahan (add)
     *
     * Tujuan: Memastikan bahwa fungsi add() berhasil menjumlahkan dua angka dengan benar
     *
     * Skenario:
     * - Menguji penjumlahan dua angka positif (5 + 3 = 8)
     * - Menguji penjumlahan dengan angka negatif (5 + (-3) = 2)
     * - Menguji penjumlahan dua angka negatif ((-5) + (-3) = -8)
     * - Menguji penjumlahan dengan nol (5 + 0 = 5)
     *
     * Expected result: Semua test case menghasilkan nilai yang sesuai dengan ekspektasi
     */
    @Test
    fun testAdd() {
        // Test case dengan dua angka positif
        assertEquals(8, calculator.add(5, 3))

        // Test case dengan satu angka negatif
        assertEquals(2, calculator.add(5, -3))

        // Test case dengan dua angka negatif
        assertEquals(-8, calculator.add(-5, -3))

        // Test case dengan nol
        assertEquals(5, calculator.add(5, 0))
    }

    /**
     * Test Case 2: Pengujian fungsi pembagian (divide)
     *
     * Tujuan: Memastikan bahwa fungsi divide() berhasil membagi dua angka dengan benar
     * dan dapat menangani kasus pembagian dengan nol
     *
     * Skenario:
     * - Menguji pembagian normal (10 / 2 = 5.0)
     * - Menguji pembagian yang menghasilkan nilai desimal (5 / 2 = 2.5)
     * - Menguji pembagian dengan nol (10 / 0) yang seharusnya menghasilkan exception
     *
     * Expected result:
     * - Pembagian normal dan pembagian desimal menghasilkan nilai yang sesuai dengan ekspektasi
     * - Pembagian dengan nol menghasilkan IllegalArgumentException
     */
    @Test
    fun testDivide() {
        // Test case pembagian normal
        assertEquals(5.0, calculator.divide(10, 2), 0.0001)

        // Test case pembagian yang menghasilkan desimal
        assertEquals(2.5, calculator.divide(5, 2), 0.0001)

        // Test case pembagian dengan nol, seharusnya menghasilkan IllegalArgumentException
        val exception = assertThrows(IllegalArgumentException::class.java) {
            calculator.divide(10, 0)
        }
        assertEquals("Tidak bisa membagi dengan nol", exception.message)
    }
}