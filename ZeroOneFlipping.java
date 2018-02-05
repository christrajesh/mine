package mypackage;

public class ZeroOneFlipping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = new int[] { 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1 };

		logic1(numbers);
		logic2(numbers);
	}

	private static void logic1(int[] numbers) {
		// TODO Auto-generated method stub
		int len = numbers.length;

		int nextIdx = 0;
		int max = 0;

		while (nextIdx < len) {

			int count = 0;
			if (nextIdx > 0)
				count++;
			while (nextIdx < len) {

				count++;

				if (nextIdx > 0 && numbers[nextIdx] != 0 && numbers[nextIdx - 1] == 0) {
					nextIdx++;
					break;
				}
				nextIdx++;
			}
			if (count > max)
				max = count;
		}
		System.out.println(max);
	}
	
	private static void logic2(int[] numbers) {
		// TODO Auto-generated method stub
		int len = numbers.length;

		int nextIdx = 0;
		int max = 0;

		while (nextIdx < len) {

			int[] copy=numbers.clone();
			while (nextIdx < len) {
			if(copy[nextIdx]==0)
				copy[nextIdx]=1;
			else
				break;
			nextIdx++;
			}
			int count=0;
			for(int i:copy)
				if(i==1) count++;
				else break;
			if (count > max)
				max = count;
			nextIdx++;
		}
		System.out.println(max);
	}

}
