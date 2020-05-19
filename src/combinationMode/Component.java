package combinationMode;

/**
 * 组合模式  抽象构件
 * Create by tachai on 2020-05-19 20:45
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class Component {

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract Component getChild(int i);
    public abstract void operation();
}
