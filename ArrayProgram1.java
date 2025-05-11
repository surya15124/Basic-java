package arrayfunctions;

import java.util.Arrays;

public class ArrayProgram1 
{
public static void main(String[] args) 
	{
	String []name=new String[3];
	name[0]="Surya";
	name[1]="Selva";
	name[2]="Teertha";
	
	
	/*System.out.println(name[0]);
	System.out.println(name[1]);
	System.out.println(name[2]);*/
	//this can be used or for loop can be used

	for(int i=0;i<3;i++)
	{
		System.out.println(name[i]);
	}
	System.out.println(Arrays.toString(name));
	}
	


}
//generally array will store like this[surya,selva,teertha]
//to get a output like this we use Arrays.toString