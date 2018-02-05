package mypackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class PrimeFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test();
		int number = 15;
		int[] primeFloors = new int[number];
		int idx = 0;
		for (int i = 0; idx < number; i++) {
			int count = 0;
			for (int j = 1; j <= (i / 2); j++) {
				if (i % j == 0)
					count++;
			}
			if (count == 1)
				primeFloors[idx++] = i;
		}
		for (int j : primeFloors) {
			System.out.println(j);
		}

		int numOfFloor = 4;
		int floor = primeFloors[numOfFloor - 1];

		System.out.println("floor ::" + floor);

		// int[] floors=new int[] {2,3,5,7,11,13,17,19,23,29};
		String[] perm = new String[numOfFloor];
		idx = 0;
		for (int j = 0; j < numOfFloor; j++) {
			perm[idx++] = "" + primeFloors[j];
//			System.out.println(j);

		}
		int count = 0;
		Set<String> set = new HashSet();
		for (int k = 1; k <= perm.length; k++) {
			String[] s = listAll(perm, k);
			for (String ss : s) {
				String[] nums = ss.split(",");
				int[] arr=Arrays.stream(nums).mapToInt(Integer::parseInt).toArray();// sort(nums);
				Arrays.sort(arr);
				nums=Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new);
				int sum = 0;
				String temp="";
				for (String num : nums) {
					sum = sum + Integer.parseInt(num);
					temp+=num+":";
				}
				if (sum == floor)
					set.add(temp);
					
			}
		}
		System.out.println(set);
	}

	static String[] listAll(String[] elements, int size) {

		String[] str = new String[(int) Math.pow(elements.length, size)];
		if (size == 1)
			return elements;
		else {
			String[] s = listAll(elements, size - 1);
			int idx = 0;
			for (int i = 0; i < s.length; i++) {
				for (int j = 0; j < elements.length; j++) {
					str[idx++] = s[i] + "," + elements[j];
				}
			}
			return str;
		}

	}
	
	static void  test() {
		
		ArrayList<Integer> ar=new ArrayList<Integer>() {{
			add(03);
			add(20);
			add(15);
			add(10);
			add(04);
			
		}};
		Collections.sort(ar);
		System.out.println(ar);
	}

}
