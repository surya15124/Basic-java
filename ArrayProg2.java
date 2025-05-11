package arrayfunctions;

import java.util.Arrays;

public class ArrayProg2 
{
public static void main(String[] args) 
{
	
	try {
	char [] initial=new char[4];// we can store upto 4 values
	initial[0]='a';
	initial[1]='r';
	initial[2]='f';
	initial[3]='j';
	initial[4]='j';
	
	for(int i=0;i<4;i++)
	{
		System.out.println(initial[i]);
	}
	
	System.out.println(Arrays.toString(initial));

	}
	catch(ArrayIndexOutOfBoundsException a1)
	{
		System.out.println("Please enter correct size of an array");
	}
	

}

}
