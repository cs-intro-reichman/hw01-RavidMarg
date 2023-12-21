/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
public class Triangle {
	public static void main(String[] args) {
		int side_1 = Integer.parseInt(args[0]);
		int side_2 = Integer.parseInt(args[1]);
		int side_3 = Integer.parseInt(args[2]);
		System.out.println( side_1 + ", " + side_2 + ", " + side_3 + ": " + (side_3 < (side_1 + side_2) || side_2 < (side_1 + side_3) || side_1 < (side_2 + side_3) ));
	}
}
