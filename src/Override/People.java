package Override;


public class People{
    public static void main(String[] args) {
//        PeopleDetails obj = new PeopleDetails
//                ("Vajesh" , "Male" , 18 , 584853584811L);
//        obj.printDetails();
//
//        Adult obj2 = new Adult
//                ("Sudharshan" , "Male" , 18 , 584853584831L, 2345 , 234);
//        obj2.printDetails();

        JobHolder obj3 = new JobHolder("Vajesh" , "Male",18 , 584853584811l,1234,1234  ,  "Software Developer" , 35000 , 2);
        obj3.printDetails();
    }
}
class PeopleDetails {
    private String name;
    private String gender;
   private int age;
   private long aadharNo;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setAadharNo(long aadharNo) {
        this.aadharNo = aadharNo;
    }

    public long getAadharNo() {
        return aadharNo;
    }

    public PeopleDetails(String name, String gender, int age, long aadharNo, int voterId, int pancardNo){
    }
    public PeopleDetails(String name , String gender , int age , long aadharNo){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.aadharNo = aadharNo;
    }
    public void printDetails(){
        System.out.println("Name :"+this.name);
        System.out.println("Gender :"+this.gender);
        System.out.println("Age :"+this.age);
        System.out.println("AadharNo :"+this.aadharNo);
    }
}
