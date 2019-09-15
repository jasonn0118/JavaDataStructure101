/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data101;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Producer
 */
public class GroceryList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	
    	ArrayList<String> groceryList1 = new ArrayList<String>();
//    	ArrayList<String> groceries = new ArrayList<String>(Arrays.asList("Eggs","Ham","Orange","Tooth paste"));
    	groceryList1.add("Eggs");
    	groceryList1.add("Ham");
    	groceryList1.add("Orange");
    	groceryList1.add("Tooth paste");
    	
    	ArrayList<String> groceryList2 = new ArrayList<String>();
    	groceryList2.add("Rice");
    	groceryList2.add("Bread");
    	groceryList2.add("Cheese");
    	
    	System.out.println(groceryList1);
    	System.out.println(groceryList2);
//    	System.out.println(groceryList2.get(0));
    	
    	for (int i = 0; i < groceryList2.size(); i++) {
			groceryList1.add(groceryList2.get(i));
		}
    	System.out.println(groceryList1);
    	
    	String rice = "Rice";
    	for (int i = 0; i <groceryList1.size(); i++) {
			if(rice==groceryList1.get(i)) {
				System.out.println(rice+" is in index of "+(i+1));
				groceryList1.remove(i);
				System.out.println("Rice has been removed.");
			}
		}
    	System.out.println(groceryList1);
    }
    
}
