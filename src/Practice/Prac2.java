package Practice;//com.fssa.studentdb

public class Prac2 {
    public static void main(String[] args) {
        StudentsInfo informations = new StudentsInfo();
        informations.setName("Vajesh");
        informations.setAge(18);
        informations.setMarks(98);
        informations.printDetails();


        StudentsInfo Informations2 = new StudentsInfo("Sridhar" , 21 , 89);
        Informations2.printDetails();

    }
}
class StudentsInfo{
   private String name;
    private int age;
    private float marks;

    public StudentsInfo(){

    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setMarks(float marks){
        this.marks = marks;
    }
    public float getMarks(){
        return this.marks;
    }
    public StudentsInfo(String name , int age , float marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public void printDetails(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
    }
}
