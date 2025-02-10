import java.util.ArrayList;

public class Database {

    ArrayList<Account> accounts = new ArrayList<>();
    ArrayList<Items> items = new ArrayList<>();
   
    


  

    public void addAccounts(Account account){
         accounts.add(account);
    }

    public int login(String email , String password){
        int i = -1;
        for(Account a : accounts){
            if(a.getEmail().matches(email) && a.getPassword().matches(password)){
                i = accounts.indexOf(a);
                break;
            }
        }
        return i;
    }

    public Account getAccount(int i){
        return accounts.get(i);
    }


    public void addItems(Items item){
        items.add(item);
    }

    public int searchItems(String itemsName){
          
        int i = -1;
        for(Items item : items){
            if (item.name.equals(itemsName)) {
                i = items.indexOf(item);
            
            }
        }
        return i;
    }

    public Items getItems(int i){
       return  items.get(i);
    }

    public void deleteItem(Items item){
        items.remove(item);
    }

    
}