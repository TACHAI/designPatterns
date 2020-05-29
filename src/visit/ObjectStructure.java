package visit;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Create by tachai on 2020-05-29 12:58
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class ObjectStructure {
    private ArrayList list = new ArrayList();

    public void accept(Visitor visitor){
        Iterator i = list.iterator();
        while (i.hasNext()){
            ((Element)i.next()).accept(visitor);
        }
    }


    public void addElement(Element element){
        list.add(element);
    }

    public void removeElement(Element element){
        list.remove(element);
    }
}
