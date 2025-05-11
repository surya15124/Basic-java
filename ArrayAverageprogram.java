package arrayfunctions;

public class ArrayAverageprogram 
{
public static void main(String[] args) 
{
	int sum=0;
	int nos[]=new int[4];
	nos[0]=6;
	nos[1]=12;
	nos[2]=18;
	nos[3]=24;
	
	for(int i=0;i<4;i++)
	{
	sum=sum+nos[i];
	//i=0, sum=0+6
	//i=1, sum=6+12=18
	//i=2, sum=18+18=36
	//i=3, sum=36+24
	}
	System.out.println(sum);
	double average=sum/nos.length;
	System.out.println(average);
		

	}

}
