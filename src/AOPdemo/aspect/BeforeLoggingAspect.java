package AOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BeforeLoggingAspect {

    //this is where we add all of our related advices for logging
    //@Before("execution(|Modifier|Return type|Method())

    //To see advice in all class with method 'addAccount()'
//    @Before("execution(public void addAccount())")

    //To see advice in specific method (for a path)
//    @Before("execution(public void AOPdemo.DAO.AccountDAO.addAccount())")

    //To see all method start work 'add...'
//    @Before("execution(public void add*())")

    //To see all method start work 'add...', whatever what is the return type
//    @Before("execution(public * add*())")

    //To see all method start work 'add...', whatever what is the return type BUT method with the One variables/param
    //In this example ONE object Account
//    @Before("execution(public * add*(AOPdemo.Account))")

    //To see all method start work 'add...', whatever what is the return type BUT method with some variables/params
    //In this example object Account and something else (any number of argument)
//    @Before("execution(public * add*(AOPdemo.Account, ..))")

    //To see all method start work 'add...', whatever what is the return type BUT method with some or anyone variables/params
    //In this example any number of argument (also 0)
//    @Before("execution(public * add*(..))")

    //To see all method in AOPdemo.DAO package (all classes) with some or anyone params
    //"exec.(Return type|  package  |C|m|(Params))")
    @Before("execution(* AOPdemo.DAO.*.*(..))")
    public void beforeAddAccountAdvice(){

        System.out.println("\n Executing @Before advice on addAccount()");
    }
}
