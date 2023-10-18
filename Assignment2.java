package myTrails;

import java.util.HashMap;
import java.util.Scanner;

public class Assignment2_Roman_Number {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
        System.out.print("Enter a Roman value: ");
        String roman_value = scn.nextLine();
        int res = Integer(roman_value);
        System.out.println("The integer value is: " + res);
	}
	public static int Integer(String s) {
        HashMap<Character, Integer> roman_Value = new HashMap<Character, Integer>();
        roman_Value.put('I', 1);
        roman_Value.put('V', 5);
        roman_Value.put('X', 10);
        roman_Value.put('L', 50);
        roman_Value.put('D', 500);
        roman_Value.put('M', 1000);

        int res = 0;
        for (int i = 0; i < s.length(); i++)
        {
        	char c=s.charAt(i);
            int current_value = roman_Value.get(c);
            if (i < s.length() - 1 )
            	if(current_value < roman_Value.get(s.charAt(i + 1)))	res -= current_value;
            else 
            	  res += current_value;
        }
        return res;
    }        
}
