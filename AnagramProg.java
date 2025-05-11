package arrayfunctions;

import java.util.Arrays;

public class AnagramProg 
{
public static void main(String[] args) 
{
	String a1="earth";
	String a2="heart";
	
	if(a1.length()!=a2.length())
	{
		System.out.println("They are not anagram");
	}
	else
	{
	char c1[]=	a1.toCharArray();//[m,o,m]
	char c2[]=	a2.toCharArray();//[g,o,d]
	
	Arrays.sort(c1);//[m,m,o] alphabetical order
	Arrays.sort(c2);//[d,g,o]
	boolean b2=Arrays.equals(c1, c2);
	if(b2==true)
	{
		System.out.println("The given two strings are Anagram");
	}
	else
	{
		System.out.println("The given two strings are not Anagram");
	}
	
	}
		

	}

}
