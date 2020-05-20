package outward;

/** 外观模式 子系统类
 * Create by tachai on 2020-05-20 19:59
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Light {
    private String position;
    public Light(String position){
        this.position=position;
    }
    public void on(){
        System.out.println(this.position+"灯打开");
    }
    public void off(){
        System.out.println(this.position+"灯关闭");
    }
}
