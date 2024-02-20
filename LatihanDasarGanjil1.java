/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihandasarganjil1;

/**
 *
 * @author HP
 */

/* Buatlah algoritma dalam bahasa Java, yang menerima inputan tiga buah masukan bilangan
bulat negatif dan menampilkan hasil operasi (+,-,*,/) ketiga bilangan!
*/

import java.util.Scanner;

public class LatihanDasarGanjil1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan tiga bilangan bulat negatif
        System.out.print("Masukkan nilai pertama (harus negatif): ");
        int nilai1 = scanner.nextInt();

        System.out.print("Masukkan nilai kedua (harus negatif): ");
        int nilai2 = scanner.nextInt();

        System.out.print("Masukkan nilai ketiga (harus negatif): ");
        int nilai3 = scanner.nextInt();

        // Memeriksa apakah nilai yang dimasukkan negatif
        if (nilai1 >= 0 || nilai2 >= 0 || nilai3 >= 0) {
            System.out.println("Maaf, program hanya menerima bilangan bulat negatif.");
            System.out.println("Silakan jalankan program kembali dan masukkan bilangan bulat negatif.");
        } else {
            // Menampilkan hasil dari operasi penjumlahan, pengurangan, perkalian, dan pembagian
            System.out.println("Hasil Penjumlahan: " + (nilai1 + nilai2 + nilai3));
            System.out.println("Hasil Pengurangan: " + (nilai1 - nilai2 - nilai3));
            System.out.println("Hasil Perkalian: " + (nilai1 * nilai2 * nilai3));

            // Memeriksa apakah pembagian dapat dilakukan tanpa pembagian oleh nol
            if (nilai2 != 0 && nilai3 != 0) {
                System.out.println("Hasil Pembagian: " + ((double) nilai1 / nilai2 / nilai3));
            } else if (nilai2 == 0 || nilai3 == 0) {
                System.out.println("Pembagian tidak dapat dilakukan karena terdapat inputan nol.");
            }
        }

        // Menutup scanner
        scanner.close();
    }
}
