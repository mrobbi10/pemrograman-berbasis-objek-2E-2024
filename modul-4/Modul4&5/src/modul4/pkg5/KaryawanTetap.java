/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul4.pkg5;

/**
 *
 * @author ASUS
 */
public class KaryawanTetap extends Karyawan {
    double gajibulanan;
    
    public KaryawanTetap(String nama, int usia, String posisi, double gajibulanan){
        super(nama, usia, posisi);
        this.gajibulanan = gajibulanan;
    }
    
    void tampilkanData(){
        System.out.println("===== Karyawan Tetap =====");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Posisi : " + posisi);
        System.out.println("Gaji : " + gajibulanan);
    }

    @Override
    double hitungTotalGaji() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
