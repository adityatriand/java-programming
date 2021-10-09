package LatihanDuaBelas;
import java.util.Scanner;
public class FungsiParameter {
    
    static int LuasSegiEmpat(int P, int L){
        int Luas = P*L;
        return Luas;
    }
    
    static float RataRata(float a,float b,float c){
        float rata = (a+b+c)/3;
        return rata;
    }
    
    static int BolaPantul(int N){
        System.out.println("\n3. Program Bola Pantul");
        for(int i=N;i>=1;i--){
            System.out.println("   Tinggi "+i+", mantul turun menjadi "+(i-1));
        }
        System.out.println("   Tinggi 0, tidak mantul");
        return 0;
    }
    
    static int Gaji(int a,int b){
        Scanner input = new Scanner(System.in);
        int total=0,tun_anak,tun_istri,anak;
        switch (b){
            case 0:tun_anak=0;tun_istri=0;total = a+tun_anak+tun_istri;break;
            case 1:tun_istri=500000;
                   System.out.println("\n4. Program Gaji");
                   System.out.print("   Jumlah Anak = ");
                   anak = input.nextInt();
                   if(anak>=2){tun_anak=200000;}
                   else{tun_anak=anak*100000;}
                   total = a+tun_anak+tun_istri;break;
            }
        return total;
   }
    public static void main(String[]args){
        int Luas = LuasSegiEmpat(10,5);
        System.out.println("1. Luas Segi Empat = "+Luas);
        float rata = RataRata(5,7,9);
        System.out.println("\n2. Rata - Rata = "+rata);
        int N = BolaPantul(5);
        int gaji = Gaji(1000000,1);
        System.out.println("   Total Gaji = "+gaji);
    }
}
