import java.util.Scanner;
/**
 * 
 */

/**
 *
 * Name: Laturski, Garrett William
 * Teacher: Mr.Hardman
 * Assignment #3
 * Date Last Modified: 
 *
 */
public class SqRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		double userNum;
		
		do {
		
			System.out.print("Please enter a number. ");
			userNum = userInput.nextDouble();
				
			if(userNum < 0){
				System.out.print("enter a number that's 0 or over");	
			}
			
		}while(userNum < 0);
		
		System.out.println(Math.sqrt(userNum));
		

		
		
	}

}