/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan02_02;

/**
 *
 * @author Adit
 */
public class Rumah1 extends PersegiPanjang {
    private final R_TanpaKM1 taman;
    private final R_TanpaKM1 CJ;
    private final R_TanpaKM1 RB;
    private final R_DenganKM1 TU;
    private final R_DenganKM1 dapur;
    private final R_TanpaKM1 K1;
    private final R_TanpaKM1 K2;
    public Rumah1(){
        setP(800);
        setL(1200);
        taman = new R_TanpaKM1();
        CJ = new R_TanpaKM1();
        RB = new R_TanpaKM1();
        TU = new R_DenganKM1();
        dapur = new R_DenganKM1();
        K1 = new R_TanpaKM1();
        K2 = new R_TanpaKM1();
    }
    
    public void setTaman(double P,double L, double P_pintu, double L_pintu){
        taman.setP(P);
        taman.setL(L);
        taman.setP_Pintu(P_pintu);
        taman.setL_Pintu(L_pintu);
    }
    
    public void setCuciJemur(double P,double L, double P_pintu, double L_pintu){
        CJ.setP(P);
        CJ.setL(L);
        CJ.setP_Pintu(P_pintu);
        CJ.setL_Pintu(L_pintu);
    }
    
    public void setRuangBersama(double P,double L, double P_pintu, double L_pintu){
        RB.setP(P);
        RB.setL(L);
        RB.setP_Pintu(P_pintu);
        RB.setL_Pintu(L_pintu);
    }
    
    public void setTidurUtama(double P,double L, double P_pintu, double L_pintu, double P_KM, double L_KM){
        TU.setP(P);
        TU.setL(L);
        TU.setP_Pintu(P_pintu);
        TU.setL_Pintu(L_pintu);
        TU.setP_KM(P_KM);
        TU.setL_KM(L_KM);
    }
    
     public void setDapur(double P,double L, double P_pintu, double L_pintu, double P_KM, double L_KM){
        dapur.setP(P);
        dapur.setL(L);
        dapur.setP_Pintu(P_pintu);
        dapur.setL_Pintu(L_pintu);
        dapur.setP_KM(P_KM);
        dapur.setL_KM(L_KM);
    }
    
    public void setKamar1(double P,double L, double P_pintu, double L_pintu){
        K1.setP(P);
        K1.setL(L);
        K1.setP_Pintu(P_pintu);
        K1.setL_Pintu(L_pintu);
    }
    
    public void setKamar2(double P,double L, double P_pintu, double L_pintu){
        K2.setP(P);
        K2.setL(L);
        K2.setP_Pintu(P_pintu);
        K2.setL_Pintu(L_pintu);
    }
    
    @Override
    public double luas(){
        return getP()*getL();
    }
    
    @Override
    public void informasi(){
        System.out.println("Luas Rumah = "+luas());
        System.out.println("Terdapat 7 Ruangan yang terdiri dari");
        System.out.println("\nTAMAN");
        taman.informasi();
        taman.pintu();
        System.out.println("\nRUANG CUCI JEMUR");
        CJ.informasi();
        CJ.pintu();
        System.out.println("\nRUANG BERSAMA");
        RB.informasi();
        RB.pintu();
        System.out.println("\nKAMAR TIDUR UTAMA");
        TU.informasi();
        System.out.println("\nDAPUR");
        dapur.informasi();
        System.out.println("\nKAMAR TIDUR 1");
        K1.informasi();
        K1.pintu();
        System.out.println("\nKAMAR TIDUR 2");
        K2.informasi();
        K2.pintu();
        double TanahPakai = taman.luas()+CJ.luas()+RB.luas()+TU.luas()+dapur.luas()+K1.luas()+K2.luas();
        double TanahKosong = luas()- TanahPakai; 
        System.out.println("\nLuas Tanah Pakai = "+TanahPakai);
        System.out.println("Luas Tanah Kosong = "+TanahKosong);
    }
    

}

class R_TanpaKM1 extends PersegiPanjang{
    private final Pintu pintu;
    public R_TanpaKM1(){
        pintu = new Pintu();
    }
    
    public void setP_Pintu(double P){
        pintu.setP(P);
    }
    public double getP_Pintu(){
        return pintu.getP();
    }
    public void setL_Pintu(double L){
        pintu.setL(L);
    }
    public double getL_Pintu(){
        return pintu.getL();
    }
    
    @Override
    public double luas(){
        return getP()*getL();
    }
    
    public void pintu(){
        pintu.informasi();
    }
}

class R_DenganKM1 extends PersegiPanjang{
    private final Pintu pintu;
    private final KamarMandi KM;
    public R_DenganKM1(){
        pintu = new Pintu();
        KM = new KamarMandi();
    }
    
    public void setP_Pintu(double P){
        pintu.setP(P);
    }
    public double getP_Pintu(){
        return pintu.getP();
    }
    public void setL_Pintu(double L){
        pintu.setL(L);
    }
    public double getL_Pintu(){
        return pintu.getL();
    }
    
    public void setP_KM(double P){
        KM.setP(P);
    }
    public double getP_KM(){
        return KM.getP();
    }
    public void setL_KM(double L){
        KM.setL(L);
    }
    public double getL_KM(){
        return KM.getL();
    }
    
    @Override
    public double luas(){
        return (getP()*getL())+KM.luas();
    }
    
    @Override
    public void informasi(){
        System.out.println("Panjang = "+getP());
        System.out.println("Lebar = "+getL());
        pintu.informasi();
        System.out.println("Tambahan Kamar Mandi");
        System.out.println("Panjang = "+KM.getP());
        System.out.println("Lebar = "+KM.getL());
        System.out.println("Luas Kamar Mandi = "+KM.luas());
        System.out.println("Luas Kamar = "+luas());
    }
}

class KamarMandi1 extends PersegiPanjang{
    @Override
    public double luas(){
        return getP()*getL();
    } 
}

class Pintu1 extends PersegiPanjang{
    @Override
    public double luas(){
        return getP()*getL();
    }
    
    @Override
    public void informasi(){
        System.out.println("Panjang Pintu = "+getP());
        System.out.println("Lebar Pintu = "+getL());
    }
}