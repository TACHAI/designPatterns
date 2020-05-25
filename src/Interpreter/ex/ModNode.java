package Interpreter.ex;

/**
 * 非终结符表达式类（求模节点类）
 * Create by tachai on 2020-05-25 21:31
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class ModNode extends SymbolNode {
    public ModNode(Node left, Node right) {
        super(left, right);
    }

    @Override
    public int interpret() {
        return super.left.interpret()%super.right.interpret();
    }
}
