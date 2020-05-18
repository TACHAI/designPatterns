package bridging;

/**
 * Create by tachai on 2020-05-18 21:28
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class Pen {
    protected Color color;
    public void setColor(Color color){
        this.color=color;
    }

    public abstract void draw(String name);
}
