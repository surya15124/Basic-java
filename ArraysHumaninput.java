package arrayfunctions;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysHumaninput {

	public static void main(String[] args) 
	{
		//try {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		String[]name=new String[s1.nextInt()];
		for(int i=0;i<name.length;i++) //instead of 3 we can write like name.length
		{
			System.out.println("please enter the value of index-->" +i);
			name[i]=s1.next();
		}
		System.out.println(Arrays.toString(name));
		s1.close();
		}
		//catch(NegativeArraySizeException a1)
		{
			System.out.println("sixe of the array cannot be negative");
		}
		
		

	}

//}
