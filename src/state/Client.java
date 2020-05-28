package state;

/**
 *
 * Create by tachai on 2020-05-28 16:51
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Client {
    public static void main(String[] args) {
        ForumAccount account= new ForumAccount("张三");
        account.writeNote(20);
        System.out.println("------------------------------");
        account.downloadFile(20);
        System.out.println("------------------------------");
        account.replyNote(100);
        System.out.println("------------------------------");
        account.writeNote(40);
        System.out.println("------------------------------");
        account.downloadFile(80);
        System.out.println("------------------------------");
    }
}
