/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String str = args[0]; 
		int n = str.length() - 1;
		String r = "";

		while(n >= 0) {
			r = r + str.charAt(n);
			n-- ; 
		}
		int x = (str.length()-1) / 2 ; 

		System.out.println( r );
		System.out.println( "The middle character is " + str.charAt(x) ) ;
	}
}
