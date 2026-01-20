package lms.model;

public class Member extends User{
    private int totalIssue = 3;
    private int issued = 0;

    public int getTotalIssue() {
        return totalIssue;
    }

    public void setTotalIssue(int totalIssue) {
        this.totalIssue = totalIssue;
    }

    public int getIssued() {
        return issued;
    }

    public void setIssued(int issued) {
        this.issued = issued;
    }

    public Member(String name){
        super(name);
    }

    @Override
    public void userDashboard() {
        System.out.println("The member id is :"+ getUserId());
        System.out.println("The member name is :" +getName());
    }

    @Override
    public boolean canLend() {
        if(issued < totalIssue){
            return true;
        }
        return false;
    }
}
