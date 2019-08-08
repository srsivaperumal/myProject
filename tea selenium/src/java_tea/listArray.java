package java_tea;

import java.util.ArrayList;

public class listArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lst  = new ArrayList<String>();
		lst.add("zeenu");
		lst.add("ameer");
		lst.add("ravi");
		lst.add("ranji");
		lst.add("vino");
		
		// display Elements 
		//System.out.println(lst);
		/**	
		 * classical for loop
		 */
		for(int i=0;i<lst.size();i++) {
			System.out.println(lst.get(i));
		}
		/**
		 * Adding element with index
		 * 
		 */
		lst.add(0, "siva");
		lst.add(2, "sivaameer");
		/**
		 * Advanced for loop
		 */
		System.out.println("=====Advaced For Loop=======");
		for(String ls:lst) {
			System.out.println(ls);
		}
		
		//System.out.println("updated");
		
	}

}
