import java.util.Arrays;
import java.util.Scanner;

public class SameCh {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string 1");

		String s11 = sc.nextLine();
		System.out.println("Enter the string 2");

		String s21 = sc.nextLine();

		isstringa(s11, s21);

	}

	private static void isstringa(String s11, String s21) {
		int c = 0;
		int[] array = new int[256];

		char[] s1Array = s11.toLowerCase().toCharArray();

		char[] s2Array = s21.toLowerCase().toCharArray();
		Arrays.sort(s1Array);

		Arrays.sort(s2Array);
		if(s11.length() != s21.length()) {
			System.out.print("False");
		} 
		else {
			for (int i = 0; i < s1Array.length; i++) {
				if (s1Array[i] == s2Array[i]) {
					c++;
				} else {
					c--;
				}
			}
			if (c > 0) {
				System.out.print("True");
			} else {
				System.out.println("False");
			}
		}

	}
}