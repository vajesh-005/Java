package Override;

public class Adult extends PeopleDetails{
    private int voterId ;
    private int panCardNo;

    public void setPanCardNo(int panCardNo) {
        this.panCardNo = panCardNo;
    }

    public int getPanCardNo() {
        return panCardNo;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public int getVoterId() {
        return voterId;
    }

    public Adult(String name , String gender , int age , long aadharNo , int voterId , int panCardNo ){
        super(name,gender,age,aadharNo);
        this.voterId = voterId;
        this.panCardNo = panCardNo;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println("VoterId :"+this.voterId);
        System.out.println("PancardNO :"+this.panCardNo);
    }
}
