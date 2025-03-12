package Practice;

import java.util.*;

/**
 * Create a list of Sorted Employee names.
 * Can't add the same employee again in the department
 *
 *
 */
public class AssessmentDemo {

    static String departwiseSortedPrinting(List<String> departmentNameList) {
        TreeMap<String, TreeSet<String>> map = new TreeMap<>();
        
        for(String each : departmentNameList ){
            String[] split = each.split(",");
            String dept = split[0];
            String emp = split[1];
            
            if(!map.containsKey(dept)){
                map.put(dept ,new TreeSet<>());
            }
                map.get(dept).add(emp);

        }
        StringBuilder result = new StringBuilder();
        for(String dept : map.keySet()){
            result.append(dept).append(":").append(map.get(dept)).append("\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Dont change the code below
        Scanner sc = new Scanner(System.in);
        int numOfLines = sc.nextInt();
        sc.nextLine();
        List<String> inputLines = new ArrayList<String>(numOfLines);

        for(int i = 0; i < numOfLines; i++) {
            inputLines.add(sc.nextLine());
        }

        sc.close();
        System.out.println(departwiseSortedPrinting(inputLines));
        System.out.println(inputLines);
    }
}
