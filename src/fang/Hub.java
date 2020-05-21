package fang;

/**
 * Create by tachai on 2020-05-21 20:24
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Hub implements NetworkDevice {

    private String type;

    public Hub(String type){
        this.type=type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by Hub,type is"+this.type);
    }
}
