package state.easyExample;

/**
 * Create by tachai on 2020-05-28 17:22
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class OffState extends State {
    @Override
    public void on(Switch s) {
        System.out.println("打开");
    }

    @Override
    public void off(Switch s) {
        System.out.println("已经关闭");
    }
}
