/**
 * 
 */
package src;

/**
 * @author h.hu
 *
 */
public class GAME {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**

		 *

		 * Name: Hongjiao Hu

		 * Teacher: Mr. Hardman 

		 * Assignment 4, Program 3

		 * Date Last Modified: 2016/11/17

		 *

		 */

 
		for(int i= 1; i <= 100; i++){
			if(i % 15 == 0){
				System.out.println("FizzBuzz");
			}else if(i % 3 == 0){
				System.out.println("Fizz");
			}else if(i % 5 == 0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}

}
