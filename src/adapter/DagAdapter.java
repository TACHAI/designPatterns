package adapter;

/**
 * Create by tachai on 2020-05-18 21:01
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class DagAdapter extends Dog implements Robot {
    @Override
    public void cry() {
        System.out.println("机器人模仿");
        super.wang();
    }

    @Override
    public void move() {
        System.out.println("机器人模仿");
        super.run();

    }
}
