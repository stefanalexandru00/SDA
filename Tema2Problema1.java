package T2P1;

import java.util.Scanner;

public class main {

	 

	    
	    static int vd1(String type) {
	        if (type.equals("Zona rezidentiala"))
	            return 30;
	        else if (type.equals("Oras"))
	            return 50;
	        else if (type.equals("Drum express"))
	            return 100;
	        else if (type.equals("Autostrada"))
	            return 130;
	        else
	            return 0;
	    }

	    static int vd2(String s) {
	        int viteza;
	        switch (s) {
	            case "Zona rezidentiala":
	                viteza = 30;
	                break;
	            case "Oras":
	                viteza = 50;
	                break;
	            case "Drum express":
	                viteza = 100;
	                break;
	            case "Autostrada":
	                viteza = 130;
	                break;
	            default:
	                viteza = 0;
	        }
	        return viteza;
	    }
	    static int vd3(String type) {
	        if (type.equals("Zona rezidentiala"))
	            return 30;
	    else {
	            if (type.equals("Oras"))
	                return 50;
	     else {
	                if (type.equals("Drum express"))
	                    return 100;
	      else {
	                    if (type.equals("Autostrada"))
	                        return 130;
	                else
	                        return 0;
	                }
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String Type;
	        Scanner stdin = new Scanner(System.in);
	        System.out.println("Introduceti tipul de drum (Zona rezidentiala, Oras, Drum express, Autostrada): ");
	        Type = stdin.nextLine();
	        System.out.println("Viteza1 :" + vd1(Type));
	        System.out.println("Viteza2 : " + vd2(Type));
	        System.out.println("Viteza3 : " + vd3(Type));

	    }
	}
