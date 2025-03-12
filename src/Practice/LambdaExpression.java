package Practice;

import java.util.Arrays;
import java.util.List;

interface Methods{
    public double functionOfTwoNum(double a , double b);
}
class Method{
    public int function(double a, double b){
        return (int) (a+b);
    }
}
public class LambdaExpression {
    public static void main(String[] args) {

        double a1 = 10;
        double b1 = 10;
        Methods add= (a, b) -> a+b;
        Methods sub = (double a , double b) -> a-b;
        Methods divide = (double a , double b) -> a/b;
        Methods modulo = (double a , double b) -> a%b;

        //Doing various methods using lambda expression:
        System.out.println(add.functionOfTwoNum(a1,b1));
        System.out.println(sub.functionOfTwoNum(a1,b1));
        System.out.println(divide.functionOfTwoNum(a1,b1));
        System.out.println(modulo.functionOfTwoNum(a1,b1));

        List<Integer> arr = Arrays.asList(1,2,3,4,5);

        System.out.println("Odd numbers in the array:"+arr.stream().filter(n->n%2!=0).toList());
        System.out.println("Sum of the array:"+arr.stream().reduce(0, (a,b)->a+b));



    }
}
