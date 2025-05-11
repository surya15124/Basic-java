package arrayfunctions;

import java.util.Arrays;

public class CopyoneArrayintoanotherArray 
{
public static void main(String[] args)
{
	int []input=new int[4];
	input[0]=78;
	input[1]=74;
	input[2]=15;
	input[3]=10;
	
	int[]output=new int[input.length];
	for(int i=0;i<input.length;i++)
	{
	output[i]=input[i];
	/*output[1]=input[1];
	output[2]=input[2];
	output[3]=input[3];*/
	}
	System.out.println("The input Array is-->" +Arrays.toString(input));
	System.out.println("The output Array is-->" +Arrays.toString(output));	

	}

}
