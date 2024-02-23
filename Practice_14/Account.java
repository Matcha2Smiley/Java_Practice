public class Account {
    protected String accountNumber;
    protected int balance;

    public Account(String an, int bl){
        this.accountNumber = an;
        this.balance = bl;
    }

    public Account(String an){
        this.accountNumber = an;
        this.balance = 0;
    }

    public String toString(){
        return  "¥" + this.balance + "(口座番号=" + this.balance + ")";
    }

    public boolean equals(Account ac){
        if(this == ac){
            return true;
        } 
        if(ac instanceof Account){
            Account temp = (Account) ac;
            if(this.accountNumber.trim().equals(ac.accountNumber.trim()) ) {
                return true;
            }
        }
        return false;
        
    }

}
