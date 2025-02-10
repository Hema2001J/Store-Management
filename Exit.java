import java.util.Scanner;

public class Exit implements IoOperation{
   Scanner s = new Scanner(System.in);
    Database db;
    Account account;

    @Override
    public void oper(Database db , Account account) {
        this.db = db;
        this.account = account;
        System.out.println("Are you sure to exit ?\n1.Exit\n2.Main Menu");
       
        int n = s.nextInt();

        if(n == 1) {
           
            System.out.println("0.Exit\n1.Login\n2.New Account User");
            int num =  s.nextInt();
    
            switch (num) {
                                case 1:
                                    login();
                                    break;
                    
                                case 2:
                                  newUser();
                                  break;    
                            
                                default:
                                  
                                    break;   
                            }
            }
            else{
                account.menu(db, account);
            }
        }

            public  void login() {
                System.out.println("Enter Email :");
                String email = s.next();
                System.out.println("Enter Password : ");
                String password = s.next();

                int n = db.login(email,password);

                if(n != -1){

                 Account account = db.getAccount(n);
                 System.out.println("Welcome back : " + account.getName() );
                 account.menu(db, account);
                 System.out.println();

                }
                else{
                 System.out.println("User doesn't have  created account ........");
                }
                

             }
             public void newUser(){
              System.out.println("Enter the name : ");
              String name = s.next();
              System.out.println("Enter the phoneNumber : ");
              String phoneNumber = s.next();
              System.out.println("Enter the email : ");
              String email = s.next();
              System.out.println("Enter the password :");
              String password = s.next();

                 System.out.println("1.Admin\n2.Guest");
                 int num1 = s.nextInt();
                 Account account = null ;
                 if (num1 == 1) {
                       account = new Admin(name, phoneNumber, email, password);
                     

                  }
                  else if(num1 == 2){
                      account = new Guest(name, phoneNumber, email, password);
                      
                  }
                  db.addAccounts(account);;
                  account.menu(db, account);


             }


                           
         
             
                            
           
    
  
   
}

