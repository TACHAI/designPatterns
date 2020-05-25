package chainOfResponsibility;

/**
 * Create by tachai on 2020-05-25 08:12
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Director extends Leader {
    protected Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LeaveRequest leaveRequest) {
        if(leaveRequest.getLeaveDays()<3){
            System.out.println("主任"+name+"审批员工"+leaveRequest.getLeaveName()+"的请假条，请假天数为"+leaveRequest.getLeaveDays()+"天");

        }else {
            // 传给上一级调用
            if(this.successor!=null){
                this.successor.handleRequest(leaveRequest);
            }
        }

    }
}
