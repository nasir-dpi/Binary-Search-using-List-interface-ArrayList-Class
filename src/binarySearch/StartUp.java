/**
 * 
 */
package binarySearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author 
 *
 */
public class StartUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =new  ArrayList<>();
		list.add(20);
		list.add(50);
		list.add(56);
		list.add(65);
		int key=50;
		int num =Collections.binarySearch(list, key);
		if(num>=0) 
			System.out.println(num);
		else 
			System.out.println("not found");
		
	}

}
