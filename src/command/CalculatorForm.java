package command;

/**
 * Create by tachai on 2020-05-25 09:07
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class CalculatorForm {
    private AbstractCommand command;

    public void setCommand(AbstractCommand command){
        this.command=command;
    }
    public void compute(int value){
        int i = command.execute(value);
        System.out.println("执行运算，运算结果为："+i);
    }

    public void undo(){
        int i=command.undo();
        System.out.println("执行撤销，运算结果为："+i);
    }
}
