package intermediary;

import java.util.Hashtable;

/**
 * 具体中介类
 * Create by tachai on 2020-05-27 08:26
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class ChatGroup extends AbstractChatroom {

    private Hashtable members = new Hashtable();

    @Override
    public void register(Member member) {
        if(!members.containsKey(member.getName())){
            members.put(member.getName(),member);
            member.setChartroom(this);
        }
    }

    @Override
    public void sendText(String from, String to, String message) {
        Member member= (Member) members.get(to);
        String newMessage = message;
        //模拟不雅字符过滤
        newMessage = message.replace("日","*");
        member.receviceText(from,newMessage);
    }

    @Override
    public void sendImage(String from, String to, String image) {
        Member member= (Member) members.get(to);
        // 模拟图片大小判断
        if(image.length()>5){
            System.out.println("图片太大，发送失败！");
        }else {
            member.receiveImage(from,image);
        }

    }
}
