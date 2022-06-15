import java.io.IOException;
import java.util.Scanner;

public class TransactionSummary {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
		
		int noOfTransaction = sc.nextInt();

	    int[] transations = new int[noOfTransaction];
		
	    System.out.println("Enter the total no of targets that needs to be achieved");
		for(int i=0; i<noOfTransaction; i++)  
		{  
			transations[i] = sc.nextInt(); 
		}  
		System.out.println();
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noOfTargets=sc.nextInt();
		
		System.out.println("Enter the value of target");
		int number=sc.nextInt();
		CalculateTarget(noOfTargets,transations,number);
	}
	
	public static void CalculateTarget(int noOfTargets,int[] transations,int number)
	 {
	     int counter =0;

	     for (int i = 0; i < noOfTargets; i++) {
	    	 
	    	 number = number - transations[i];
    		 counter++;
	     }
	     if(number > 0) {
	    	 System.out.println("Given target is not achieved");
	     }
	     else{
	    	 
	    	 System.out.println("Target achieved after "+counter+" transactions");
	     }
	     
	     
	 }
}
