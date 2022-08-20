package Bank;

public class CurrentAccount extends Account {

    // public Current(String name, int accountNo) {
    //     super(name, accountNo);
    //     
    // }

    public void assignType(){
        this.type = "current";
    }

    public CurrentAccount(String name, int accountNo){
        this.name = name;
        this.accountNo = accountNo;
        assignType();
    }
    


    
}
