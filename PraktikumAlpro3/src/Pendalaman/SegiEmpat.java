package Pendalaman;
import Tanggal29September2020ADT.ADTPoint;
/**
 *
 * @author Adit
 */
public class SegiEmpat {
    private ADTPoint P;
    private ADTPoint Q;
    
    public boolean isValid(int a, int b){
        return (a < b);
    }
    
    public SegiEmpat(){
        this.P = new ADTPoint();
        this.Q = new ADTPoint();
    }
    
    public SegiEmpat(int Pbawah, int Patas, int Qkiri, int Qkanan){
        if(Pbawah < Patas && Qkiri < Qkanan){
            this.P.setX(Pbawah);
            this.P.setY(Patas);
            this.Q.setX(Qkiri);
            this.Q.setY(Qkanan);
        }
    }
    
    public ADTPoint getP(){
        ADTPoint temp = new ADTPoint();
        temp.setX(this.P.getX());
        temp.setY(this.P.getY());
        return temp;
    }
    
    public ADTPoint getQ(){
        ADTPoint temp = new ADTPoint();
        temp.setX(this.Q.getX());
        temp.setY(this.Q.getY());
        return temp;
    }
    
    public void setP(int Pbawah, int Patas){
        if(isValid(Pbawah,Patas)){
            this.P.setX(Pbawah);
            this.P.setY(Patas);
        }
    }
    
    public void setQ(int Qkiri, int Qkanan){
        if(isValid(Qkiri,Qkanan)){
            this.Q.setX(Qkiri);
            this.Q.setY(Qkanan);
        }
    }
    
    @Override
    public String toString(){
        if(isValid(P.getX(),P.getY())&& isValid(Q.getX(),Q.getY())){
            return "Titik Lebar : "+this.P+"\n"+"Titik Panjang : "+this.Q;
        }
        else if(isValid(P.getX(),P.getY())){
            return "Titik Lebar : "+this.P+"\n"+"Titik Panjang : "+this.Q;
        }
        else if(isValid(Q.getX(),Q.getY())){
            return "Titik Lebar : "+this.P+"\n"+"Titik Panjang : "+this.Q;
        }
        else{
            return "Inputan tidak memenuhi syarat";
        }
    }
    
    public int besarPanjang(){
        return (this.P.getY()-this.P.getX());
    }
    
    public int besarLebar(){
        return (this.Q.getY()-this.Q.getX());
    }
    
    public int luasSegiEmpat(){
        return besarPanjang()*besarLebar();
    }
    
    public static void MainSegiEmpat(){
        SegiEmpat bangun1 = new SegiEmpat();
        bangun1.setP(3,10);
        bangun1.setQ(3,10);
        System.out.println(bangun1);
        System.out.println("Panjang = "+bangun1.besarPanjang());
        System.out.println("Lebar = "+bangun1.besarLebar());
        System.out.println("Luas = "+bangun1.luasSegiEmpat());
    }
}
