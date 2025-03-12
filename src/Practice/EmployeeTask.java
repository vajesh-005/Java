package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfLines = scan.nextInt();
        scan.nextLine();

        List<String> arr = new ArrayList<>(numOfLines);
        Employee empObj = new Employee();

        for (String item : arr) {
            String[] split = item.split(",");
            empObj.name = split[0];
            empObj.age = Integer.parseInt(split[1]);
            empObj.salary = Double.parseDouble(split[2]);

        }


        for (int i = 0; i < numOfLines; i++) {
            String input = scan.nextLine();
            arr.add(input);
        }
scan.close();
        System.out.println(arr);
    }

}

class Employee {
    String name;
    int age;
    Double salary;

    public Employee() {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

}
