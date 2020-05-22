package proxy;

/**
 * Create by tachai on 2020-05-21 21:05
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Proxy  {
    private RealSubject realSubject = new RealSubject();
    public void preRequest(){

    }

    public void request(){
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void postRequest(){

    }
}
