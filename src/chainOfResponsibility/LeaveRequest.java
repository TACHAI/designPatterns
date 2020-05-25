package chainOfResponsibility;

/**
 *
 * 请求者
 * Create by tachai on 2020-05-25 08:05
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class LeaveRequest {
    private String leaveName;

    private int leaveDays;

    public LeaveRequest(String leaveName,int leaveDays){
        this.leaveDays=leaveDays;
        this.leaveName=leaveName;
    }

    public void setLeaveName(String leaveName){
        this.leaveName=leaveName;
    }

    public void setLeaveDays(int leaveDays){
        this.leaveDays=leaveDays;
    }

    public String getLeaveName() {
        return leaveName;
    }

    public int getLeaveDays() {
        return leaveDays;
    }
}
