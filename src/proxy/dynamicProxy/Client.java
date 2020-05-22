package proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Create by tachai on 2020-05-22 08:50
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        InvocationHandler handler = null;
        AbstractSubject subject = null;
        handler = new DynamicProxy(new RealSubjectA());
        subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),new Class[]{AbstractSubject.class},handler);
        subject.request();

        System.out.println("--------------------------------------");

        handler = new DynamicProxy(new RealSubjectB());
        subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),new Class[]{AbstractSubject.class},handler);
        subject.request();

    }
}
