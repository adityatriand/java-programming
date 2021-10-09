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
public class coba {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float a[] = new float [5];
		int i;
		int menu;
		float maks;
		float min;
		
		System.out.println("5 bilangan desimal : ");
		for(i=0;i<5;i++)
		{
			a[i] = s.nextFloat();
		}
		
		System.out.println("\nMENU : ");
		System.out.println("1. Maksimal");
		System.out.println("2. Minimal");
		System.out.print("silahkan pilih : ");
		menu = s.nextInt();
		
		switch(menu)
		{
			case 1: 
				maks = a [0];
				
				for(i=0;i<5;i++)
				{
					if(a[i]>maks)
					{
						maks = a [i];
					}
				}
				System.out.println("Nilai maksimum : " + maks);
			break;
				
			case 2: 
				min = a [0];
				
				for(i=0;i<5;i++)
				{
					if(a[i]<min)
					{
						min = a [i];
					}
				}
				System.out.println("Nilai minimum : " + min);
				break;
			
			default :
				System.out.println("ERROR");
			break;
		}
		
	}

}
