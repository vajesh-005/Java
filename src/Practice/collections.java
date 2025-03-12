package Practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class collections {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Chennai");
        arr.add("Vadachennai");
        arr.add("Kozhumanivakkam");
        arr.add("Ooty");

        System.out.println(arr + "Before");
        Collections.sort(arr);
        System.out.println(arr + "After");
    }
}
