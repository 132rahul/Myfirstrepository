import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RemvDubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int[] b = remove(a);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
	/*
	 * ArrayList<Integer> a1 = new ArrayList<Integer>(); Scanner sc = new
	 * Scanner(System.in); int n = sc.nextInt(); for (int i = 0; i < n; i++) {
	 * int a = (Integer.parseInt(sc.next())); a1.add(a); } Set<Integer> s13 =
	 * new TreeSet<Integer>(); while (a1.size() != 0) { if (s13.addAll(a1)) {
	 * System.out.println(s13); } }
	 */

	private static int[] remove(int[] a) {
		// int[] b = new int[10];
		int n = a.length;

		while (n < 2) {
			return a;
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					a[j] = a[n - 1];
					j--;
					n--;
				}
			}
		}
		int[] b = new int[n];
		for (int p = 0; p < n; p++) {
			b[p] = a[p];

		}

		return b;

	}
}