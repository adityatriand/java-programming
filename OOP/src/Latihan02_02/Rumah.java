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
public class Rumah extends PersegiPanjang {
    private final Taman taman;
    private final R_CuciJemur CJ;
    private final R_Bersama RB;
    private final K_TidurUtama TU;
    private final Dapur dapur;
    private final K_Tidur1 K1;
    private final K_Tidur2 K2;
    public Rumah(){
        setP(800);
        setL(1200);
        taman = new Taman();
        CJ = new R_CuciJemur();
        RB = new R_Bersama();
        TU = new K_TidurUtama();
        dapur = new Dapur();
        K1 = new K_Tidur1();
        K2 = new K_Tidur2();
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

class Taman extends PersegiPanjang{
    private final Pintu pintu;
    public Taman(){
       pintu = new Pintu();
       pintu.setP(4);
       pintu.setL(85);
       setP(300);
       setL(170);
    }
    @Override
    public double luas(){
        return getP()*getL();
    }
    
    public void pintu(){
        pintu.informasi();
    }
}

class R_CuciJemur extends PersegiPanjang{
    private final Pintu pintu;
    public R_CuciJemur(){
       pintu = new Pintu();
       pintu.setP(4);
       pintu.setL(85);
       setP(260);
       setL(170);
    }
    @Override
    public double luas(){
        return getP()*getL();
    }
    
    public void pintu(){
        pintu.informasi();
    }
}

class R_Bersama extends PersegiPanjang{
    private final Pintu pintu;
    public R_Bersama(){
       pintu = new Pintu();
       pintu.setP(4);
       pintu.setL(120);
       setP(240);
       setL(600);
    }
    @Override
    public double luas(){
        return getP()*getL();
    }
    
    public void pintu(){
        pintu.informasi();
    }
}

class K_TidurUtama extends PersegiPanjang{
    private final Pintu pintu;
    private final KamarMandi KM;
    public K_TidurUtama(){
        pintu = new Pintu();
        KM = new KamarMandi();
        KM.setP(105);
        KM.setL(200);
        pintu.setP(4);
        pintu.setL(80);
        setP(300);
        setL(330);
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

class Dapur extends PersegiPanjang{
    private final Pintu lorong;
    private final KamarMandi KM;
    public Dapur(){
        lorong = new Pintu();
        KM = new KamarMandi();
        KM.setP(120);
        KM.setL(120);
        lorong.setP(4);
        lorong.setL(120);
        setP(260);
        setL(330);
    }
    @Override
    public double luas(){
        return getP()*getL();
    }
    @Override
    public void informasi(){
        System.out.println("Panjang = "+getP());
        System.out.println("Lebar = "+getL());
        System.out.println("Tambahan Kamar Mandi");
        System.out.println("Panjang = "+KM.getP());
        System.out.println("Lebar = "+KM.getL());
        System.out.println("Luas Kamar Mandi = "+KM.luas());
        System.out.println("Luas Dapur = "+luas());
    }
}

class K_Tidur1 extends PersegiPanjang{
    private final Pintu pintu;
    public K_Tidur1(){
        pintu = new Pintu();
        pintu.setL(4);
        pintu.setP(80);
        setP(240);
        setL(350);
    }
    @Override
    public double luas(){
        return getP()*getL();
    }
    
    public void pintu(){
        pintu.informasi();
    }
}

class K_Tidur2 extends PersegiPanjang{
    private final Pintu pintu;
    public K_Tidur2(){
        pintu = new Pintu();
        pintu.setL(4);
        pintu.setP(80);
        setP(260);
        setL(370);
    }
    
    @Override
    public double luas(){
        return getP()*getL();
    }
    
    public void pintu(){
        pintu.informasi();
    }
}

class KamarMandi extends PersegiPanjang{
    @Override
    public double luas(){
        return getP()*getL();
    } 
}

class Pintu extends PersegiPanjang{
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