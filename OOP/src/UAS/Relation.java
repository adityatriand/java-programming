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
public interface Relation {
    public boolean isGreater( Line a, Line b);
public boolean isLess( Line a, Line b);
public boolean isEqual( Line a, Line b);
}
