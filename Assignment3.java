package myTrails;

import java.util.Scanner;

public class Panagram {
	
	public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			System.out.println("enter any String");
			String s = scn.nextLine();
			System.out.println(s);
	        boolean result = isPangram(s);

	        if (result) 
	            System.out.println("The string is a pangram.");
	        else 
	            System.out.println("The string is not a pangram.");
	        
	    }
	public static boolean isPangram(String str) {
        str = str.toLowerCase();
        boolean[] alphabets = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                alphabets[index] = true;
            }
        }
        for (boolean present : alphabets) {
            if (!present) 
                return false;
        }

        return true;
    }

	 








}
