package strategy;

/**
 * 环境类
 * Create by tachai on 2020-05-28 20:43
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Context {

    private AbstractStrategy strategy;

    public void setStrategy(AbstractStrategy strategy){
        this.strategy=strategy;
    }

    public void algorithm(){
//        if(type=="strategyA"){
//            //算法A
//        }else if(type=="strategyB"){
//            //算法B
//        }else if(type=="strategyC"){
//            //算法C
//        }

        strategy.algorithm();
    }
}
