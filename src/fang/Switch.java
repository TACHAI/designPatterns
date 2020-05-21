package fang;

/**
 * Create by tachai on 2020-05-21 20:20
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Switch implements NetworkDevice {

    private String type;

    public Switch(String type){
        this.type=type;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use() {
        System.out.println("Linked by switch,type is"+this.type);
    }
}
