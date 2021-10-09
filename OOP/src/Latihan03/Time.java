/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan03;

/**
 *
 * @author Adit
 */
public class Time implements Displayer {
    private int hour;
    private int minute;
    
    public boolean cekHour(int hour){
        return hour < 0 || hour > 23; 
    }
    
    public boolean cekMinute(int minute){
        return minute < 0 || minute > 59;
    }
    
    public Time(){
        this.hour = 0;
        this.minute = 0;
    }
    
    public Time(int hour, int minute){
        if(cekHour(hour)) hour = 0;
        if(cekMinute(minute)) minute = 0;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(cekHour(hour))
            hour = 0;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(cekMinute(minute))
            minute = 0;
        this.minute = minute;
    }
    
    @Override
    public String display(){
        return hour+":"+minute;
    }
    
    public void print(){
        System.out.print(display());
    }
    
    //Kelas ini merupakan kelas konkrit karena sudah cukup spesifik menggambarkan jam dan menit sehingga
    //bisa pandang sebagai objek yang nyata. Namun kelas ini juga bisa menjadi kelas abstrak karena dapat menurunkan
    //kelas konkrit lainnya yang mengandung detik.
}
