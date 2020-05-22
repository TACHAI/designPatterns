package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * Create by tachai on 2020-05-22 08:42
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class DynamicProxy implements InvocationHandler {


    private Object object;

    public DynamicProxy(Object object){
        this.object=object;
    }


    // 实现invoke()方法，调用在真实主题类中定义的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        preRequest();
        method.invoke(object,args);
        postRequest();

        return null;
    }

    public void preRequest(){
        System.out.println("调用之前");
    }
    public void postRequest(){
        System.out.println("调用之后");
    }
}
