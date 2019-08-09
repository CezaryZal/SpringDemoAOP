package AOPdemo.DAO;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addAccount(){
        System.out.println(getClass() + " Dong stuff: add a membership account");
    }
}
