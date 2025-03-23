package MAR_21_25;
import java.util.*;
/*Q1. WAP to take a string as hello world and 
 * (a)return char value at the fourth position
 * (b)read the character present at odd positions
 * (c)count the frequency of a particular character using charAt method*/
public class Q01
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s4="Hello World";
		System.out.println("Enter a character(May or May not be present in the String): ");
		char cha=sc.next().charAt(0);
		int count=0;
		System.out.println(s4.charAt(4));
		System.out.println();
		System.out.println("All the characters at odd positions: ");
		for(int i=0;i<s4.length();i=i+2)
		{
			System.out.println(s4.charAt(i));
		}
		System.out.println();
		for(int j=0;j<s4.length();j++)
		{
			if(cha==s4.charAt(j))
			{
				count++;
			}
		}
		System.out.println("Number of times, "+cha+" is present is: "+count);
	}
}