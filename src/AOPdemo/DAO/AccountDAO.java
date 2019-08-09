package AOPdemo.DAO;

import AOPdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void  addAccount(){
        System.out.println(getClass() + " Doing my db work: adding an account");
    }

    public void addAccount(Account account){
        System.out.println(getClass() + " Doing my db work: adding an account with object Account");
    }
}
