/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihandasarganjil2;

/**
 *
 * @author HP
 */

/* Buatlah algoritma dalam Bahasa Java Anda akan keluar membeli migacoan jika mempunyai uang
lebih besar dari 10000 (rupiah) dan pasangan Anda sedang tidak ada kelas di kuliahanya, 
yang dapat ditulis sebagai ekspresi: (uang >10000) && (!tidakAdaKelasKuliah)*/

import java.util.Scanner;

public class LatihanDasarGanjil2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input jumlah uang dari pengguna
        System.out.print("Masukkan jumlah uang Anda: ");
        int uang = scanner.nextInt();
        
        // Meminta input status kehadiran kelas kuliah dari pengguna
        System.out.print("Apakah Anda tidak memiliki kelas kuliah (true/false)? ");
        boolean tidakAdaKelasKuliah = scanner.nextBoolean();

        // Menentukan apakah akan membeli migacoan berdasarkan kondisi
        if (uang > 10000 && tidakAdaKelasKuliah) {
            System.out.println("Anda akan membeli migacoan.");
        } else {
            System.out.println("Anda tidak akan membeli migacoan.");
        }
        
        // Menutup scanner
        scanner.close();
    }
}

