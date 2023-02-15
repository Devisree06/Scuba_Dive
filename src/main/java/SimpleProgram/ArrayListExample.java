package SimpleProgram;

import java.util.ArrayList;

public class ArrayListExample {


	    public static void main(String[] args) {
	        ArrayList<String> list = new ArrayList<String>();

	        // Adding elements to the ArrayList
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");

	        // Printing the ArrayList
	        System.out.println("ArrayList: " + list);

	        // Removing an element from the ArrayList
	        list.remove("Banana");

	        // Printing the ArrayList after removing an element
	        System.out.println("ArrayList after removing an element: " + list);

	        // Checking if an element is present in the ArrayList
	        boolean contains = list.contains("Cherry");
	        System.out.println("ArrayList contains Cherry: " + contains);

	        // Getting the size of the ArrayList
	        int size = list.size();
	        System.out.println("Size of ArrayList: " + size);
	        
	        //Getting index of first object in the list
	        System.out.println("Object position in the list: " + list.indexOf("Date"));
	        
	    }
	}



