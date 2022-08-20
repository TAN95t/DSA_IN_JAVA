package Bank;

public class SavingsAccount extends Account{

    // public Savings(String name, int accountNo) {
    //     super(name, accountNo);
    //     //TODO Auto-generated constructor stub
    // }

    public void assignType(){
        this.type = "saving";
    }

    public SavingsAccount(String name, int accountNo){
        this.name = name;
        this.accountNo = accountNo;
        assignType();
    }
    
}
