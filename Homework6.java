public class Homework6 {

	/* Finish the constructor and create any necessary instance
	 * variables
	 */
	 private String t;
	 private int x;
	 private int y;
	 private int z;
	public Homework6(String s, int a, int b, int c) {
		t = s;
		x = a;
		y = b;
		z = c;

	}

	/* Return true if the stored String comes before the provided
	 * String lexicographically, return false if it does not
	 */
	public boolean isBefore(String other) {
		/* compareTo will return a negative
		 * number if the first string comes
		 * before
		 */
		if (t.compareTo(other) > 0){
			return true;
		} else{
			return false;
		}

	}

	/* Return the maximum of the stored integers
	 */
	public int max() {
		if (x > y  && x > z){
			return x;
		}else if (y > x && y > z){
			return y;
		} else {
			return z;
		}
	}

	/* Return the middle value of the stored integers. If two numbers
	 * have the same value, return the lowest value. If all three numbers
	 * have the same value, return any. You must call the max() function
	 * to receive full credit
	 */
	public int mid() {
		if ((x > y && x < z) || (x < y && x > z) || ((z == y) && (max() == z))){
			return x;
		} else if (y > x && y < z || (y < x && y > z) || ((z == y) && (max() == z))){
			return y;
		} else {
			return z;
		}
	}

	/* Return true if the stored numbers were provided in ascending
	 * order. They are considered ascending if each number is greater
	 * than or equal to the previous. To get full credit, do not use
	 * >= or =<; instead use < or > and invert them with !
	 */
	public boolean isAscending() {
		if (((x < y) || (x == y)) && ((y < z) || (y == z))){
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		int exitCode = 0;

		Homework6 hw6 = new Homework6("Drive", 4, 5, 6);

		if (hw6.isBefore("Cars")) {
			System.out.println("Pass 1");
		} else {
			System.out.println("Fail 1");
			exitCode += 1;
		}

		if (hw6.max() == 6) {
			System.out.println("Pass 2");
		} else {
			System.out.println("Fail 2");
			exitCode += 1;
		}

		if (hw6.mid() == 5) {
			System.out.println("Pass 3");
		} else {
			System.out.println("Fail 3");
			exitCode += 1;
		}

		hw6 = new Homework6("Drive", 4, 5, 5);
		if (hw6.mid() == 4) {
			System.out.println("Pass 4");
		} else {
			System.out.println("Fail 4");
			exitCode += 1;
		}

		if (hw6.isAscending()) {
			System.out.println("Pass 5");
		} else {
			System.out.println("Fail 5");
			exitCode += 1;
		}

		if (exitCode == 0) {
			System.out.println("All Pass");
		} else {
			System.out.println("Fail");
		}

		System.exit(exitCode);
	}

}
