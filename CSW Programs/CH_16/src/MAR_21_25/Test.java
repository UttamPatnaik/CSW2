package MAR_21_25;
import java.util.*;
public class Test {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String s="Hello";
		s.concat("hi");//Here, the concatenation doesnt happens as string is immutable
		System.out.println(s);
		//String class in java, are immutable sequence of Unicode characters.//
		//There are various methods to create a string
		String s1="Hello";//1//
		String s2=new String("abc");//2//
		char ch[]= {'a','b','c','d','e'};
		String s3=new String(ch);//3//
		//When we use new keyword, both the string objects point to different locations.
		/*Suppose we have created 2 string with same values without new, then both the 
		 * variables would point to the same memory location containing the value.*/
	}
}
