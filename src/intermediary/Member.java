package intermediary;

/** 抽象同事类
 * Create by tachai on 2020-05-27 08:19
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class Member {

    protected AbstractChatroom chartroom;

    protected String name;

    public Member(String name){
        this.name=name;
    }


    public AbstractChatroom getChartroom() {
        return chartroom;
    }

    public void setChartroom(AbstractChatroom chartroom) {
        this.chartroom = chartroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public abstract void sendText(String to,String message);

    public abstract void sendImage(String to,String image);

    public void  receviceText(String from,String message){
        System.out.println(from+"发送文本给"+this.name+"，内容为："+message);
    }

    public void receiveImage(String from,String image){
        System.out.println(from+"发送图片给"+this.name+",内容为："+image);
    }


}
