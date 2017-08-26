import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();//reading a string value from scanner
		System.out.println("Before Reversing string is : "+str);
		String str1=reverse(str);
		System.out.println("After Reversing string is : "+str1);

	}

	public static String reverse(String str) {
		if ((str == null) || (str.length() <= 1))//check a string length if its 0 or 1 return a same string
			return str;
		//System.out.println(str.substring(1) + str.charAt(0));

		return reverse(str.substring(1)) + str.charAt(0);//recursive call a method 

	}
}
