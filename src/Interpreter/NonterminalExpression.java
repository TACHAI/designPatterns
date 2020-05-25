package Interpreter;

import org.w3c.dom.Node;


/**
 * Create by tachai on 2020-05-25 21:17
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class NonterminalExpression extends AbstractExpression {
    private AbstractExpression left;
    private AbstractExpression right;



    public NonterminalExpression(AbstractExpression left,AbstractExpression right){
        this.left=left;
        this.right=right;
    }

    @Override
    public void interpret(Context ctx) {
        //递归调用每一个组成部分的interpret()方法
        //在递归调用时指定组成部分的连接方式，即非终结符的功能
    }
}
