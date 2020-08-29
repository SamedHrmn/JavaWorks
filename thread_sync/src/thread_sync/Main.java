
package thread_sync;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        
        Bank b = new Bank(900);
        BankOperation work_one = new BankOperation(b, "Samed",500);
        BankOperation work_two = new BankOperation(b, "Beyza", 600);
        
        //start() metodu run() içinde yeni bir thread oluştururken
        //çağrılan run() metodu run() içerisinde mevcut threadi kullanır.
        //multi-tasking için start() çağrılmalı.
        work_one.start();
        work_two.start();
    }
    
    static class BankOperation extends Thread{
        private Bank b;
        private String name;
        private int amount;
        
        
        public BankOperation(Bank b , String name , int amount){
            this.b = b;
            this.name = name;
            this.amount = amount;
        }
        

        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            b.withDraw(name, amount);
        }
        
        
        
    }
    
}
