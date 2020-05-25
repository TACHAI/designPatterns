package command;

/**
 * Create by tachai on 2020-05-25 09:10
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        CalculatorForm form = new CalculatorForm();
        AbstractCommand command;
        command= new ConcreteCommand();
        form.setCommand(command);

        form.compute(10);
        form.compute(5);
        form.compute(10);
        form.undo();
    }
}
