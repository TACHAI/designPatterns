package singleton;

/**
 * 恶汉模式
 * Create by tachai on 2020-05-14 20:52
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Villain {
    private static Villain instance = null;


    private Villain(){

    }

    static {
        instance = new Villain();
    }

    private Villain getInstance(){
        return instance;
    }


}
