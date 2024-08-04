package com.juaracoding.dqujian1jf.ujian1;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        // Membuat Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama film
        System.out.print("Masukkan nama film: ");
        String movieName = scanner.nextLine();

        // Mengubah nama film menjadi huruf besar
        String movieNameUpperCase = movieName.toUpperCase();

        // Menampilkan nama film dalam huruf besar
        System.out.println("Nama film dalam huruf besar: " + movieNameUpperCase);

    }
}