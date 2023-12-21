/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int range = b - a;
		int random_int_1 = (int)(Math.random() * range) + a;
		int random_int_2 = (int)(Math.random() * range) + a;
		int random_int_3 = (int)(Math.random() * range) + a;

		int min_int = Math.min(Math.min(random_int_1 ,random_int_2), random_int_3);

		System.out.println(random_int_1);
		System.out.println(random_int_2);
		System.out.println(random_int_3);
		System.out.println("The minimal generated number was " + min_int);
	}
}
