/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendalaman;

import java.util.Scanner;

/**
 *
 * @author Adit
 */

//membuat sebuah titik pada diagram kartesius
public class Point {
    //inisialisasi
    private int x;
    private int y;
    
    //Konstruktor Default sebagai nilai awal
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    
    //Konstruktor Bernilai. Digunakan jika ingin langsung input nilainya
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //Getter berguna untuk mengambil nilai x atau y yang berada difungsi ini
    //karena variabel globalnya bersifat private
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    //Setter berguna untuk mengubah nilai x atau y lewat kelas lain yang masih
    //dalam satu package (contoh di main)
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    //Menampilkan atau memprintkan nilai x dan y dari fungsi ini
    @Override
    public String toString(){
        return "( "+this.x+","+this.y+" )";
    }
    
    //Method Lain
    //Berguna untuk input data dari user
    public void inputData(){
        Scanner input = new Scanner(System.in);
        int tempx,tempy;
        System.out.print("Masukkan nilai x = ");
        tempx = input.nextInt();
        System.out.print("Masukkan nilai y = ");
        tempy = input.nextInt();
        setX(tempx);
        setY(tempy);
    }
    
    public static void MainPoint(){
        Point point1 = new Point();
        System.out.println("Titik untuk Point 1 = "+point1+"\n");
        
        Point point2 = new Point(5,4);
        System.out.println("Titik untuk Point 2 = "+point2+"\n");
        
        Point point3 = new Point();
        point3.inputData();
        System.out.println("Titik untuk Point 3 = "+point3+"\n");
        
        Point point4 = new Point();
        int x = point2.getX()+point3.getX();
        int y = point2.getY()+point3.getY();
        point4.setX(x);
        point4.setY(y);
        System.out.println("Titik untuk Point 4 = "+point4+"\n");
    }
    
}
