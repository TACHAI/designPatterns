package intermediary;

/**
 * 具体同事类
 * Create by tachai on 2020-05-27 08:38
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class CommonMember extends Member {
    public CommonMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("普通会员发送信息：");
        // 发送文本
        chartroom.sendText(name,to,message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通会员不能发送图片！");
    }
}
