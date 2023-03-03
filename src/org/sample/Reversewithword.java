package org.sample;

public class Reversewithword {

	public static void main(String[] args) {
		String s="Greens tech";
		String[] f = s.split(" ");
		String p=" ";
		for (String g : f) {
			String rev=" ";
			for (int i = g.length()-1; i >=0; i++) {
				char h = g.charAt(i);
				rev=rev+h;
				p=p+rev+"";
				
			}
			System.out.println(p);
			
		}

	}

}
