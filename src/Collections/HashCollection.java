package Collections;

import java.util.HashMap;

public class HashCollection<K, V> {

    private HashMap<K, V> hashMap = new HashMap<>();

    public void printElement() {
        for (K item : hashMap.keySet()) {
            System.out.println(item + "-" + hashMap.get(item));
        }
    }

    public void printObject() {
        System.out.println(hashMap);
    }

    public void addElement(K number, V result) {
        if (number == null || result == null) {
            System.out.println("Null values are not accepted !");
            return;
        }
        hashMap.put(number, result);
    }
    public void deleteElement(K number ){
            hashMap.remove(number);
    }


    public static void main(String[] args) {
        HashCollection<Integer, String> input = new HashCollection<>();
        input.addElement(1, "Vajesh");
        input.addElement(2, "Kavinisha");
        input.addElement(3, "Karthi");

        input.printElement();
        input.printObject();
        input.deleteElement(1 );
        input.printObject();
    }
}


