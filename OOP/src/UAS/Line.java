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
public class Line extends Point implements Relation {
    Point P1;
Point P2;
public Line() {
// Membentuk sebuah garis dari 2 buah titik dengan nilai x dan y dari setiap titik adalah 0
System.out.println("Make Line");
P1 = new Point(0,0);
	P2 = new Point(0,0);
}
public Line(int x1, int x2, int y1, int y2){
// Membentuk sebuah garis dari 2 buah titik
// Nilai titik P1 dibentuk dari x1 dan y1
// Nilai titik P2 dibentuk dari x2 dan y2
System.out.println("Make Line");
P1 = new Point(x1,y1);
	P2 = new Point(x2,y2);

}
public Point getP1() {
//getter P1
return this.P1;
}
public void setP1(Point P1) {
// Setter P1
this.P1.setX(P1.getX());
	this.P1.setY(P1.getY());
}
public Point getP2() {
//getter P2
return this.P2;
}
public void setP2(Point P2) {
//setter P2
this.P2.setX(P2.getX());
	this.P2.setY(P2.getY());

}
public double getLength(){
// Menghitung panjang dan mengembalikan nilai panjang tersebut dari sebuah garis dengan rumus
// akar dari (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)
System.out.println("Counting Length");
return (this.P2.getX()-this.P1.getX())*(this.P2.getX()-this.P1.getX()) + (this.P2.getY()-this.P1.getY())*(this.P2.getY()-this.P1.getY());
}

@Override
public boolean isGreater(Line a, Line b){
// Mengembalikan true jika
// Panjang garis a > dari panjang garis b
System.out.println("Is Greater");
if(a.getLength() > b.getLength()) return true;
    else return false;
}
@Override
public boolean isLess( Line a, Line b){
// Mengembalikan true jika
// Panjang garis a < dari panjang garis b
System.out.println("Is Less");
if(a.getLength() <b.getLength()) return true;
    else return false;

}
@Override
public boolean isEqual( Line a, Line b)
{
// Mengembalikan true jika
// Panjang garis a = dari panjang garis b
System.out.println("Is Equal");
if(a.getLength() == b.getLength()) return true;
    else return false;

}
}
