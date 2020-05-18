package bridging;

/**
 * Create by tachai on 2020-05-18 21:29
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class BigPen extends Pen {
    @Override
    public void draw(String name) {
        String penType ="大号毛笔绘制";
        this.color.bepaint(penType,name);
    }
}
