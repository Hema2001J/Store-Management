import java.util.Scanner;

public class addItems implements IoOperation {

    public void oper( Database db ,Account account){

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Items id : ");
        int id = s.nextInt();

        System.out.println("Enter the name : ");
        String name  = s.next();

        System.out.println("Enter the price : ");
        double price = s.nextDouble();

        System.out.println("Enter the qty :");
        int qty = s.nextInt();

        Items item = new Items(id, name, price,qty);
        item.setPrice(price * qty);

        db.addItems(item);

        System.out.println("Items are added sucessfully........");

        account.menu(db, account);


        

    }
    
}
