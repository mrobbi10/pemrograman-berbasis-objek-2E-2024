/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4.pkg5;

/**
 *
 * @author ASUS
 */
abstract class Karyawan {
    String nama;
    int usia;
    String posisi;
    
    public Karyawan(String nama, int usia, String posisi){
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
    }
    abstract void tampilkanData();
    abstract double hitungTotalGaji();

}

