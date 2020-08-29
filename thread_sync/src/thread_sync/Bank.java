
package thread_sync;

public class Bank {
    private int balance;
    
    public Bank(){}
    
    public Bank(int balance){
        this.balance = balance;
    }
    
    //synchronized metot , erişen ilk thread işini bitirmeden diğeri bu metota erişemez.
    public synchronized void withDraw(String name,int amount){
        if(amount > balance)
            System.out.println(name + ": Out of money in your account");
        else{
            balance -= amount;
            System.out.println(name + ": Remaining amount is " + balance);
        }
    }
}
