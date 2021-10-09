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
public class TimeFull extends Time implements Displayer {
    private int second;
    
    private boolean cekSecond(int second){
        return second < 0 || second > 49;
    }
    
    public TimeFull(){
        setHour(0);
        setMinute(0);
        this.second = 0;
    }
    
    public TimeFull(int hour, int minute, int second){
        if(cekHour(hour))hour = 0;
        if(cekMinute(minute))minute = 0;
        if(cekSecond(second))second = 0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(cekSecond(second))
            second = 0;
        this.second = second;
    }
    
    @Override
    public String display(){
        return getHour()+":"+getMinute()+":"+second;
    }
    
    public int TimeToSecond(){
        return getHour()*3600 + getMinute()*60 + this.second;
    }
    
    //tidak perlu mengoverride method print karena method print mencetak hasil dari display dan
    //display telah diovveride sesuai dengan apa adanya.
}
