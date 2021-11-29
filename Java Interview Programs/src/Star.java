
public class Star {
	public void normaltrianglestar() {
		int row = 5;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public void numerprint() {
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public void righttriangleside() {
		int x, y, row = 5;
		// outer loop for number of rows
		for (x = 1; x <= row; x++) {
			// inner loop for columns
			for (y = 2 * (row - x); y > 0; y--) {
				// To prints spaces
				System.out.print(" ");
			}
			// Inner loop for columns
			for (y = 1; y <= x; y++) {
				// To prints stars
				System.out.print("* ");
			}
			// Cursor goes to the new line after printing each line
			System.out.println();
		}
	}

	public void pyramidstar() {
		int x, y, row = 5;
		// Outer loop for rows
		for (x = 1; x <= row; x++) {
			// inner loop for space
			for (y = row - x; y > 0; y--) {
				// To print space between two stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (y = 1; y <= x; y++) {
				// To print star
				System.out.print("* ");
			}
			// Cursor goes to the new line after printing each line.
			System.out.println();
		}
	}

	public void fibonacci() {
		int a = 0, b = 1, c, count = 10;
		System.out.print(a + "," + b);
		for (int i = 2; i < count; i++) {
			c = a + b;
			System.out.print("," + c);
			a = b;
			b = c;

		}
		System.out.println();
	}

	public void reversestringbuffer() {

		StringBuffer a = new StringBuffer("Kavya");
		System.out.println(a.reverse());

	}

	public void reversestring() {
		String a = "Kavya";
		// System.out.println("hii");
		for (int i = a.length() - 1; i >= 0; i--) {
			// System.out.println(a.length());
			System.out.print(a.charAt(i));
		}

	}

	public void largestvalue() {
		int[] arr = { 2, 76, 45, 23, 235, 789 };
		int val = arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			if (val < arr[i])
				val = arr[i];
		}
		System.out.println(val);
	}

	public void primemnumber() {
		int i = 0;
		int num = 0;
		String primeNumbers = "";

		for (i = 1; i <= 20; i++) {
			int counter = 0;
			for (num = i; num >= 1; num--) {
				System.out.println(i+","+num);
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}
	public void swap()
	{
		int a=2,b=3,c;
		System.out.println("Before:"+a+","+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After:"+a+","+b);
		
	}
	public void factorial()
	{
		int num=6,result=1;
		for(int i=1;i<=num;i++)
		{
			result=result*i;
		}
		System.out.println(result);
	}

	public static void main(String args[]) {
		Star s = new Star();
		// s.righttriangleside();
		// System.out.println();
		// s.normaltrianglestar();
		// System.out.println();
		// s.pyramidstar();
		// s.largestvalue();
		// System.out.println();
		// s.numerprint();
		// s.fibonacci();
		// s.reversestring();
		//s.primemnumber();
		//s.swap();
		s.factorial();
	}
}
