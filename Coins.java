/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int coins_input = Integer.parseInt(args[0]);
		int cent = 1;
		int quarter = 25 * cent;
		int num_of_quarters_in_coins_input = coins_input/quarter;
		int coins_input_modulo_quarter = coins_input % quarter ;
		System.out.println("Use " + num_of_quarters_in_coins_input + " quarters and "
				                  + coins_input_modulo_quarter + " cents");
	}
}
