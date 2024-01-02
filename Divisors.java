/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int divisor = 1;
		while(divisor <= num) {
			if(num%divisor == 0) 
			System.out.println(divisor);
			divisor ++ ;
		
	}
}
}

