/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author Adit
 */
public class Point {
    protected int x;
protected int y;
public Point() {
System.out.println("Make Point");
this.x=0;
this.y=0;
}
public Point(int x, int y) {
System.out.println("Make Point");
this.x = x;
this.y = y;
}
public int getX() {
return x;
}
public void setX(int x) {
this.x = x;
}
public int getY() {
return y;
}
public void setY(int y) {
this.y = y;
}
}
