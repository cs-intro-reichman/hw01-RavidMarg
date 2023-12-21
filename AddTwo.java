/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		int first_int = Integer.parseInt(args[0]);
		int second_int = Integer.parseInt(args[1]);
		System.out.println(first_int + " + " + second_int + " = " + (first_int + second_int));
	}
}
