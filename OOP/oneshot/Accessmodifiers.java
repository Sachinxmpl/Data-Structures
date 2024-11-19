package OOP.oneshot;

public class Accessmodifiers {
    public static void main(String[] args) {
        BankAccount b = new BankAccount("Sachin","password");
        System.out.println(b.getPass());
    }
}


class BankAccount{
    public String username ; 
    private String password ;

    public  BankAccount(String username , String pass){
        this.username = username ; 
        this.password = pass ; 
    }


    public void setPass(String password){
        this.password = password;
    }

    public String getPass(){
        return this.password ; 
    }
}


//private within class only , even not within package
//by default , java class members are default type 
// default type can be accessed within class , within package