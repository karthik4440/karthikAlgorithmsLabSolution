import java.util.*;
import java.lang.*;

public class CurrencyDenomination{

 public static void countCurrency(int noOfNotes,int[] notes,int amount)
 {
     int[] noteCounter = new int[noOfNotes];
     
     notes=sortArray(notes,noOfNotes);
     for (int i = 0; i < noOfNotes; i++) {
    	
         if (amount >= notes[i]) {
             noteCounter[i] = amount / notes[i];
             amount = amount - noteCounter[i] * notes[i];
         }
     }

     System.out.println("Currency Count ->");
     for (int i = 0; i < noOfNotes; i++) {
    	
         if (noteCounter[i] != 0) {
             System.out.println(notes[i] + " : "
                 + noteCounter[i]);
         }
     }
 }
 
 public static int[] sortArray(int[] array,int SizeOfArray) {
	 int n, pos, temp, i, j;
	 n=SizeOfArray;
	 for (i = 0; i < (n - 1); i++)
	  {
	    pos = i;
	   
	    for (j = i + 1; j < n; j++)
	    {
	      if (array[pos] < array[j])
	        pos = j;
	    }
	    if (pos != i)
	    {
	      temp = array[i];
	      array[i] = array[pos];
	      array[pos] = temp;
	    }
	  }
	 return array;
	 
 }

 public static void main(String argc[]){
     
     Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denominations");
		
		int noOfCurrency = sc.nextInt();

	    int[] currencyDenominations = new int[noOfCurrency];
		
	    System.out.println("Enter the currency denominations value  ");
		for(int i=0; i<noOfCurrency; i++)  
		{  
			currencyDenominations[i] = sc.nextInt(); 
		}  
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		countCurrency(noOfCurrency,currencyDenominations,amount);
 }

}