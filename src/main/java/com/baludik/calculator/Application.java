/**
 * 
 */
package com.baludik.calculator;

/**
 * @author Anne-SOphie
 *
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 1;
		
		Adition add = new Adition(a);
		add.make(2);
		System.out.println(add.getValue());
		
		add.make(3);
		System.out.println(add.getValue());
		
		System.out.println("Hello w !!!");
	}
	
}
