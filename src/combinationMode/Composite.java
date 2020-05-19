package combinationMode;

import java.util.ArrayList;

/**
 * 容器构件
 * Create by tachai on 2020-05-19 20:51
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Composite extends Component {

    private ArrayList list = new ArrayList<String>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    @Override
    public void operation() {
            for(Object obj:list){
                ((Component)obj).operation();
            }
    }
}
