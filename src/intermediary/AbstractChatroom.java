package intermediary;

/**
 * 抽象中介类
 * Create by tachai on 2020-05-27 08:18
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public abstract class AbstractChatroom {
    public abstract void register(Member member);

    public abstract void sendText(String from,String to,String message);

    public abstract void sendImage(String from,String to,String image);
}
