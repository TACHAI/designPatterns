package state;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 具体状态类
 * Create by tachai on 2020-05-28 16:34
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class HighState extends AbstractState {
    public HighState(AbstractState state){
        this.acc=state.acc;
        this.point=state.point;
        this.stateName=state.stateName;
    }

    @Override
    public void writeNote(int score){
        System.out.println(acc.getName()+"发布留言"+"，增加"+score+"*2个积分");
        this.point+=score*2;
        checkState(score);
        System.out.println("剩余积分为："+this.point+",当前结巴为"+acc.getState().stateName+".");
    }
    public void downLoadFile(int score){
        System.out.println(acc.getName()+"下载文件，扣除"+score+"/2积分");
        this.point-=score/2;
        checkState(score);
        System.out.println("剩余积分为："+this.point+"，当前等级为:"+acc.getState().stateName+".");
    }

    @Override
    public void checkState(int score) {
        if(point<0){
            System.out.println("余额不足，文件下载失败！");
            this.point+=score;
        }else if(point<=100){
            acc.setState(new PrimaryState(this));
        }else if(point<=1000){
            acc.setState(new MiddleState(this));
        }

    }
}
