package Interpreter.ex;

/**
 * 抽象非终结符表达式类（符号节点类）
 * Create by tachai on 2020-05-25 21:25
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class SymbolNode implements Node{
    protected Node left;
    protected Node right;

    public SymbolNode(Node left,Node right){
        this.left=left;
        this.right=right;
    }
}
