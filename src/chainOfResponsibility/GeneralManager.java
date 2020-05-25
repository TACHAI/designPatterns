package chainOfResponsibility;

/**
 * Create by tachai on 2020-05-25 08:20
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class GeneralManager extends Leader {
    protected GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<30){
            System.out.println("总经理"+name+"审批员工"+leaveRequest.getLeaveName()+"的请假条，请假天数为"+leaveRequest.getLeaveDays());
        }else {
            System.out.println(leaveRequest.getLeaveName()+"不能请假");
        }
    }
}
