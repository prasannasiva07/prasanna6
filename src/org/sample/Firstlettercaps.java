package org.sample;

public class Firstlettercaps {

	public static void main(String[] args) {
		String s="java is progamming language";
		String op="";
		String[] all = s.split(" ");
		for (String u : all) {
			op=op+Character.toUpperCase(u.charAt(0))+u.substring(1);
			
		}
System.out.println(op);
                   Pojoclass user = new Pojoclass();
                   user.setName("prasanna");
                   System.out.println(user.getName());
	}

}
