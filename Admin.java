import java.util.Scanner;

public class Admin extends Account {
    
    public Admin(){
        super();

        this.operations = new IoOperation[] {
            new showMenu(),
            new addItems(),
            new deleteItem(),
            new editItems(),
            new Exit()
        };
    }

    public Admin(String name , String phoneNumber , String email , String password){
        super(name, phoneNumber, email, password);

        this.operations = new IoOperation[] {
            new showMenu(),
            new addItems(),
            new deleteItem(),
            new editItems(),
            new Exit()
        };
    }
    public void menu(Database db, Account account){
        System.out.println("1.show menu\n2.Add items\n3.Delete items\n4.Edit items\n5.Exit");
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

       this.operations[n-1].oper( db , account);
    }
    

}
