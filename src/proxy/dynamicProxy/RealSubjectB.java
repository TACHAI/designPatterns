package proxy.dynamicProxy;

/**
 * 真实角色b
 * Create by tachai on 2020-05-22 08:41
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class RealSubjectB implements AbstractSubject {
    @Override
    public void request() {
        System.out.println("真实主题B！");
    }
}
