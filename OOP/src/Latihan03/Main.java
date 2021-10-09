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
public class Main {
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.setHour(20);
        time1.setMinute(15);
        time1.print();
        
        TimeFull time2 = new TimeFull();
        time2.setHour(12);
        time2.setMinute(45);
        time2.setSecond(15);
        time2.print();
        System.out.println(time2.TimeToSecond()+" detik");
    }
}
