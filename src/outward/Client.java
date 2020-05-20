package outward;

/**
 * Create by tachai on 2020-05-20 20:16
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        GeneralSwitchFacade gsf = new GeneralSwitchFacade();
        gsf.on();
        System.out.println("-----------------------------");
        gsf.off();
    }
}
