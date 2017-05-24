package MetaDataBD;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 * Created by vov on 10.05.2017.
 */
public class DataInterceptor {
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
        System.out.println("print interceptor");
        return ic.proceed();
    }
}
