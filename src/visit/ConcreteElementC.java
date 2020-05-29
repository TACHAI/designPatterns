package visit;

/**
 * Create by tachai on 2020-05-29 12:56
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class ConcreteElementC implements Element {
    @Override
    public void accept(Visitor visitor) {
      visitor.visit(this);
    }

    public void operationC(){
        //业务方法；
    }
}
