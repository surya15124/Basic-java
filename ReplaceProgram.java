package arrayfunctions;

public class ReplaceProgram {

	public static void main(String[] args) 
	{		String a="Surya Priya";
		System.out.println(a);
		String a1=a.replace('u', 'm');//replace single char
		System.out.println(a1);
		
		String a2=a.replace("Surya", "Vishwa");//replace single word or string
		System.out.println(a2);
		
		String a3=a.replaceAll("[A-Z]", "");//disable capital letter
		System.out.println(a3);
		
		String a4=a.replaceAll("[a-z]", "");//disable small letter
		System.out.println(a4);
		
		//Substring with 1 parameter
		String c="Teertha Selva Bharathi";
		System.out.println(c.substring(14));
		System.out.println(c.substring(8,13 ));//it will give only 8-12
		
		//charAt function it will find the character at the given index
		/*String e="Suryapriya";
		char e1=e.charAt(8);
		System.out.println(e1);*/

	}

}
