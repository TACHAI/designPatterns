package visit;

/**
 * Create by tachai on 2020-05-29 09:26
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class Visitor {
    public abstract void visit(ConcreteElementA elementA);
    public abstract void visit(ConcreteElementB elementB);

    public void visit(ConcreteElementC elementC){
        // 元素elementC操作代码
    }
}
