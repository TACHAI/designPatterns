package bridging;

/**
 * Create by tachai on 2020-05-18 21:26
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Read implements Color {
    @Override
    public void bepaint(String penType, String name) {
        System.out.println(
                penType+"红色的"+name+"."
        );
    }
}
