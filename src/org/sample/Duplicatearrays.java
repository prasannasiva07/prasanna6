package org.sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicatearrays {

	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=10;
		a[1]=40;
		a[2]=20;
		a[3]=30;
		a[4]=50;
		a[5]=40;
		
		Set<Integer> s = new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
			for (Integer a1 : s) {
				System.out.println(a1); 
				
			}
			
		}

	}


