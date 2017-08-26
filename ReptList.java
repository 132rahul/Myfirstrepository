import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReptList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s=s1.replaceAll("[^a-zA-Z0-9]", "");//remove all except a-zA-Z
		
		char[] r=s.toCharArray();
		int n=r.length;
		int[] a=new int[10]; 
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(r[i]==r[j]){
					a[i]=j++;
				}
			}
		}
	/*
    	Map<Character, Integer> m = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (m.containsKey(s.charAt(i))) {
				m.put(s.charAt(i), ((int) m.get(s.charAt(i)) + 1));
			} else {
				m.put(s.charAt(i), 1);
			}
		}

		List list = new ArrayList(m.entrySet());
		
//short the list in descending order on basic of values.
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		
		System.out.println(list);
		
		List<Integer> top3 = new ArrayList<Integer>(list.subList(0, list.size()-3));//take only first 3 
	    System.out.println(top3);
	*/
	}
}