package strategy;

/**
 * Create by tachai on 2020-05-28 20:58
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        AbstractStrategy strategy;
        strategy = new ConcreateStrategyA();
        context.setStrategy(strategy);
        context.algorithm();
    }
}
