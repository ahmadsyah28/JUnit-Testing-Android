package com.example.junittestingapp

class Calculator {
    /**
     * Fungsi untuk melakukan penambahan dua angka
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil penambahan dari a dan b
     */
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    /**
     * Fungsi untuk melakukan pengurangan dua angka
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil pengurangan a oleh b
     */
    fun subtract(a: Int, b: Int): Int {
        return a - b
    }

    /**
     * Fungsi untuk melakukan perkalian dua angka
     * @param a angka pertama
     * @param b angka kedua
     * @return hasil perkalian a dan b
     */
    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    /**
     * Fungsi untuk melakukan pembagian dua angka
     * @param a angka pembilang
     * @param b angka penyebut
     * @return hasil pembagian a dengan b
     * @throws IllegalArgumentException jika b bernilai 0
     */
    fun divide(a: Int, b: Int): Double {
        if (b == 0) {
            throw IllegalArgumentException("Tidak bisa membagi dengan nol")
        }
        return a.toDouble() / b
    }
}