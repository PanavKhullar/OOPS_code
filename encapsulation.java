class Account{
    private String Password;

    public String getPassword(){
        return this.Password;
    }

    public void setPassword(String pass){
        this.Password=pass;
    }
}

public class encapsulation {

    public static void main(String[] args) {
        Account a=new Account();
        a.setPassword("abcd");
       System.out.println(a.getPassword()); 
    }
}