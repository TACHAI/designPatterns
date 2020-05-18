package bridging;

/**
 * Create by tachai on 2020-05-18 21:27
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Black implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(penType+"黑色的"+name+"。");
    }
}
