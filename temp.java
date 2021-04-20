package pack;

import java.util.ArrayList;
import java.util.Arrays;

public class temp {

	 public static void main(String[] args) {
		 

	        double[] temperatures = {37.3, 35.8, 37.1, 40.0, 36.5};

	        ArrayList<Double> n_temp = new ArrayList<Double>();
	        
	        ArrayList<Double> h_temp = new ArrayList<Double>();
	        
	        System.out.println("Temperatures: " + Arrays.toString(temperatures));

	        for(int i = 0; i < temperatures.length; i++) {
	        	
	            if(temperatures[i] > 37.0) {
	            	
	                h_temp.add(temperatures[i]);
	             
	                
	                System.out.println("Temperature nubmer " + i+ " is too high = " + temperatures[i]);
	            }
	            else {
	            	
	                n_temp.add(temperatures[i]);
	                
	                System.out.println("Temperature " + i + " is normal  = " + temperatures[i]);
	            }

	        }
	        System.out.println("Normal temperatures: " + n_temp);
	        System.out.println("High temperatures: " + h_temp);

	    }
	}


