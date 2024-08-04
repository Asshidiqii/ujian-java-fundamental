package com.juaracoding.dqujian1jf.ujian1;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah tiket
        System.out.println("Jumlah tiket: ");
        int jumlahTiket = input.nextInt();

        // Input jenis hari (weekday/weekend)
        System.out.println("Jenis hari (ketik antara weekday/weekend): ");
        String jenisHari = input.next();

        // Harga tiket
        int hargaTiket;
        if (jenisHari.equalsIgnoreCase("weekday")) {
            hargaTiket = 35000;
        } else if (jenisHari.equalsIgnoreCase("weekend")) {
            hargaTiket = 45000;
        } else {
            System.out.println("Jenis hari tidak valid.");
            return;
        }

        // Hitung total harga sebelum diskon
        int totalHarga = jumlahTiket * hargaTiket;

        // Diskon
        float diskon = 0.0f;
        if (jumlahTiket > 5) {
            diskon = 0.1f; // 10%
        }

        // Hitung total harga setelah diskon
        float totalHargaDenganDiskon = totalHarga - (totalHarga * diskon);

        // Tampilkan hasil
        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Total harga (dengan diskon): " + (int) totalHargaDenganDiskon);
    }
}
