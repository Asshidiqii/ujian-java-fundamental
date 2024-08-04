package com.juaracoding.dqujian1jf.ujian1;

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] film = new String[5];

        // Meminta pengguna memasukkan nama lima film
        System.out.println("Daftar film bioskop");
        for (int i = 0; i < film.length; i++) {
            System.out.print("Masukkan nama film " + (i + 1) + ": ");
            film[i] = input.nextLine();
        }

        // Menampilkan daftar film yang dimasukkan
        System.out.println("\nFilm yang ingin ditonton:");
        for (int i = 0; i < film.length; i++) {
            System.out.println((i + 1) + ". " + film[i]);
        }
    }
}

