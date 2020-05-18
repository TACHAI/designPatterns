package bridging;

/**
 * Create by tachai on 2020-05-18 21:37
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        Color color;
        Pen pen;
        color = new Black();
        pen = new MiddlePen();
        pen.setColor(color);
        pen.draw("鲜花");
    }

}
