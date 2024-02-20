/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihandasarganjil3;

/**
 *
 * @author HP
 */

/*Buatlah algoritma dalam bahasa Java, menjumlahkan kode ASCII dari karakter '4' dan karakter '6'!*/
public class LatihanDasarGanjil3 {
    public static void main(String[] args) {
        // Menampilkan kode ASCII dari karakter '4'
        char char4 = '4';
        int ascii4 = (int) char4;
        System.out.println("Kode ASCII dari karakter '4' adalah: " + ascii4);

        // Menampilkan kode ASCII dari karakter '6'
        char char6 = '6';
        int ascii6 = (int) char6;
        System.out.println("Kode ASCII dari karakter '6' adalah: " + ascii6);

        // Menjumlahkan kode ASCII dari karakter '4' dan karakter '6'
        int totalAscii = ascii4 + ascii6;
        System.out.println("Total jumlah kode ASCII dari karakter '4' dan '6' adalah: " + totalAscii);
    }
}