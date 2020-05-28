package state.easyExample;

/**
 * 环境类
 * Create by tachai on 2020-05-28 17:04
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Switch {

    private static State state,onState,offState;
    private String name;
    public Switch(String name){
        this.name=name;
        onState=new OnState();
        offState= new OffState();
        state=onState;
    }
    public void setState(State state){
        Switch.state =state;
    }

    public void on(){
        System.out.println(name);
        state.on(this);
    }

    //关
    public void off(){
        System.out.println(name);
        state.off(this);
    }

    public static State getState(String type){
        if(type.equals("on")){
            return onState;
        }
        else {
            return offState;
        }
    }
}
