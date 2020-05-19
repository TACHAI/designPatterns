package combinationMode;

/**
 * 叶子构件
 * Create by tachai on 2020-05-19 20:50
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Leaf extends Component {


    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("工作");
    }
}
