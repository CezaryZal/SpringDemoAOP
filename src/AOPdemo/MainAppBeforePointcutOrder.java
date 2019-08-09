package AOPdemo;

import AOPdemo.DAO.AccountDAO;
import AOPdemo.DAO.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAppBeforePointcutOrder {
    public static void main (String [] args){

        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        //get the bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO memberDAO = context.getBean("membershipDAO", MembershipDAO.class);

        Account account = new Account();

        accountDAO.addAccount(account);
        accountDAO.addAccount();

//        String text = "New text";
//        memberDAO.addAccount(text);

        accountDAO.setName("TOM");
        accountDAO.setServiceCode("Rudy");
        String name = accountDAO.getName();
        String serviceCode = accountDAO.getServiceCode();


        accountDAO.makeSomething();
        memberDAO.goToSleep();

        context.close();
    }
}
