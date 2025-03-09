package com.example.junittestingapp

class InputValidator {
    /**
     * Fungsi untuk validasi apakah string input valid sebagai angka
     * @param input string yang akan divalidasi
     * @return true jika input adalah angka valid, false jika tidak
     */
    fun isValidNumber(input: String): Boolean {
        // Input kosong tidak valid
        if (input.isEmpty()) return false

        // Jika input hanya berisi "-", itu tidak valid
        if (input == "-") return false

        // Karakter pertama bisa "-" (untuk angka negatif)
        // Karakter lainnya harus digit
        return input.indices.all { i ->
            input[i].isDigit() || (i == 0 && input[i] == '-')
        }
    }

    /**
     * Fungsi untuk validasi apakah email valid
     * @param email string email yang akan divalidasi
     * @return true jika email valid, false jika tidak
     */
    fun isValidEmail(email: String): Boolean {
        // Email kosong tidak valid
        if (email.isEmpty()) return false

        // Email harus mengandung "@" dan "."
        if (!email.contains('@') || !email.contains('.')) return false

        // Email tidak boleh diakhiri dengan "@"
        if (email.endsWith('@')) return false

        // Cek format email dengan regex
        val emailPattern = "[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}"
        return email.matches(emailPattern.toRegex())
    }
}