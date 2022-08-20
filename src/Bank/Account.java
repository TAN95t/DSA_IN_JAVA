package Bank;

public abstract class Account {
    public String name;
    public String type;
    protected String email;
    public int accountNo;
    private String password;
    
    // getters & setters

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}



