package com.juaracoding.dqujian1jf.ujian1;

public class Soal5 {
        public static void main(String[] args) {
            // Mendeklarasikan dan menginisialisasi array harga tiket
            int[] hargaTiket = {56000, 60000, 76000, 86000, 90000};

            // Menghitung total harga tiket
            int totalHarga = 0;

            // Menampilkan harga tiket untuk setiap film dan menghitung total harga
            for (int i = 0; i < hargaTiket.length; i++) {
                System.out.println("Harga tiket film " + (i + 1) + ": " + hargaTiket[i]);
                totalHarga += hargaTiket[i];
            }

            // Menampilkan total harga tiket
            System.out.println("\nTotal harga tiket: " + totalHarga);
        }
}
