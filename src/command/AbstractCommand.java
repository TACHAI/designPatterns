package command;

/**
 * Create by tachai on 2020-05-25 09:01
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class AbstractCommand {
    public abstract  int execute(int value);
    public abstract int undo();
}
