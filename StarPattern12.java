package star_Pattern;

public class StarPattern12 {

	public static void main(String args[]) {
		
		for(int i=1;i<=4;i++) {
			
			for(int j=4;j>=i;j--) {
				
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				
				System.out.print("*");
				
			} //till here u get a left facing  triangle 
			 	
	/* like the one below
	 
			  *
			 ** 
			*** 
		   **** 
			             */
			
			for(int l=2;l<=i;l++) {
				
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
	
}
