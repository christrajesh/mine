package mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class AcidNeutPerm {

	static int line = 1;
	static Set<String> set = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		String acid = "";
		String neut = "";
		for (int j = 1; j <= num; j++) {
			if (!acid.isEmpty())
				neut = neut + "N";
			acid = acid + "A";

		}

		System.out.println("Sample ::" + acid + "-" + neut);
		int len = (acid + neut).length();

		set = new HashSet<String>();
		ArrayList<String> ar=new ArrayList();
		permute(acid + neut, 0, len - 1);
		for (String ss : set) {
			char[] c = ss.toCharArray();
			int q = 0;
			for (char cc : c) {
				if (cc == 'A')
					q++;
				else if (cc == 'N')
					q--;
				if (q == 0)
					break;

			}
			if (q > 0)
				ar.add(ss);
//				System.out.println(line++ + " \t: " + ss);
		}
		Collections.sort(ar);
		for(String ss:ar)
			System.out.println(line++ + " \t: " + ss);

	}

	private static void permute(String s, int idx, int len) {
		// System.out.println("Permute funtion called :: " + s + " : " + idx + " : " +
		// len);
		// TODO Auto-generated method stub
		if (idx == len) {
			// System.out.println(line+++" \t: "+ s);
			set.add(s);
		} else

			for (int i = idx; i <= len; i++) {

				s = swap(s, idx, i);
				permute(s, idx + 1, len);
				s = swap(s, idx, i);
			}
	}

	private static String swap(String s, int idx, int len) {
		// TODO Auto-generated method stub
		char[] c = s.toCharArray();
		char temp = c[idx];
		c[idx] = c[len];
		c[len] = temp;
		return String.valueOf(c);

	}

}
