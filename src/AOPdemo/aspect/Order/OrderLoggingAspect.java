package AOPdemo.aspect.Order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class OrderLoggingAspect {

    @Before("AOPdemo.aspect.Order.AOPExpressions.forDAOPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n Executing method beforeAddAccount from OrderAspect class");
    }


}
