package org.sample;

public class Armstrong {

	public static void main(String[] args) {
		int a=153;
		int i=0,j=0,d=a;
		while (d>0) {
			i=a%10;
			j=(i*i*i)+j;
			d=d/10;
		}
			if (j==a) {
				System.out.println("armstrong");
				
			} else {
				System.out.println("non");

			}
			
		
		

	}

}
