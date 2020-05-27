package intermediary;

/**
 * 具体同事类
 * Create by tachai on 2020-05-27 08:46
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class DiamondMember extends Member {

    public DiamondMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("砖石会员发送消息");
        chartroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("砖石会员发送图片");
        chartroom.sendImage(name,to,image);
    }
}
