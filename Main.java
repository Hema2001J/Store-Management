import java.util.Scanner;

public class Main {
        static Scanner s ;
        static Database db ;
        static Account account;
    public static void main(String[] args) {

        db = new Database();
        
        System.out.println("Welcome to our Restaruent");
         s = new Scanner(System.in);
        
        System.out.println("1.login\n2.Create New Account");
        int n = s.nextInt();

        switch (n) {
            case 1:
                login();
                break;

            case 2:
              newCreateAcc();
              break;

            default:
            System.out.println("Something error!.....");
                break;
        }
    }
    private static void login(){
        System.out.println("Enter the email : ");
        String email = s.next();
        System.out.println("Enter the password : ");
        String password = s.next();

        int i = db.login(email, password);

        if (i != -1) {
            Account account =  db.getAccount(i);
            System.out.println("Welcome back : " + account.getName());
            account.menu(db, account);
        }
        else{
            System.out.println("Account not created.....");
        }

    }
    private static void newCreateAcc(){
        System.out.println("Enter the name : ");
        String name = s.next();
        System.out.println("Enter the phoneNumber : ");
        String phoneNumber = s.next();
        System.out.println("Enter the email : ");
        String email = s.next();
        System.out.println("Enter the password :");
        String password = s.next();

        System.out.println("1. Admin\n2. Guest");
        Account account;
        switch (s.nextInt()) {
            case 1:
                account = new Admin(name, phoneNumber, email, password);
                db.addAccounts(account);
                account.menu(db , account);
                break;
            case 2:
               account = new Guest(name, phoneNumber, email, password);
               db.addAccounts(account);
               account.menu(db , account);
               break;
            default:
               System.out.println("Bye......");
                break;
        }


    }
}