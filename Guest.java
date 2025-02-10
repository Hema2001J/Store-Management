import java.util.Scanner;

public class Guest extends Account{

    public Guest(){
        super();

        this.operations = new IoOperation[] {
            new Exit(),
            new showMenu(),
            new checkOut()
        };
    }

    public Guest(String name , String phoneNumber , String email , String password){
        super(name, phoneNumber, email, password);

        this.operations = new IoOperation[] {
            new Exit(),
            new showMenu(),
            new checkOut()
        };
    }
    public void menu(Database db, Account account){
        System.out.println("1.Exit\n2.ShowMenu\n3.Checkout");
        // for(Items item : db.items){
        //     System.out.println("Item : "+item.name+" Price :"+item.price);
        //    }
        Scanner s = new Scanner(System.in);


        int n = s.nextInt();

       this.operations[n-1].oper(db , account);

       
    }

}
