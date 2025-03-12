package Practice;

public class Prac {
    public static void main(String[] args){
        Students Information = new Students();
        Information.Name = "Vajesh";
        Information.Age = 18;
        Information.Gender = 'M';

        Students Info2 = new Students("Kavi" , 21 , 'F');

        System.out.println("StudentName" +":"+ Information.Name);
        System.out.println("StudentAge" +":"+ Information.Age);
        System.out.println("StudentGender" +":"+ Information.Gender);

        System.out.println("StudentName" +":"+ Info2.Name);
        System.out.println("StudentAge" +":"+ Info2.Age);
        System.out.println("StudentGender" +":"+ Info2.Gender);
    }
}

class Students{
    String Name;
    int Age;
    char Gender;

    public Students(){

    }

    public Students (String Name , int Age , char Gender){
        this.Name = Name;
        this.Age = Age;
        this.Gender = Gender;
    }
}
