public class showMenu implements IoOperation{

    public void oper( Database db ,Account account){

        for(Items item : db.items){
            System.out.println("id : "+item.id+" Name : "+item.name+" Qty :"+item.qty+" Price :"+item.price);
        }

        account.menu(db, account);

    }
    
    
}
