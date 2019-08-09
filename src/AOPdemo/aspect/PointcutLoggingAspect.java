package AOPdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PointcutLoggingAspect {

    @Pointcut("execution(* AOPdemo.DAO.*.*(..))")
    private void forDAOPackage(){}

    @Pointcut("execution(* AOPdemo.DAO.*.get*(..))")
    private void getter(){}

    @Pointcut("execution(* AOPdemo.DAO.*.set*(..))")
    private void setter(){}

    @Pointcut("forDAOPackage() && !(getter() || setter())")
    private void forDAOPackageNoGetterSetter(){
    }

    @Before("forDAOPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n Executing @Before advice on addAccount()");
    }



    //    @Before("forDAOPackage()")
//    public void performApiAnalytics(){
//        System.out.println("\n Performing API analytics");
//    }

    //This method works as above
//    @Before("forDAOPackage()")
//    public void performApiAnalytics(){
//        System.out.println("\n Performing API analytics");
//    }
}
