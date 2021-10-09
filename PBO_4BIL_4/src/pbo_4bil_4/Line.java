/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_4bil_4;

/**
 *
 * @author KANDAJM
 */
public class Line implements Relation{
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    public double getLength()
    {
        return Math.hypot(x1-x2,y1-y2);
    }

    @Override
    public boolean isEqual(Object a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Line temp = (Line)a;
        return this.getLength() == temp.getLength();
    }

    @Override
    public boolean isGreater(Object a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Line temp = (Line)a;
        return this.getLength() > temp.getLength();
    }

    @Override
    public boolean isLess(Object a) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Line temp = (Line)a;
        return this.getLength() < temp.getLength();
    }
    
    
}
