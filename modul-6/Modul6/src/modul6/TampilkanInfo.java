/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul6;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class TampilkanInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menginput data Dosen Tetap
        System.out.println("===== Masukkan Data Dosen =====");
        System.out.print("Nama: ");
        String namaTetap = scanner.nextLine();
        System.out.print("NIK: ");
        String nikTetap = scanner.nextLine();
        System.out.print("Umur: ");
        int umurTetap = scanner.nextInt();
        System.out.print("Jenis Kelamin (L/P): ");
        char jkTetap = scanner.next().charAt(0);
        System.out.print("Gaji Pokok: ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Tunjangan: ");
        double tunjangan = scanner.nextDouble();

        DosenTetap dosenTetap = new DosenTetap(namaTetap, nikTetap, umurTetap, jkTetap, gajiPokok, tunjangan);

        // Menginput data Dosen Tidak Tetap
        System.out.println("===== Masukkan Data Dosen Tidak Tetap =====");
        scanner.nextLine(); // consume the remaining newline
        System.out.print("Nama: ");
        String namaTidakTetap = scanner.nextLine();
        System.out.print("NIK: ");
        String nikTidakTetap = scanner.nextLine();
        System.out.print("Umur: ");
        int umurTidakTetap = scanner.nextInt();
        System.out.print("Jenis Kelamin (L/P): ");
        char jkTidakTetap = scanner.next().charAt(0);
        System.out.print("Jam Mengajar: ");
        int jamMengajar = scanner.nextInt();
        System.out.print("Honor Per Jam: ");
        double honorPerJam = scanner.nextDouble();

        DosenTidakTetap dosenTidakTetap = new DosenTidakTetap(namaTidakTetap, nikTidakTetap, umurTidakTetap, jkTidakTetap, jamMengajar, honorPerJam);

        // Menampilkan informasi dosen
        dosenTetap.tampilkanInfo();
        System.out.println();
        dosenTidakTetap.tampilkanInfo();

        scanner.close();
    }
}

