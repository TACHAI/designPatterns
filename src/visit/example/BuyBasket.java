package visit.example;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Create by tachai on 2020-05-29 13:08
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class BuyBasket {
    private ArrayList list = new ArrayList<String>();
    public void accept(Visitor visitor){
        Iterator i = list.iterator();
        while (i.hasNext()){
            ((Product)i.next()).accept(visitor);
        }
    }

    public void addProcuct(Product product){
        list.add(product);
    }

    public void remove(Product product){
        list.remove(product);
    }
}
