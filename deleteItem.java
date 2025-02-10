import java.util.Scanner;

public class deleteItem implements IoOperation{

    public void oper( Database db ,Account account){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Item name :");
        String name = s.next();

        int i = db.searchItems(name);

        if (i > -1) {
            Items item = db.getItems(i);
            db.deleteItem(item);
            System.out.println("Items deleted sucessfully......");
        }

       account.menu(db, account);

    }
    
    
}
