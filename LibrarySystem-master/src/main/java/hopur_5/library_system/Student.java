package hopur_5.library_system;

public class Student extends User{
    private boolean feePaid;
    Student(String name, boolean feePaid){
        super(name);
        this.feePaid = feePaid;
    }

    public boolean isFeePaid() {
        return feePaid;
    }

    public void setFeePaid(boolean feePaid) {

        this.feePaid = feePaid;
    }

}
