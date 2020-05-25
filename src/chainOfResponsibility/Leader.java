package chainOfResponsibility;

/**
 * 抽象处理者
 * Create by tachai on 2020-05-25 08:08
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class Leader {

    protected String name;

    protected Leader successor;

    protected Leader(String name){
        this.name=name;
    }

    public void setSuccessor(Leader successor){
        this.successor=successor;
    }

    public abstract void handleRequest(LeaveRequest leaveRequest);
}
