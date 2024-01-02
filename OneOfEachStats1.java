/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		int T = Integer.parseInt(args[0]) ; 
		double sum = 0; 
		int child2 = 0;
		int child3 = 0; 
		int child4 = 0; 
		
		for(int i = 0; i < T; i++) {

			boolean boy = true;
			int numOfChild = 1;
			double r1 = Math.random();

			if(r1 <= 0.5) {             
				while(boy == true) {				// in this case we have a boy
					r1 = Math.random();
					numOfChild += 1;
						if(r1 <= 0.5) { 
							boy = true; 				// we have another boy
						}
						else {
							boy = false; 				// we have a girl and we don't need to continue
						} 
				}

				sum = sum + numOfChild ; 
			}  

			else {
				boy = false;						// in this case we have a girl					
				while(boy == false) {
					r1 = Math.random();
					numOfChild += 1;
					if(r1 <= 0.5) { 
						boy = true;    				// we have a boy and we don't need to continue
					}
					else {
						boy = false;				// we have another girl
					}			
				}
				sum = sum + numOfChild ;
			}

			if (numOfChild == 2)
			child2++;
			else if (numOfChild == 3)
			child3++; 
			else if (numOfChild >= 4)
			child4++;
		}

		System.out.println("Average: " + sum/T + " children to get at least one of each gender." );
		System.out.println("Number of families with 2 children: " + child2 );
		System.out.println("Number of families with 3 children: " + child3 );
		System.out.println("Number of families with 4 or more children: " + child4 );
		
		if (child2 >= child3 && child2 >= child4) 
			System.out.println("The most common number of children is 2.");
		else if (child3 >= child2 && child3 >= child4) 
			System.out.println("The most common number of children is 3.");
		else if(child4 >= child2 && child4 >= child3) 
			System.out.println("The most common number of children is 4 or more.");
	}
}
