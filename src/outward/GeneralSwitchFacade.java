package outward;

/**
 * 外观类
 * Create by tachai on 2020-05-20 20:07
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class GeneralSwitchFacade {
    private Light lights[] = new Light[4];
    private Fan fan;
    private AirConditioner ac;
    private Television tv;

    public GeneralSwitchFacade(){
        lights[0]=new Light("左前");
        lights[1]=new Light("右前");
        lights[2]=new Light("左前");

        fan = new Fan();
        ac = new AirConditioner();
        tv = new Television();

    }

    public void on(){
        lights[0].on();
        lights[1].on();
        lights[2].on();

        fan.on();
        ac.on();
        tv.on();
    }

    public void off(){
        lights[0].off();
        lights[1].off();
        lights[2].off();
        fan.off();
        ac.off();
        tv.off();
    }
}
