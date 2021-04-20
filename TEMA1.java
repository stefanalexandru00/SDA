package T1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T11 {
	public static void main(String[] args) throws NumberFormatException, IOException  {
		
        
        System.out.println("Enter two numbers: ");
        
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("x = ");

        int x = Integer.parseInt(rd.readLine());
        System.out.println("y =  ");

        int y = Integer.parseInt(rd.readLine());
     
        int sum = x + y;
        int difference = x - y;
        int product = x * y;
       
        double average = sum / 2;
        
        
        
        System.out.println("Sum of the nubmers: " + sum);
        
        System.out.println("Difference of the numbers: " + difference);
      
        System.out.println("Product of the numbers: " + product);
      
        System.out.println("Average of the numbers: " +  average);
        
        int max = x;
        int min = y;
        
        
        if (x < y) {
            max = y;
            min = x;
        } else {
            max = x;
            min = y;
        }
        int distance = max - min;

        System.out.println("Max integer: " + max);
        System.out.println("Min integer: " + min);
        System.out.println("Distance between the numbers: " +distance );
 
    }

}
