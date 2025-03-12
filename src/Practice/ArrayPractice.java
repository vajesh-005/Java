package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        System.out.println(arr);

        for(int i=0;i< arr.size();i++) {
            System.out.println(arr.get(i) + "item");
        }

        int [] arr1 = {1,2,3,4};
        System.out.println(Arrays.toString(arr1));
    }
}
