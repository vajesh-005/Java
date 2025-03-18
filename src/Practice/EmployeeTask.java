package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


class Employee {
    String name;
    int age;
    Double salary;

    public Employee(String name , int age , double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfLines = scan.nextInt();
        scan.nextLine();

        List<String> arr = new ArrayList<>(numOfLines);
        for (int i = 0; i < numOfLines; i++) {
            String input = scan.nextLine();
            arr.add(input);
        }
        List<Employee> emp = new ArrayList<>();

        for (String item : arr) {
            String[] split = item.split(",");
            String name = split[0];
            int age = Integer.parseInt(split[1]);
            double salary = Double.parseDouble(split[2]);
            emp.add(new Employee(name, age, salary));
        }
        System.out.println(emp);
        System.out.println("Enter a sorting type either it could be age / salary");
        String sortInput = scan.nextLine();
        scan.close();

        if (sortInput.equals("salary")) {
            Collections.sort(emp, (a, b) -> Double.compare(a.salary, b.salary));
        } else {
            Collections.sort(emp, (a, b) -> Integer.compare(a.age, b.age));
        }
        for (Employee item : emp) {
            System.out.println(item);
        }

    }
}

