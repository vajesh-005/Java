package Override;

public class JobHolder extends Adult{
    private String field;
    private double salary;
    private int experience;

    public void setField(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }
    public JobHolder(String name , String gender , int age , long aadharNo,int voterId,int panCardNo , String field , double salary , int experience ){
        super(name , gender , age , aadharNo, voterId , panCardNo);
        this.field = field;
        this.salary=salary;
        this.experience=experience;
    }

    public void printDetails(){
        super.printDetails();
        System.out.println("Job Domain :"+ field);
        System.out.println("Salary :"+ salary);
        System.out.println("Experience :"+ experience + "Years");
    }
}
