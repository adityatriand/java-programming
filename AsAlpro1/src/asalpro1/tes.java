/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asalpro1;

import java.util.*;

/**
 *
 * @author Adit
 */
public class tes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		int min, max;
		int i, sum = 0;
		float mean =0;
		 
		
		for (i=0; i<5 ; i++) {
			a[i] = s.nextInt();
		}
		
		min = a[0];
		max = a[0];
		
		for(i=0 ; i<5 ; i++) {
			if(a[i]<min) {
				min = a[i];
			}
			if(a[i]>max) {
				max = a[i];
			}
			sum = sum + a[i];
			}
			double median = a[2];
			
			System.out.println(" Nilai Maksimum = " + max);
			System.out.println(" Nilai Minimun = " + min);
			System.out.println(" Nilai rata-rata = " + (float)sum/ (float)a.length);
			System.out.println(" Nilai Median= " + median);
	}
}
