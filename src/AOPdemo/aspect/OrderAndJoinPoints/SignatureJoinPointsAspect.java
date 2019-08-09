package AOPdemo.aspect.OrderAndJoinPoints;

import AOPdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class SignatureJoinPointsAspect {

    @Before("AOPdemo.aspect.OrderAndJoinPoints.AOPExpressions.forDAOPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint){
        System.out.println("\n Executing method beforeAddAccount from JoinPointsAspect class");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method: " + methodSignature);

        Object [] args = joinPoint.getArgs();

        for(Object tempArg : args){
            System.out.println(tempArg);

            if (tempArg instanceof Account){
                Account account = (Account) tempArg;
                System.out.println("account name: " + account.getName());
                System.out.println("account name: " + account.getLevel());
            }
        }


    }


}
