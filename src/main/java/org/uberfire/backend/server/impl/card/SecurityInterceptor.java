package org.uberfire.backend.server.impl.card;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Secure
public class SecurityInterceptor {

    @AroundInvoke
    public Object manageSecurity(InvocationContext ctx)throws Exception{
        System.out.println("handle security");
        return ctx.proceed();
    }
}
