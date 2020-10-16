/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rsoftware.if1.latihan5;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF1
 * NIM   : 10119038
 * Deskripsi Program : Program ini berisi untuk menampilkan value ke layar dengan variabel global
 * 
 */

public class KambingGlobal {
    // Variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    // Method untuk menampilkan jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing : " + jumlahKambing);
    }
    
   public void tambahKambing() {
       jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
   }
   
   public static void main(String[]args) {
       KambingGlobal kambingSusu = new KambingGlobal();
       
       // Menampilkan jumlah kambing yang ada saat program pertama berjalan
       kambingSusu.getJumlahKambing();
       
       // Menambah satu kambing
       kambingSusu.tambahKambing();
       
       // Menampilkan jumlah kambing yang ada
       kambingSusu.getJumlahKambing();
   }
}