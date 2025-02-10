import java.util.Scanner;

public class editItems implements IoOperation{

    public void oper( Database db ,Account account){

        
          Scanner s = new Scanner(System.in);

        System.out.println("Enter the Item name :");
        String name = s.next();

        int i = db.searchItems(name);

        if (i > -1) {
            Items item = db.getItems(i);
            System.out.println("Enter the qty :");
            int qty = s.nextInt();
            System.out.println("Enter the price : ");
            double price = s.nextDouble();
            item.setQty(qty);
            item.setPrice(qty * price);
            
            System.out.println("Edied sucessfully ..");
            
        }

       account.menu(db, account);


    }
    
    
}
