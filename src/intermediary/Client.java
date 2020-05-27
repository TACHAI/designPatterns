package intermediary;

/**
 * Create by tachai on 2020-05-27 08:49
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        AbstractChatroom happyChat = new ChatGroup();

        Member member1,member2,member3,member4;
        member1=new DiamondMember("张三");
        member2 = new DiamondMember("李四");
        member3 = new CommonMember("小芳");
        member4 = new CommonMember("小红");

        happyChat.register(member1);
        happyChat.register(member2);
        happyChat.register(member3);
        happyChat.register(member4);

        member1.sendText("李四","李四，你好");
        member2.sendText("张三","张三你好");

        member3.sendImage("小红","今天的自拍很漂亮");
        member4.sendImage("小芳","自拍");

    }
}
