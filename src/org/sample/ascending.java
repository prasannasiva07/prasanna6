package org.sample;

public class ascending {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=40;
		a[2]=20;
		a[3]=30;
		a[4]=50;
		for (int i = 0; i < a.length; i++) {
			for (int j =i+1; j < a.length; j++) {
				//desc and asec and max of first amd sec
				if (a[i]<a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}


				}
				
			}
			System.out.println(a[0]);
			System.out.println(a[1]);
	
		
		for (int i1 = 0; i1 < a.length; i1++) {
			System.out.println(a[i1]);
		}
	}

}
