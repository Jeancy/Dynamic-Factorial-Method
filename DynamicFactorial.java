/*
 * Implementing the Factorial method using dynamic programming and memorization
 * Never calculate the same thing over and over, use what exists to save the time is the main
 *
 */
package dynamicfactorial;
import java.util.*;

/**
 *
 * @author Jeancy Tshibemba
 */
public class DynamicFactorial {
    private static List<Integer> cacheMemory = new ArrayList<>();// variable to save and keep track of the input
    /**
     * 
     * @param input the number for which we are calculating the factorial
     * @return the factorial of the number
     */
    public static Integer  computeFactorial(Integer input){
        if ((input == 0) || (input == 1)) { // corner case or base case of the recursion. 
            return 1; // The factorial of 0 or 1 is 1 so this is our corner case.
        }else{ // Calculating the factorial for the numbers different from 0 or 1.
            if(cacheMemory.size() >= input){ // Testing if the input number is less or equal to the cashe size.
                System.out.println("Retrieved from the cache: " + input); 
                return cacheMemory.get(input - 1);// if the condition is true we return this value.
            }
            System.out.println("Calculate for input: "+ input);// Only for the value not in cache
            int factorial = input * computeFactorial(input - 1); // compute for the new value
            cacheMemory.add(factorial); // saving the new value in the cache
            return factorial; // Returning the value computed.
         } 
    }
    /**
    *
    *Function that return an ArrayList of the cache.
    *
    */
    public static List<Integer> getCacheMemory(){
        return cacheMemory;
    }
        public static void main(String[] args) {
        System.out.println("The factorial of 5 is: "+computeFactorial(5));//Test case 1
        System.out.println("The values stored in the cache are "+ getCacheMemory());//Test case cache 1
        System.out.println("The factorial of 8 is: "+computeFactorial(8));//Test case 2
        System.out.println("The values stored in the cache are "+ getCacheMemory());//Test case 2 cache    }
    }
}
