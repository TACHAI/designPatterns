package state.easyExample;

/**
 * Create by tachai on 2020-05-28 17:26
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        Switch s1,s2;
        s1=new Switch("开关1");
        s2=new Switch("开关2");


        s1.on();
        s2.on();

        s1.off();
        s2.off();
        s2.on();
        s1.on();
    }
}
