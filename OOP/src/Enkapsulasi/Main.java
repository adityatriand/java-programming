/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enkapsulasi;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran();
        L1.setJariJari(8);
        System.out.println("Lingkaran");
        System.out.println("Jari Jari = "+L1.getJariJari());
        L1.hitung_diameter();
        L1.hitung_keliling();
        L1.hitung_luas();
        
        Mahasiswa M1 = new Mahasiswa();
        M1.setNama_mhs("Ahmad Maulana");
        M1.setNIM(123456789);
        M1.setNilai_tugas(100);
        M1.setNilai_uts(65);
        M1.setNilai_uas(85);
        
        System.out.println("\nRincian Mahasiswa");
        System.out.println("Nama = "+M1.getNama_mhs()+"\nNIM = "+M1.getNIM());
        System.out.println("Nilai Tugas = "+M1.getNilai_tugas()+" | "+M1.nilaiHuruf(M1.getNilai_tugas()));
        System.out.println("Nilai UTS = "+M1.getNilai_uts()+" | "+M1.nilaiHuruf(M1.getNilai_uts()));
        System.out.println("Nilai UAS = "+M1.getNilai_uas()+" | "+M1.nilaiHuruf(M1.getNilai_uas()));
        System.out.printf("IPK = %.2f %n", M1.hitungIpk());
        
    }
}
