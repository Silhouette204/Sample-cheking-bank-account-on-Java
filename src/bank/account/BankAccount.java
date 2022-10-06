
package bank.account;

class Account {

   int acc_no;
   float balance;
   String name;
   String email;
   int phonenumber;

   void insert(int a, float bal, String n, String e, int pn ){
       acc_no = a;
       balance = bal;  
       name = n;
       email = e;
       phonenumber = pn;
  
   }
   
   void deposit (float bal) {
       balance = balance + bal;
       System.out.println(bal + "Deposited");
       
      }
   
   void withdraw(float bal){
       if (balance<bal){
           System.out.println("Insufficient balance");
       } else {
       balance = balance  - bal;
            System.out.println(bal + "Withdraw");
   }
}
   void checkBalance(){
       System.out.println("Balance is; " + balance);
   }
   void display() {
       System.out.println(acc_no+" "+balance+" "+name+" "+email+" "+phonenumber);
   }
}
 
  class BankAccount {
      public static void main(String[] args) {
          Account John = new Account();
          John.insert(36912, 5000, "JohnLester", "Johnlester@gmail.com", 63456789);
          John.display();
          John.checkBalance();
          
          
          John.deposit(10000);
          John.checkBalance();
          John.withdraw(10000);
          John.checkBalance();
                  
      }
  }
