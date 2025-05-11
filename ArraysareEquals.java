package arrayfunctions;

import java.util.Arrays;

public class ArraysareEquals
{
public static void main(String[] args)
	{
		
	int array1[]=new int[4];
	int array2[]=new int[4];
	
	array1[0]=12;
	array1[1]=18;
	array1[2]=24;
	array1[3]=42;
	
	array2[0]=12;
	array2[1]=18;
	array2[2]=24;
	array2[3]=42;
	
	boolean b1= Arrays.equals(array1, array2);
	System.out.println(b1);
	if(b1==true)
	{
		System.out.println("Arrays are equals");
	}
	else
	{
		System.out.println("Arrays are not equals");
	}

	}

}
