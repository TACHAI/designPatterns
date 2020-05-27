package observer;

/**
 * Create by tachai on 2020-05-27 20:53
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Cat extends MySubject {
    @Override
    public void cry() {
        System.out.println("猫叫");
        System.out.println("-----------");
        for(Object obs:observers){
            ((MyObserver) obs).response();
        }
    }
}
