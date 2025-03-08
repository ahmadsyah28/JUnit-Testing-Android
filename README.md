# Aplikasi JUnit Testing di Android dengan Kotlin

## Informasi Mahasiswa
- **Nama:** Ahmad Syah Ramadhan
- **NPM:** 2208107010033

## Deskripsi Proyek
Proyek ini merupakan implementasi pengujian unit (unit testing) pada aplikasi Android menggunakan JUnit. Aplikasi yang dibuat adalah kalkulator sederhana yang mampu melakukan operasi matematika dasar seperti penambahan, pengurangan, perkalian, dan pembagian.

## Fitur Aplikasi
- Operasi matematika dasar (penjumlahan, pengurangan, perkalian, pembagian)
- Validasi input pengguna
- Penanganan kesalahan (error handling)

## Struktur Pengujian
Pengujian pada aplikasi ini terdiri dari 2 jenis:

### 1. Local Tests (Unit Tests)
Pengujian yang berjalan di JVM lokal tanpa memerlukan emulator atau perangkat Android.

- **CalculatorTest.kt**: Menguji fungsi-fungsi matematika pada kelas Calculator
  - `testAdd()` - Menguji fungsi penjumlahan dengan berbagai skenario input
  - `testDivide()` - Menguji fungsi pembagian termasuk penanganan kasus pembagian dengan nol

- **InputValidatorTest.kt**: Menguji validasi input
  - `testIsValidNumber()` - Menguji validasi format angka
  - `testIsValidEmail()` - Menguji validasi format email

### 2. Instrumental Tests
Pengujian yang berjalan pada emulator atau perangkat Android fisik.

- **MainActivityTest.kt**: Menguji UI dan interaksi pengguna di MainActivity
  - `testAddTwoNumbersUI()` - Menguji fungsionalitas penjumlahan melalui UI
  - `testInvalidInput()` - Menguji penanganan input tidak valid

- **UITest.kt**: Menguji komponen UI dan interaksi pengguna spesifik
  - `testUIComponentsVisibility()` - Memastikan semua komponen UI terlihat
  - `testNegativeNumbersInput()` - Menguji penanganan input angka negatif

## Teknologi yang Digunakan
- Kotlin
- JUnit 4
- Espresso (UI Testing)
- Android Architecture Components
- Gradle (Kotlin DSL)

## Cara Menjalankan Pengujian

### Menjalankan Local Tests
1. Buka project di Android Studio
2. Buka kelas test di folder `src/test/java/com.example.junittestingapp/`
3. Klik kanan pada kelas test atau metode yang ingin dijalankan
4. Pilih "Run 'testName'" atau "Run 'ClassName'"

### Menjalankan Instrumental Tests
1. Pastikan emulator atau perangkat Android sudah terhubung
2. Buka kelas test di folder `src/androidTest/java/com.example.junittestingapp/`
3. Klik kanan pada kelas test atau metode yang ingin dijalankan
4. Pilih "Run 'testName'" atau "Run 'ClassName'"

## Struktur Proyek
```
app/
├── src/
│   ├── main/
│   │   ├── java/com.example.junittestingapp/
│   │   │   ├── Calculator.kt
│   │   │   ├── InputValidator.kt
│   │   │   └── MainActivity.kt
│   │   ├── res/
│   │   │   ├── layout/
│   │   │   │   └── activity_main.xml
│   │   │   └── ...
│   │   └── AndroidManifest.xml
│   ├── test/
│   │   └── java/com.example.junittestingapp/
│   │       ├── CalculatorTest.kt
│   │       └── InputValidatorTest.kt
│   └── androidTest/
│       └── java/com.example.junittestingapp/
│           ├── MainActivityTest.kt
│           └── UITest.kt
└── build.gradle.kts
```

## Kesimpulan
Pengujian unit (unit testing) sangat penting dalam pengembangan aplikasi untuk memastikan bahwa setiap komponen berfungsi sebagaimana mestinya. Dengan menggunakan JUnit dan Espresso, kita dapat menguji logika bisnis dan UI aplikasi Android secara menyeluruh.

## Link GitHub
[Repository GitHub](https://github.com/ahmadsyahramadhan/JUnitTestingApp)
