package command;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 * Create by tachai on 2020-05-25 09:02
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class ConcreteCommand extends AbstractCommand {
    private Adder adder = new Adder();
    private  int value;
    @Override
    public int execute(int value) {
        this.value=value;
        return adder.add(value);
    }

    @Override
    public int undo() {
        return adder.add(-value);
    }
}
