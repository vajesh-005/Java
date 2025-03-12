package Practice;

import java.util.*;

public class ListPractice  {
    public static void main(String[] args) {

        List<String> arr1= Arrays.asList("sudharshan" ,"vajesh" , "kavi" , "sudharshan" , "karthi" , "sridhar" , "sudharshan" , "vajesh");
        List<String> arr2=Arrays.asList("sudharshan" , "sridhar");
//        List<String> arr2 = null;
        TreeMap<String,Boolean> tree = new TreeMap();
        for(String item : arr2){
            tree.put(item , true);
        }
        if(arr1==null || arr2==null) {
            throw new IllegalArgumentException("Arrays cannot be empty");
        }
        if(arr1.size()<arr2.size()){
            throw new IllegalArgumentException("Array two cannot be bigger than Array1");
        }
        if(hasDuplicates(arr2)){
            throw new IllegalArgumentException("dupicates are not allowed");
        }
        System.out.println(tree);

    HashMap<String,Integer> map = new HashMap<>();
    for(String each:arr1){
        if(map.containsKey(each)){
        map.put(each , map.get(each)+1);
        } else {
            map.put(each , 1);
        }
    }
    StringBuilder result = new StringBuilder();
    for(String item : tree.keySet()){
        result.append(item+":"+map.get(item)+"\n");
    }
        System.out.println(result);
    }
     static boolean hasDuplicates(List<String> arr){
        Set<String> set = new HashSet<>();
        for(String item:arr){
            if(!set.add(item)){
    return true;
            }
        }
        return false;
    }
}
