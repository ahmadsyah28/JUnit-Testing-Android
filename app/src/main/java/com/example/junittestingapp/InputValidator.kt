package com.example.junittestingapp

class InputValidator {
    /**
     * Fungsi untuk validasi apakah string input valid sebagai angka
     * @param input string yang akan divalidasi
     * @return true jika input adalah angka valid, false jika tidak
     */
    fun isValidNumber(input: String): Boolean {
        return input.isNotEmpty() && input.all { it.isDigit() || it == '-' && input.indexOf(it) == 0 }
    }

    /**
     * Fungsi untuk validasi apakah email valid
     * @param email string email yang akan divalidasi
     * @return true jika email valid, false jika tidak
     */
    fun isValidEmail(email: String): Boolean {
        val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"
        return email.matches(emailPattern.toRegex())
    }
}