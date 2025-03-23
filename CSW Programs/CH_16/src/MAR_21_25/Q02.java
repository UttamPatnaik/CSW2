package MAR_21_25;
/*Q2.(a)Write a program to create a arraylist of characters which takes each char
 * from the previous string.
 * (b)Create a function, public int count_vowels(String m) which will return the number of vowels.
 * (c)Using this method public boolean isVowel(Char c), to check whether the character in the list is a vowel or not.
 * In the main method, create a string object and call the methods, and return frequency of all the vowels present in
 * the list*/
import java.util.*;
public class Q02
{
	public static void main(String[] args)
	{
		String s=new String("HelloWorld");
		ArrayList<Character> chars = new ArrayList<Character>();
		for(int i=0;i<s.length();i++)
		{
			chars.add(s.charAt(i));
		}
	    int cnt=count_vowels(s);
	    System.out.println("Number of vowels in the String: "+cnt);
		count_frequency_each_vowels(s);
	}
	public static void count_frequency_each_vowels(String m)
	{
		int count=0;
		for(int i=0;i<m.length();i++)
		{
			if(isVowel(m.charAt(i)))
			{
				for(int j=i;j<m.length();j++)
				{
					if(m.charAt(i)==m.charAt(j))
					{
						count++;
					}
				}
				System.out.println("Frequency of the character "+m.charAt(i)+": "+count);
			}
			count=0;
		}
	}
	public static boolean isVowel(char c)
	{
		return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
	}
	public static int count_vowels(String s1)
	{
		int con=0;
		for(int i=0;i<s1.length();i++)
		{
			if(isVowel(s1.charAt(i)))
			{
				con++;
			}
		}
		return con;
	}
}