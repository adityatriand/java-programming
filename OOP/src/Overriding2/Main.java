/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overriding2;

/**
 *
 * @author Adit
 */
public class Main {
    public static void main(String[] args) {
        
        Dosen dosen1 = new Dosen("01234","Andi","Jalan Mangga");
        dosen1.setJumlahSKS(20);

        Dosen dosen2 = new Dosen("05678","Budi","Jalan Jambu");
        dosen2.setJumlahSKS(24);
        
        Staff staff1 = new Staff("0135","Citra","Jalan Rambutan");
        staff1.setJumlahKehadiran(30);
        
        Staff staff2 = new Staff("0246","Danu","Jalan Manggis");
        staff2.setJumlahKehadiran(21);
        
        dosen1.identitas();
        dosen2.identitas();
        staff1.identitas();
        staff2.identitas();
    }
}
