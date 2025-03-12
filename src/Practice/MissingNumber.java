package Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(203 ,204, 205, 206, 207 ,208 ,203, 204, 205, 206);
        List<Integer> brr = Arrays.asList(203 ,204, 204, 205 ,206, 207, 205, 208, 203, 206, 205, 206, 204, 204);

    List<Integer> result = new ArrayList<>();
        for(int i=0;i< brr.size();i++){
            if(arr.contains(brr.get(i))){
//                int index = arr.indexOf(brr.get(i));
                arr.remove(brr.get(i));
            } else{
                if(!result.contains(brr.get(i))){
                    result.add(brr.get(i));
                }
            }
        }
        System.out.println(result);
        }
}
