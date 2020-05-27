package observer;

import java.util.ArrayList;

/**
 * 抽象目标类
 * Create by tachai on 2020-05-27 20:49
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class MySubject {
    protected ArrayList observers = new ArrayList<>();

    // 注册方法
    public void attach(MyObserver observer){
        observers.add(observer);
    }
    // 注销方法
    public void detach(MyObserver observer){
        observers.remove(observer);
    }

    // 抽象通知方法
    public abstract void cry();

}
