package AOPdemo.aspect.Order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(1)
public class CloudLogAsyncAspect {

    @Before("AOPdemo.aspect.Order.AOPExpressions.forDAOPackageNoGetterSetter()")
    public void logToCloudAsync(){
        System.out.println("\n Logging to Cloud in async fashion");
    }
}