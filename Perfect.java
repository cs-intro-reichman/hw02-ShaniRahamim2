/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]); 
		int sum = 0 ;
		for(int divisor = 1; divisor < num; divisor++) {
			if(num%divisor == 0) {
				sum = sum + divisor ; 
			}
		}
		if(num==sum) {
			System.out.print(num + " is a perfect number since " + num + " = " + "1"); 
			for(int divisor = 2; divisor < num; divisor++) {
			    if(num%divisor == 0) {
			    System.out.print(" + " + divisor);
			    }
		    }
		}
		else 
			System.out.println(num + " is not a perfect number ");
	}
}
