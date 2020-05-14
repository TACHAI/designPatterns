package singleton;

/**
 * 懒汉模式 双重检查锁
 * 例子系统要求提供唯一的一个序列号生成器
 * Create by tachai on 2020-05-14 20:48
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class LazyMan {

    private String name;

    private LazyMan(){
        this.name = "张三";
    }

    private volatile LazyMan instance = null;



    public synchronized LazyMan getIntance(){

        if(instance==null){
            synchronized (LazyMan.class){
                if(instance==null){
                    instance = new LazyMan();
                }
            }
        }
        return instance;
    }
}
