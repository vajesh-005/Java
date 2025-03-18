package Practice;

import java.util.*;

public class WordFrequency {

    public static List<String> getWordsWithFrequency(List<String> arr , int k){
        Map<String , Integer> map = new TreeMap<>();

        for(String item : arr){
            if(map.containsKey(item)){
                map.put(item , map.get(item)+1);
            } else{
                map.put(item , 1);
            }
        }

        List<String> arr2 = new ArrayList<>();
        for(String item : map.keySet()){
            if(map.get(item)==k){
                arr2.add(item);
            }

        }

        return arr2;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int k = scan.nextInt();
        List<String> arr = Arrays.asList(input.split(" "));

        List<String> result = getWordsWithFrequency(arr , k);


        for(String item : result){
            System.out.println(item);
        }
    }
}
