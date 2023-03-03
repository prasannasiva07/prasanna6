package org.sample;

public class Charactercount {

	public static void main(String[] args) {
		String t="prasa23@54#";
		int upper=0,lower=0, special=0,number=0;
		for (int i = 0; i < t.length(); i++) {
			char pt = t.charAt(i);
			if (Character.isUpperCase(pt)) {
				upper++;
				
			}
			else if (Character.isLowerCase(pt)) {
				lower++;
				
			}
			else if (Character.isDigit(pt)) {
				number++;
				
			}
			else {
				special++;
			}
			
		}
		System.out.println("upper"+upper);
		System.out.println("lower"+lower);
		System.out.println("number"+number);
		System.out.println("special"+special);

	}

}
