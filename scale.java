/* Akshya Subbaraman
* Purpose: Write a method called scaleByK that takes an ArrayList of integers as a parameter
and replaces every integer of value K with K copies of itself.
* Pseudocode: Take the integer in the list and save it in num, then remove it from the list.
Add that integer to the list num number of times. The next integer will be pushed to the right
num times, so it will be at an index num spaces to the right. Remove the integer at that index.
Repeat this size (original number of integers in the list) number of times.
* */
import java.util.*;

public class scale {

    public static void main (String [] args) {

        ArrayList<Integer> scale = new ArrayList<Integer>();
        scale.add(4);
        scale.add(1);
        scale.add(2);
        scale.add(0);
        scale.add(3);

        scaleByK(scale);
    }
    public static void scaleByK(ArrayList<Integer> scale ) {

        int size = scale.size();
        int index = 0;
        int num = 0;

        while(size > 0) {
            num = scale.get(index);
            scale.remove(index);
            for(int i = 0; i < num; i++) {
                scale.add(index + i, num);
            }
            index +=num;
            size--;
        }

        System.out.println(scale);
    }
}

