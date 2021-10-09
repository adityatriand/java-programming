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
public class Mahasiswa {
    private int NIM,nilai_tugas,nilai_uts,nilai_uas;
    private char nilai_huruf;
    private String nama_mhs;
    private float ipk;
    
    public Mahasiswa(){
        this.NIM = 0;
        this.nilai_tugas = 0;
        this.nilai_uts = 0;
        this.nilai_uas = 0;
        this.nama_mhs = "-";
    }
    
    public Mahasiswa(int NIM, int nilai_tugas, int nilai_uts, int nilai_uas, String nama_mhs) {
        this.NIM = NIM;
        this.nilai_tugas = nilai_tugas;
        this.nilai_uts = nilai_uts;
        this.nilai_uas = nilai_uas;
        this.nama_mhs = nama_mhs;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public int getNilai_tugas() {
        return nilai_tugas;
    }

    public void setNilai_tugas(int nilai_tugas) {
        this.nilai_tugas = nilai_tugas;
    }

    public int getNilai_uts() {
        return nilai_uts;
    }

    public void setNilai_uts(int nilai_uts) {
        this.nilai_uts = nilai_uts;
    }

    public int getNilai_uas() {
        return nilai_uas;
    }

    public void setNilai_uas(int nilai_uas) {
        this.nilai_uas = nilai_uas;
    }

    public String getNama_mhs() {
        return nama_mhs;
    }

    public void setNama_mhs(String nama_mhs) {
        this.nama_mhs = nama_mhs;
    }
    
    public float hitungIpk(){
        ipk = (float)(this.nilai_tugas+this.nilai_uts+this.nilai_uas)/3;
        return ipk;
    }
    
    public char nilaiHuruf(int nilai){
        if(nilai>=81 && nilai<=100) nilai_huruf = 'A';
        else if(nilai>=61 && nilai<81) nilai_huruf = 'B';
        else if(nilai>=41 && nilai<61) nilai_huruf = 'C';
        else if(nilai>=21 && nilai<41) nilai_huruf = 'D';
        else nilai_huruf = 'E';
        return nilai_huruf;
    }
}
