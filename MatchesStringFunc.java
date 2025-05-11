package arrayfunctions;

public class MatchesStringFunc 
{
public static void main(String[] args)
{
		String s1="care";
		//regix function
		//1st check if the given string consist of exact 4 letter in it or not
		boolean b1=s1.matches("....");//here one dot represent single character
		System.out.println(b1);
		//check if the string start with c
		boolean b2=s1.matches("c(.*)");//(.*)represent multi charater
		System.out.println(b2);
		//check if the given string ends with e
		boolean b3= s1.matches("(.*)e");
		System.out.println(b3);
		
		String s2="spiderman";
		//batman
		//heman
		//wonder woman
		//ironman
		//batman
		//superman
		//manager
		//salman khan
		//check of the given string have man in it
		boolean b4=s2.matches("(.*)man(.*)");
		System.out.println(b4);

	}

}
