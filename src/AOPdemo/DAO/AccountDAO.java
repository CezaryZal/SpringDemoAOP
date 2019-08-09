package AOPdemo.DAO;

import AOPdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
    private String name;
    private String serviceCode;

    public String getName() {
        System.out.println(getClass() + "in getName()");
        return name;
    }

    public void setName(String name) {
        System.out.println(getClass() + "in setName()");
        this.name = name;
    }

    public String getServiceCode() {
        System.out.println(getClass() + "in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        System.out.println(getClass() + "in setServiceCode()");
        this.serviceCode = serviceCode;
    }

    public void  addAccount(){
        System.out.println(getClass() + " Doing my db work: adding an account");
    }

    public void addAccount(Account account){
        System.out.println(getClass() + " Doing my db work: adding an account with object Account");
    }

    public String makeSomething(){
        System.out.println(getClass() + "made something else");
        return "It's done";
    }
}
