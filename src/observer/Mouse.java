package observer;

/**
 * Create by tachai on 2020-05-27 20:56
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Mouse implements MyObserver {
    @Override
    public void response() {
        System.out.println("老鼠拼命跑");
    }
}
