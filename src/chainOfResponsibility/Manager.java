package chainOfResponsibility;

/**
 * Create by tachai on 2020-05-25 08:17
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Manager extends Leader {
    protected Manager(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<10){
            System.out.println("经理"+name+"审批员工"+leaveRequest.getLeaveName()+"请假天数为"+leaveRequest.getLeaveDays());
        }else {
            if(this.successor!=null){
                this.successor.handleRequest(leaveRequest);
            }
        }
    }
}
