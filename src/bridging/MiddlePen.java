package bridging;

/**
 * Create by tachai on 2020-05-18 21:31
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class MiddlePen extends Pen {

    @Override
    public void draw(String name) {
        String penType = "中号毛笔绘制";
        this.color.bepaint(penType,name);
    }
}
