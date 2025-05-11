package arrayfunctions;

import java.util.Arrays;

public class CopyoneArrayintoAnotherinReverseOrder 
{
public static void main(String[] args) 
{
	int []input=new int[4];
	input[0]=78;
	input[1]=74;
	input[2]=15;
	input[3]=10;
	
	int[]output=new int[input.length];
	for(int i=3,j=0;i>=0;i--,j++)
	{
	
	output[j]=input[i];
	}
	System.out.println("The input array is-->" +Arrays.toString(input));
	System.out.println("The output array is-->" +Arrays.toString(output));
		

	}

}
//input 0 1 2 3 
//output 3 2 1 0