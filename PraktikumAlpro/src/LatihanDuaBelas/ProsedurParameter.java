package LatihanDuaBelas;
import java.util.Scanner;

public class ProsedurParameter {
    
    static void Luas_SegiEmpat(int P,int L){
        int Luas = P*L;
        System.out.println("1. Program Mencari Luas\n   Luas Segi Empat = "+Luas);
    }
    
    static void RataRata(float a,float b,float c){
        float rata = (float)(a+b+c)/3;
        System.out.println("\n2. Program Mencari Rata Rata\n   Nilai a = "+a+"\n   NIlai b = "+b+"\n   Nilai c = "+c+"\n   Rata Rata = "+rata);
    }
    
    static void BolaPantul(int N){
        System.out.println("\n3. Program Bola Pantul");
        for(int i=N;i>=1;i--){
            System.out.println("   Tinggi "+i+", mantul turun menjadi "+(i-1));
        }
        System.out.println("   Tinggi 0, tidak mantul");
    }
    
    static void Gaji(int a,int b){
        Scanner input = new Scanner(System.in);
        int tun_anak,tun_istri,anak;
        switch (b){
            case 0:System.out.println("   Total Gaji = "+a);break;
            case 1:tun_istri=500000;
                   System.out.print("   Jumlah Anak = ");
                   anak = input.nextInt();
                   if(anak>=2){tun_anak=200000;}
                   else{tun_anak=anak*100000;}
                   System.out.println("   Total Gaji = "+(a+tun_istri+tun_anak));
        }
    }
    
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Luas_SegiEmpat(10,5);
        RataRata(5,7,9);
        BolaPantul(5);    
        int anak,gaji_pokok,status;
        System.out.print("\n4. Program Gaji\n   Masukkan Gaji Pokok = ");
        gaji_pokok = input.nextInt();
        System.out.print("   Masukkan Status Anda (Lajang = 0, Kawin = 1) = ");
        status = input.nextInt();
        Gaji(gaji_pokok,status);
    }
}
