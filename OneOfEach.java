
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

		boolean boy = true;
		int numOfChild = 1;
		double r1 = Math.random();

		if(r1 <= 0.5) {             
			System.out.print("b ");    			// in this case we have a boy
			while(boy == true){
				r1 = Math.random();
				numOfChild += 1;
				if(r1 <= 0.5) { 
					boy = true;
					System.out.print("b ");		// we have another boy
				}
				else {
					boy = false;
					System.out.print("g ");		// we have a girl and we don't need to continue
				} 
			}
		}  
		else {
			System.out.print("g ");				// in this case we have a girl
			boy = false;						
			while(boy == false) {
				r1 = Math.random();
				numOfChild += 1;
				if(r1 <= 0.5) { 
					boy = true;    				// we have a boy and we don't need to continue
					System.out.print("b ");
				}
				else {
					boy = false;
					System.out.print("g ");		// we have another girl
				}	
		}
}
System.out.println();
System.out.println( "You have made it... and you now have " + numOfChild + " children.");

}

}



