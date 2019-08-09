package AOPdemo;

import AOPdemo.DAO.AccountDAO;
import AOPdemo.DAO.MembershipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {
    public static void main (String [] args){

        //read spring config java class
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        //get the bean from spring container
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        MembershipDAO memberDAO = context.getBean("membershipDAO", MembershipDAO.class);

        accountDAO.addAccount();
        memberDAO.addAccount();

        context.close();
    }
}
