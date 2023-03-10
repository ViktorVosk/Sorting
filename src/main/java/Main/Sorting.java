package Main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
/**
 * @author Viktor Voskoboinikov
 */
public class Sorting {
    /**
     *Number of integers you provide to sort
     */
    static int quantity;
    /**
     *
     * <p>Main method to run program</p>
     *
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many integers you want to sort? Up to 10");
        quantity = setQuantity(sc.nextInt());
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter your " + quantity + " numbers:");
        for (int i = 0; i < quantity; i++) {
            numbers.add(sc.nextInt());
        }
        ArrayList<Integer> sorted = sort(numbers);
        System.out.println("Your sorted numbers are:");
        System.out.println(sorted);
    }
    /**
     *   <p>
     *       Set quantity of numbers to sort
     *   </p>
     *@param a Number of integers you provide to sort
     * @return number of allowed numbers to be sorted or throws exception
     */
    public static int setQuantity(int a){
        if (a > 0 && a <= 10) return a;
        throw new IllegalArgumentException();
    }
    /**
     *   <p>
     *      This method sorts provided Arraylist
     *   </p>
     *@param toSort ArrayList of integers to sort
     * @return sorted arraylist of integers
     */
    public static ArrayList<Integer> sort(ArrayList<Integer> toSort){
        Collections.sort(toSort);
        return toSort;
    }
}
