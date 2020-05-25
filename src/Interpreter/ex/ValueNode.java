package Interpreter.ex;

/**
 * 终结符表达式（值节点类）
 * Create by tachai on 2020-05-25 21:23
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class ValueNode implements Node {

    private int value;


    public ValueNode(int value){
        this.value=value;
    }

    @Override
    public int interpret() {
        return this.value;
    }
}
